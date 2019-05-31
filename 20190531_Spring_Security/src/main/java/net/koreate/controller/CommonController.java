package net.koreate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
	
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
	
	@GetMapping(value = "/accessError")
	public void accessErrorGetMethod(Authentication auth, Model model) {
		logger.info("accessErrorGetMethod Called!!!");
		logger.warn("access Denied : " + auth);
		model.addAttribute("msg", "Access Denied");
	}
	
}
