package bootcamp.dao;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import bootcamp.model.BillBreakdown;

@Component
public class BillBreakdownDAO {
	
    private	Map<String, BillBreakdown> billBreakdownMap;

    @PostConstruct
	public void buildMap() {
    	billBreakdownMap = new HashMap<>();
		billBreakdownMap.put("Ashford", new BillBreakdown(0.25, 0.70, 0.05));
		billBreakdownMap.put("Tiny Creek", new BillBreakdown(0.15, 0.15, 0.70));
		billBreakdownMap.put("The Ritz", new BillBreakdown(0.25, 0.25, 0.50));
	}
	
//	public Map<String, BillBreakdown> getBillBreakdownMap(){
//		
//		return billBreakdownMap;
//	}

	public BillBreakdown getPropertyMapByName(String propertyName) {
		return billBreakdownMap.get(propertyName);
	}

}
