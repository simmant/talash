package com.bhole.talash;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class TalashSearchAPI {
	ProductDao dao = new ProductDao();
	
	@RequestMapping(value = "/getbrand", method = RequestMethod.GET)
	public @ResponseBody Product getBrand(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
		return dao.getBrand(name);
	}

	@RequestMapping(value = "/getbrands", method = RequestMethod.GET)
	public @ResponseBody Products getBrands(@RequestParam(name = "brandName", required = false, defaultValue = "Stranger") String brandName) {
		return dao.getBrands(brandName);
	}
	
	@RequestMapping(value = "/getprices", method = RequestMethod.GET)
	public @ResponseBody Products getPrices(@RequestParam(name = "price", required = false, defaultValue = "Stranger") String price) {
		return dao.getPrice(price);
	}
	
	@RequestMapping(value = "/getcolors", method = RequestMethod.GET)
	public @ResponseBody Products getColors(@RequestParam(name = "color", required = false, defaultValue = "Stranger") String color) {
		return dao.getColor(color);
	}
	
	@RequestMapping(value = "/getsizes", method = RequestMethod.GET)
	public @ResponseBody Products getSizes(@RequestParam(name = "size", required = false, defaultValue = "Stranger") String size) {
		return dao.getSize(size);
	}
	
}
