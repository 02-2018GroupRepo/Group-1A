package bootcamp.model;

import java.util.HashMap;
import java.util.Map;

public class BillBreakdown {

    private double unit1percentage;
    private double unit2percentage;
    private double unit3percentage;

    private Map<String, Double> billBreakdown = new HashMap<String, Double>();

    public void setBillBreakdown(Map<String, Double> billBreakdown) {
        this.billBreakdown = billBreakdown;
    }

    public void setUnit1percentage(double unit1percentage) {
        this.unit1percentage = unit1percentage;
    }

    public void setUnit2percentage(double unit2percentage) {
        this.unit2percentage = unit2percentage;
    }

    public void setUnit3percentage(double unit3percentage) {
        this.unit3percentage = unit3percentage;
    }

    public BillBreakdown(){

    }

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

    public double getUnit1percentage() {
        return unit1percentage;
    }

    public double getUnit2percentage() {
        return unit2percentage;
    }

    public double getUnit3percentage() {
        return unit3percentage;
    }
}
