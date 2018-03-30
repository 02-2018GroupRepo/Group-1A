package bootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.dao.BillBreakdownDAO;
import bootcamp.model.BillBreakdown;

@Component
public class BillBreakdownService {

	@Autowired
	private BillBreakdownDAO billBreakdownDao;
	
	public BillBreakdown getBillBreakdownByPropertyName (String propertyName) {
	    return billBreakdownDao.getPropertyMapByName(propertyName);
	}
	
	public void addToDAOMap (String propertyName, BillBreakdown bbb){
	    billBreakdownDao.addToMap(propertyName,bbb);

	}
}
