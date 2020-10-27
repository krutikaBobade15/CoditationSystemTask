package com.coditationsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coditationsystem.model.Category;
import com.coditationsystem.model.Product;
import com.coditationsystem.model.Response;
import com.coditationsystem.service.ServiceImpl;

@RestController
public class ProductController {

	@Autowired
	ServiceImpl serviceImpl;

	@GetMapping(value = "/getAllCatgegory", produces = "application/json")
	public Response getAllCategory() {
		Response record = null;
		return record = serviceImpl.allCategory();
	}

	@GetMapping(value = "/getAllCatgegory", produces = "application/json")
	public Response getAllProduct() {

		return serviceImpl.allProducts();
	}

	@PostMapping(value = "/saveProduct", produces = "application/json")
	@ResponseBody
	public Response saveProduct(@RequestBody Product entity) {
		return serviceImpl.saveProduct(entity);
	}

	@PostMapping(value = "/saveCategory", produces = "application/json")
	@ResponseBody
	public Response saveCategory(@RequestBody Category entity) {
		return serviceImpl.saveCategory(entity);
	}

	@PostMapping(value = "/updateProduct", produces = "application/json")
	@ResponseBody
	public Response updateProduct(@RequestBody Product entity, @RequestBody int productId) {
		return serviceImpl.updateProduct(productId, entity);
	}

}
