package com.sb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/hello")
	public String message()
	{
		return "Heyo";
	}
	

	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable("id") String id) {
		if(id.equals("1"))
			throw new ProductException();
		else
			return "Product found";
	}

}
