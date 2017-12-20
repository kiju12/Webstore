package kni.webstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kni.webstore.data.ProductRepository;
import kni.webstore.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	
	@PostMapping("/save")
	public String saveProduct(@ModelAttribute Product product) {
		productRepository.save(product);
		return "redirect:/";
	}
	
	@GetMapping("/show")
	public String showAllProducts(Model model) {
		List<Product> allProducts = productRepository.findAll();
		model.addAttribute("allProducts", allProducts);
		return "showall";
	}
}
