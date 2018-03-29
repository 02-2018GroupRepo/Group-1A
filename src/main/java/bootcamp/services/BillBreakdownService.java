package bootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.dao.BillBreakdownDAO;
import bootcamp.model.BillBreakdown;

@Component
public class BillBreakdownService {
	
	//private Map<String, BillBreakdown> billBreakdownMap;
	
	@Autowired
	private BillBreakdownDAO billBreakdownDao;
	
	public BillBreakdown getBillBreakdownByPropertyName (String propertyName) {
		
		return billBreakdownDao.getPropertyMapByName(propertyName);//billBreakdownMap.get(propertyName);
	}
	
	
	
//	/////////////////////////////////////////////////////////////////
//	public BillBreakdownService(Map<String, BillBreakdown> bill) {
//		billBreakdownMap = bill;
//	}
//	//////////////////////////////////////////////////////////////////
	
	
	
	
	
	

}
