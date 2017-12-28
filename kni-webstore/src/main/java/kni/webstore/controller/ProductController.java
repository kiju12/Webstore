package kni.webstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kni.webstore.model.Product;
import kni.webstore.repository.ProductRepository;

@Controller
public class ProductController {
	private ProductRepository productRepository;

	@Autowired
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@PostMapping("/save")
	public String saveProduct(@ModelAttribute Product product) {
		productRepository.save(product);
		return "redirect:/panelAdmina/dodajProdukt";
	}
	
	@GetMapping("/produkty")
	public String showAllProducts(Model model) {
		List<Product> allProducts = productRepository.findAll();
		model.addAttribute("allProducts", allProducts);
		return "produkty";
	}
	
	@GetMapping(value="/panelAdmina/dodajProdukt")
	public String dodajProdukt(Model model) {
		model.addAttribute("product", new Product());
		return "dodajProdukt";
	}
}
