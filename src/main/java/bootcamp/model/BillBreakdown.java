package bootcamp.model;

import java.util.HashMap;
import java.util.Map;

public class BillBreakdown {
	
	private double unit1percentage;
	private double unit2percentage;
	private double unit3percentage;
	
	private Map<String, Double> billBreakdown = new HashMap<String, Double>();
	
	public BillBreakdown () {
		
	}
	
	public BillBreakdown (double unit1, double unit2, double unit3) {
		this.unit1percentage = unit1;
		this.unit2percentage = unit2;
		this.unit3percentage = unit3;
	}
	
	public Map<String,Double> getBillBreakdown(){
		billBreakdown.put("Unit 1", unit1percentage);
		billBreakdown.put("Unit 2", unit2percentage);
		billBreakdown.put("Unit 3", unit3percentage);
		
		return billBreakdown;
	}
	
	public void setUnit1Percentage(double percent) {
		this.unit1percentage = percent;
	}
	
	public void setUnit2Percentage(double percent) {
		unit2percentage = percent;
	}
	public void setUnit3Percentage(double percent) {
		unit3percentage = percent;
	}
	public double getUnit1Percentage() {
		System.out.println(unit1percentage);
		return unit1percentage;
	}
	

//    private final String propertyName;
//    private Map<String, Double> billBreakdown = new HashMap<String, Double>();
//    
//
//    public BillBreakdown(String propertyName, HashMap <String, Double> billBreakdown) {
//        
//    	this.propertyName = propertyName;
////        actuallyBreakDownBill(billBreakdown.get(propertyName));
//        
//    }
//    
//    public String getPropertyName() {
//    	return propertyName;
//    }
//
//    public Map <String, Double> getBillBreakdown() {
//        return billBreakdown;
//    }
    
//    public Map<String, Double> actuallyBreakDownBill(double total){
//    
//    	String[] units = {"a", "b" , "c"};
//    	double[] percentages = {.20, .75, .05};
//    	for(int i = 0; i < 3; i++) {
//    		 billBreakdown.put(units[i],(percentages[i] * total));
//    	}
//    	
//    	return billBreakdown;
//    }
//    mapOfBills.get(propertyName)
//	double total = 0.0;
//	for(Map<String, Double> i: mapOfBills.values()) {
//		total += i.values();
//	}
    
    
}
