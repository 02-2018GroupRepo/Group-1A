package bootcamp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import bootcamp.model.BillBreakdown;
import bootcamp.services.BillBreakdownService;

import java.util.Map;


@RestController
public class BillBreakdownController {

	@Autowired
	private BillBreakdownService bbs;

    @RequestMapping("/billBreakdown")
    public Map<String, Double> billBreakdown(@RequestParam(value="propertyName", defaultValue="Pickles are my favorite") String propertyName) {
     
    	return bbs.getBillBreakdownByPropertyName(propertyName).getBillBreakdown();
    	
    }

    @RequestMapping("/billBreakdown1")
    public BillBreakdown billBreakdown1() {
        BillBreakdown bb = new BillBreakdown(0.4,0.6,0.1);
        return bb;

    }

    @RequestMapping (name="/addBillBreakdown",method= RequestMethod.POST)
    public Map<String, Double> billBreakdownMethod (@RequestBody BillBreakdown bb, @RequestParam(value = "propertyName") String propertyName){
        BillBreakdown bb2 = bb;
        bbs.addToDAOMap(propertyName,bb2);
        return bb2.getBillBreakdown();

    }
}
