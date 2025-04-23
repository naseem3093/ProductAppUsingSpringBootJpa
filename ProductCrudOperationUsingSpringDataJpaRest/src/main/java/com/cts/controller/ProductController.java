package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.exception.ProductNotFound;
import com.cts.model.Product;
import com.cts.service.ProductService;

@RestController
@RequestMapping("/products") // http://localhost:1111/products
public class ProductController {
	@Autowired
	ProductService service;

	@GetMapping("/getMsg") // http://localhost:1111/products/getMsg
	public String sayHello() {
		return "am trying  to listen but am getting sleep";
	}

	@PostMapping("/saveproduct") // http://localhost:1111/products/saveproduct
	public String insertProduct(@RequestBody @Validated Product product) {
		return service.saveProduct(product);
	}

	@PutMapping("/saveproduct") // http://localhost:1111/products/saveproduct
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@GetMapping("/saveproduct") // http://localhost:1111/products/getproduct/1
	public Product fetchProduct(@PathVariable("pid") int productId) throws ProductNotFound {
		return service.getProduct(productId);
	}
	@DeleteMapping("/removeproduct/{pid}") // http://localhost:1111/products/removeproduct/1
	public String removeProduct(@PathVariable("pid") int productId) {
		return service.removeProduct(productId);
	}
	@GetMapping("/getallproducts") // http://localhost:1111/products/getAllProducts
	public List<Product> fetchproduct() {
		return service. getAllProducts();
	}
}
