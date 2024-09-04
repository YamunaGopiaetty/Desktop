package com.productservice.jpa.entity;

//import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value="productservice")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductService {
	
  @Id
private String id;
public String name;
public String description;
public  int price;
  

}
