package bootcamp.model;

import java.util.HashMap;
import java.util.Map;

public class BillBreakdown {

    private double unit1percentage;
    private double unit2percentage;
    private double unit3percentage;

    private Map<String, Double> billBreakdown = new HashMap<String, Double>();

    public BillBreakdown(double unit1, double unit2, double unit3) {
        this.unit1percentage = unit1;
        this.unit2percentage = unit2;
        this.unit3percentage = unit3;
    }

    public Map<String, Double> getBillBreakdown() {
        billBreakdown.put("Unit 1", unit1percentage);
        billBreakdown.put("Unit 2", unit2percentage);
        billBreakdown.put("Unit 3", unit3percentage);

        return billBreakdown;
    }

}
