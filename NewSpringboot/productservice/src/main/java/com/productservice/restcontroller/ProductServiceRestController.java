package com.productservice.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.jpa.entity.ProductService;
import com.productservice.repository.ProductServiceRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/productservices")
@RequiredArgsConstructor
public class ProductServiceRestController {
	
	private final ProductServiceRepository productservicerepository = null;
	
	@GetMapping
	@ResponseStatus<Httpstatus,ok>
	 List<ProductService> findAll(){
		return productservicerepository.findAll();
	}
		
	@PostMapping
	@ResponseStatus<Httpstatus,CREATED>
	void createProductservice(@RequestBody ProductService productservice) {
		productservicerepository.save(productservice);
	}
		
	

}
