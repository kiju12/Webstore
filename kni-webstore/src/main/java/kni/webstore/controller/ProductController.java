package kni.webstore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import kni.webstore.model.Product;
import kni.webstore.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute @Valid Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "dodajProdukt";
		}
		
		productRepository.save(product);
		return "redirect:/panelAdmina/dodajProdukt";
	}
	
	@GetMapping("/produkty")
	public String showAllProducts(Model model) {
		List<Product> allProducts = productRepository.findAll();
		model.addAttribute("allProducts", allProducts);
		return "produkty";
	}
	
	@GetMapping("/produkty/produkt/{id}")
	public String pojedynczyProdukt(@PathVariable Long id, Model model) {
		Product produkt = productRepository.findById(id);
		model.addAttribute("produkt", produkt);
		return "zobaczProdukt";
	}
	
	@GetMapping(value="/panelAdmina/dodajProdukt")
	public String dodajProdukt(Model model) {
		model.addAttribute("product", new Product());
		return "dodajProdukt";
	}
}
