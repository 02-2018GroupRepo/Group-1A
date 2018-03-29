package bootcamp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.model.BillBreakdown;
import bootcamp.services.BillBreakdownService;


@RestController
public class BillBreakdownController {

	@Autowired
	private BillBreakdownService bbs;

    @RequestMapping("/billBreakdown")
    public BillBreakdown billBreakdown(@RequestParam(value="propertyName", defaultValue="Pickles are my favorite") String propertyName) {
     
    	return bbs.getBillBreakdownByPropertyName(propertyName);
    	
    }
}
