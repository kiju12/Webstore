package kni.webstore.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kni.webstore.model.User;
import kni.webstore.service.UserService;
import kni.webstore.validate.UserRegistrationValidator;


@Controller
@RequestMapping("/rejestracja")
public class UserRegistrationController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public UserRegistrationValidator userValidator() {
		return new UserRegistrationValidator();
	}
	
	@GetMapping
	public String rejestracja() {
		return "rejestracja";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationValidator userValiadator, BindingResult bindingResult) {
		User existing = userService.findByEmail(userValiadator.getEmail());
		if (existing != null) {
			bindingResult.rejectValue("email", null, "Uzytkownik o podanym mailu juz istnieje!");
		}
		
		if (bindingResult.hasErrors()) {
			return "rejestracja";
		}
		
		userService.save(userValiadator);
		return "redirect:/rejestracja?sukces";
	}
}
