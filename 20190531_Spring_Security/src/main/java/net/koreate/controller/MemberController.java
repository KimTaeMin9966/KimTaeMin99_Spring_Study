package net.koreate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
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
	
	@GetMapping(value = "/login")
	public void loginGetMethod(String error, String logout, Model model) {
		logger.info("loginGetMethod Called!!!");
		logger.info("error : " + error);
		logger.info("logout : " + logout);
		
		if (error != null) model.addAttribute("error", "로그인에 실패 하였습니다. 아이디나 비밀번호를 다시 확인 해주세요");
		
		if (logout != null) model.addAttribute("logout", "로그아웃이 성공적으로 이루어 졌습니다.");
	}
	
	@GetMapping(value = "/logout")
	public void logoutGetMethod() {
		logger.info("logoutGetMethod Called!!!");
	}
	
	@PostMapping(value = "/logout")
	public void logoutPostMethod() {
		logger.info("logoutPostMethod Called!!!");
	}
	
}
