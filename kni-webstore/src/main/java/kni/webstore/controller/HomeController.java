package kni.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kni.webstore.model.Product;

@Controller
public class HomeController {

	@GetMapping(value="/")
	public String home(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}
    
}