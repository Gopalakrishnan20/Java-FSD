package com.rest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
	

}
