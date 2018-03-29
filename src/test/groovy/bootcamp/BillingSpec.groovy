package bootcamp

//import bootcamp.dao.BillingDao
//import bootcamp.services.BillingService
//import bootcamp.services.MailingService
import spock.lang.Specification

class BillingSpec extends Specification {
//	
//	def "Get bill for a property name"(){
//		given: "a property name"
//		String propertyName = "Ashford";
//				
//		and: "a collection of bills in a billing service"
//		BillingService billingService = new BillingService();
//				
//		
//		when: "billing service retrieves bill from property name"
//		Double totalBill = billingService.getBillByPropertyName(propertyName);
//		
//		
//		then: "correct total bill is given"
//		totalBill == 20000.75;
//	}
//	
//	def "Assign address to bill"(){
//		given: "a property name, bill, and fake address" 
//		String propertyName = "Ashford";
//		BillingService billingService = new BillingService();
//		Double totalBill = billingService.getBillByPropertyName(propertyName);
//		
//		and: "an address object"
//		String address = ("123" + " " + "Cobb" + "\n" + "Smyrna"
//			 + ", " + "GA" + " " + "30080"); 
//
//		
//		when: "total bill is assigned to Mailing Address List"
//		MailingService mailingAddressService = new MailingService();
//		mailingAddressService.add(address, totalBill);
//		
//		then: "correct total bill is assigned to address"
//		mailingAddressService.getBillByAddress(address) == totalBill;
//		
//	}
//	
////	def "Get address obect from URL"(){
////		given: "a property name"
////		String propertyName = "Ashford";
////		
////		and: "an address API that always returns this address"
////		AddressAPI addressAPI = Stub(AddressAPI.class)
////		addressAPI.retrieveAddressFromPropertyName
////		
////		when:"address is retrieved with Address API class"
////		AddressAPI test = new AddressAPI();
////		
////		String test1 = test.retrieveAddressFromPropertyName(propertyName);
////		
////		then: "address is correct"
////		test1.equals("123 Baker Street");
////	}
}
