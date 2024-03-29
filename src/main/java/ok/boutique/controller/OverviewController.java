package ok.boutique.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ok.boutique.entity.Product;
import ok.boutique.service.ProducerService;
import ok.boutique.service.ProductService;

@Controller
@RequestMapping("/")
public class OverviewController {
	
	private final ProducerService producerService;
	private final ProductService productService;
	
	public OverviewController (ProducerService producerService, ProductService productService) {
		this.producerService = producerService;
		this.productService = productService;
	}
	
	@ModelAttribute(name = "product")
	public List<Product> products() {
		return productService.findAll();
	}
	
	@GetMapping
	public String displayOverview(Model model) {
		model.addAttribute("producers",producerService.findAll());
		return  "overview";
	}

}
