package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
public void addProduct(Product product)
{
	productRepository.save(product);

}
public void deleteProduct(int id)
{
	productRepository.deleteById(id);
}
public void updateProduct(Product product)
{
	productRepository.save(product);
}
public List<Product> getAllProduct() {
	
	return (List<Product>)productRepository.findAll();
}
public  Optional<Product> getProduct(int id)
{
	return productRepository.findById(id);
}
}
