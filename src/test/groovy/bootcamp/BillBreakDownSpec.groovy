package bootcamp

import java.util.Map

import bootcamp.dao.BillBreakdownDAO
import bootcamp.model.BillBreakdown
import bootcamp.services.BillBreakdownService
import spock.lang.Specification


class BillBreakDownSpec extends Specification {
	
	def "Bill breakdown per unit"(){
		
		given:"a property name"
		String propertyName = "pineapple"
		
		and: "a fake Bill Breakdown"
		BillBreakdown sample = new BillBreakdown(0.90, 0.70, 0.05);
		
		and: "a bill breakdown service which is the class under test"
		BillBreakdownService service = new BillBreakdownService();
		
		and: "a bill breakdown DAO that always returns this fake bill breakdown"
		BillBreakdownDAO dao = Stub(BillBreakdownDAO.class);
		service.billBreakdownDao = dao
		dao.getPropertyMapByName() >> sample
		
		
		when:"a bill breakdown is requested"
		BillBreakdown sample2 = service.getBillBreakdownByPropertyName(propertyName);
		double result = sample2.getUnit1Percentage();
		
		then: " a bill breakdown is returned"
		
		sample2.getUnit1Percentage() == 0.90;
		
	}
	
//	def"testing the BillBreakdownDAO"(){
//		given: " a bill breakdown DAO"
//		BillBreakdownDAO dao = new BillBreakdownDAO();
//		
//		and: "A property name"
//		String propertyName = "Ashford";
//		
//		when: "bill breakdown map is accessed"
//		Map<String, BillBreakdown> map = dao.getBillBreakdownMap();
//		double result = map.get(propertyName).getUnit1Percentage();
//		
//		then: "unit 1 percent of Ashford bill breakdown is 0.25"
//		result == 0.25;
//		
//	}
}
