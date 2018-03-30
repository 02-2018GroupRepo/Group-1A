package bootcamp.dao;

import bootcamp.model.BillBreakdown;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

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

	public BillBreakdown getPropertyMapByName(String propertyName) {
		return billBreakdownMap.get(propertyName);
	}

}
