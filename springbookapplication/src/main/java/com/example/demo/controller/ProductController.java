package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController

public class ProductController {
	@Autowired
	
	ProductService productService;
@PostMapping("/products")
	public void addProduct(@RequestBody Product product)
	{
		productService.addProduct(product);
	}
@ DeleteMapping("/products/{id}")
 public void delete(@PathVariable int id)
 {
	 productService.deleteProduct(id);
 }
@ GetMapping("/products/{id}")
 public  Optional<Product>getProduct( @PathVariable int id)
 
 {
	 return productService.getProduct(id);
	 
	 
 }
@ PutMapping("/products")
 public  void updateProduct(@RequestBody Product product) {
	 
	 productService.updateProduct(product);
 }
@ GetMapping("/products")
 public List<Product> getAllProduct()
 {
	return productService.getAllProduct();
 }

}
