package com.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.productservice.jpa.entity.ProductService;
@Repository
@EnableMongoRepositories
public interface ProductServiceRepository extends JpaRepository<ProductService, String> {

}
