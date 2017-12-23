package kni.webstore.controller;

import java.util.Locale;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kni.webstore.model.Example;

@Controller
public class ThymeleafController {
	
	
	@Autowired
	private Example example; //Nasz obiekt przechowujacy informacje z formularza
	
	@Autowired
	private MessageSource mesProp; //Obiekt pobierajacy Stringi z messages.properties do kodu Java

	
	@GetMapping("/thymeleaf")
	public String getExample(Model model) {
		
		model.addAttribute("example", this.example);
		
		//hello.title jest zdefiniowane w message.properies i message_en_US.properties
		//Do plików html jest dodawane automatycznie uwzględniając lokalizacje użytkownika
		//Locale.ROOT to odnosnik do pliku messages.properties
		//Locale.US to odnosnik do pliku messages_en_US.properties
		model.addAttribute("title", mesProp.getMessage("hello.title", null, Locale.ROOT));
		model.addAttribute("titleUS", mesProp.getMessage("hello.title", null, Locale.US));
		
		return "thymeleaf/thymeleaf";
	}
	
	@PostMapping("/thymeleaf")		//Walidacja na podstawie adnotacji, zawartych w Example.class
	public String postExample(@ModelAttribute @Valid Example ex, BindingResult result) {
									//Obiekt BindingResult przechowuje informacje o błedach wynikajacych z walidacji
		
		
		if(result.hasErrors()) { //Jesli walidacja nie przeszla pomyslnie
			
			System.out.println("Pole nie spelnia wymagan adnotacji");
			return "thymeleaf/thymeleaf";
			
		} else { //Jesli przeszla pomyslnie
			this.example = ex;
			return "thymeleaf/thymeleaf";
		}
		
		
		
	}
	
	@GetMapping("/zmienne")
	public String zmienne(Model model) {
		
		model.addAttribute("example", this.example);
		
		return "thymeleaf/posted";
	}
	
	
}
