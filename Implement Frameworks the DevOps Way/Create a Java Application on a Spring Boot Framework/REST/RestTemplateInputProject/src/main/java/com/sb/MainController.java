package com.sb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/productinfo")
	public Product getProduct() {
		Product product=new Product();
		product.setPid("1");
		product.setProdname("Soap");
		return product;
}
}