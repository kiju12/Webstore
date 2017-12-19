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
		model.addAttribute("kijko", repo.getEx1());
		
        return "bootstraphelloworld";
    }
    
    @ResponseBody
    @RequestMapping(value="/greeting",method = RequestMethod.GET)
    public String Greeting(){
        return "Message From SpringBoot Service - Hello World!";
    }
}
