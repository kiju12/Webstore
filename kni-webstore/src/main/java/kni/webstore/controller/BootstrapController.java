package kni.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kni.webstore.repository.ExampleRepo;

@Controller
public class BootstrapController {
	
	@Autowired
	private ExampleRepo repo;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
    public String home(Model model){
		model.addAttribute("lista", repo.getList());
		
        return "bootstraphelloworld";
    }
    
	@RequestMapping(value="/test", method= RequestMethod.GET)
	public String test(Model model) {
		model.addAttribute("seed", repo);
		
		return "test";
	}
	
    @ResponseBody
    @RequestMapping(value="/greeting",method = RequestMethod.GET)
    public String Greeting(){
        return "Message From SpringBoot Service - Hello World!";
    }
}
