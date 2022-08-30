package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.ProductEntity;
import com.rest.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	public List<ProductEntity> ListAll(){
		return productRepository.findAll();
	}
	public ProductEntity findByID(int id) {
		return productRepository.findById(id).get();
	}
	public void addProduct(ProductEntity p) {
		productRepository.save(p);
	}
	
	public void updateProduct(int id,ProductEntity p) {
		if(productRepository.findById(id).isPresent())
		{
			ProductEntity old=productRepository.findById(id).get();
			old.setName(p.getName());
			old.setDescription(p.getDescription());
			productRepository.save(old);			
		}
	}
	
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}

}
