package bootcamp

import bootcamp.dao.BillBreakdownDAO
import bootcamp.model.BillBreakdown
import bootcamp.services.BillBreakdownService
import spock.lang.Specification

class BillBreakDownSpec extends Specification {
	def "BillBreakdownDAO.buildMap returns map with expected values" () {
		given: "a bill breakdown DAO"
		BillBreakdownDAO dao = new BillBreakdownDAO()

		when: "buildMap method is called"
		dao.buildMap()
		Map<String, BillBreakdown> actualMap = dao.billBreakdownMap

		then: "the actual map is equal to the expected Unit 1 values"
		actualMap.get("Ashford").getBillBreakdown().get("Unit 1") == 0.25
		actualMap.get("Tiny Creek").getBillBreakdown().get("Unit 1") == 0.15
		actualMap.get("The Ritz").getBillBreakdown().get("Unit 1") == 0.25
	}
	
	def "BillBreakdownDAO.getPropertyMapByName returns expected breakdown" () {
		given: "a bill breakdown DAO"
		BillBreakdownDAO dao = new BillBreakdownDAO()

		and: "A property name"
		String propertyName = "Ashford"

		and: "map is created with buildMap method"
		dao.buildMap()

		when: "bill breakdown map is accessed"
		Map<String, Double> expectedBreakdown = new HashMap<String, Double>()
		expectedBreakdown.put("Unit 1", 0.25)
		expectedBreakdown.put("Unit 2", 0.70)
		expectedBreakdown.put("Unit 3", 0.05)
		Map<String, Double> actualBreakdown = dao.getPropertyMapByName(propertyName).getBillBreakdown()

		then: "the actual bill breakdown is equal to the expected bill breakdown"
		actualBreakdown == expectedBreakdown
	}

	def "BillBreakdownService.getBillBreakdownByPropertyName returns expected breakdown" () {
		given: "a property name"
		String propertyName = "pineapple"

		and: "a bill breakdown service which is the class under test"
		BillBreakdownService service = new BillBreakdownService()

		and: "a bill breakdown DAO that always returns this fake bill breakdown"
		BillBreakdownDAO dao = Stub(BillBreakdownDAO.class)
		dao.getPropertyMapByName(propertyName) >> new BillBreakdown(0.90, 0.70, 0.05)
		service.billBreakdownDao = dao

		when: "a bill breakdown is requested"
		Map<String, Double> expectedBreakdown = new HashMap<String, Double>()
		expectedBreakdown.put("Unit 1", 0.90)
		expectedBreakdown.put("Unit 2", 0.70)
		expectedBreakdown.put("Unit 3", 0.05)
		Map<String, Double> actualBreakdown = service.getBillBreakdownByPropertyName(propertyName).getBillBreakdown()

		then: "the actual bill breakdown is equal to the expected bill breakdown"
		actualBreakdown == expectedBreakdown
	}
}
