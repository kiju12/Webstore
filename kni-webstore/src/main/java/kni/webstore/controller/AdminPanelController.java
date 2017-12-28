package kni.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/panelAdmina")
public class AdminPanelController {
	@GetMapping
	public String wyswietlPanel() {
		return "panelAdmina";
	}
}
