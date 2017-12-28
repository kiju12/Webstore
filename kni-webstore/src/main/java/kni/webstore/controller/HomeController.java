package kni.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/zaloguj")
	public String zaloguj() {
		return "zaloguj";
	}
	
	@GetMapping("/userAccount")
	public String user() {
		return "user";
	}
    
}