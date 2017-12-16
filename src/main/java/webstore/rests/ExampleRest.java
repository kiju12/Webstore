package webstore.rests;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webstore.domain.ExamplePerson;

@RestController
public class ExampleRest {
	
	
	
	@RequestMapping("/rests/example")
	public ExamplePerson kijko() {
		ExamplePerson kijko = new ExamplePerson("Maciej", "Kijko", 21);
		
		return kijko;
	}
	
	@RequestMapping("/rests/example2")
	public ExamplePerson kononowicz() {
		ExamplePerson kijko = new ExamplePerson("Zbyszek", "Kononowicz", 66);
		
		return kijko;
	}
}
