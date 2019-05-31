package net.koreate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/*")
public class ShopController {
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	/*@GetMapping(value = "/")
	public void GetMethod() {
		logger.info("GetMethod Called!!!");
	}

	@PostMapping(value = "/")
	public void PostMethod() {
		logger.info("PostMethod Called!!!");
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void GetMethod() {
		logger.info("GetMethod Called!!!");
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void PostMethod() {
		logger.info("PostMethod Called!!!");
	}*/
	
	@GetMapping(value = "/home")
	public void homeGetMethod() {
		logger.info("homeGetMethod Called!!!");
	}
	
}
