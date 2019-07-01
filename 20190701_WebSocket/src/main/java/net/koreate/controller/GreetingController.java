package net.koreate.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import net.koreate.vo.GreetingVo;
import net.koreate.vo.HelloMessageVo;

@Controller
public class GreetingController {
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public GreetingVo greeting(HelloMessageVo message) throws Exception {
		Thread.sleep(1000);
		return new GreetingVo("Hello, " + HtmlUtils.htmlEscape(message.getName()));
	}
	
}
