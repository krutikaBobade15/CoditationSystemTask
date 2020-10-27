package com.coditationsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coditationsystem.model.Category;
import com.coditationsystem.model.Product;
import com.coditationsystem.model.Response;
import com.coditationsystem.repository.CategoryRepository;
import com.coditationsystem.repository.ProductRepository;
@Service
public class ServiceImpl implements CategoryAndProductService {

	@Autowired
	ProductRepository productRespository;

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Response allProducts() {
		List<?> record = null;
		Response response = new Response();
		try {
			record = productRespository.findAll();
			response.setMessage(record);
			response.setStatus("Success");
		} catch (Exception e) {

			response.setMessage(e);
			response.setStatus("Failed");
		}
		return response;
	}

	@Override
	public Product productById(int id) {

		return productRespository.getOne(id);
	}

	@Override
	public Response saveProduct(Product product) {
		Product record = null;
		Response response = new Response();
		try {
			record = productRespository.save(product);
			response.setMessage(record);
			response.setStatus("Success");
		} catch (Exception e) {

			response.setMessage(e);
			response.setStatus("Failed");
		}
		return response;
	}

	@Override
	public Response updateProduct(int id, Product product) {
		Product updateProduct = new Product();
		Response response = new Response();
		try {
			if (productRespository.existsById(id)) {
				updateProduct = productRespository.save(product);
				response.setMessage(updateProduct);
				response.setStatus("Success");
			}
		} catch (Exception e) {

			response.setMessage(e);
			response.setStatus("Failed");
		}
		return response;
	}

	@Override
	public Response saveCategory(Category entity) {
		Category record = null;
		Response response = new Response();
		try {
			record = categoryRepository.save(entity);
			response.setMessage(record);
			response.setStatus("Success");
		} catch (Exception e) {

			response.setMessage(e);
			response.setStatus("Failed");
		}
		return response;
	}

	@Override
	public Response allCategory() {
		List<?> record = null;
		Response response = new Response();
		try {
			record = categoryRepository.findAll();
			response.setMessage(record);
			response.setStatus("Success");
		} catch (Exception e) {

			response.setMessage(e);
			response.setStatus("Failed");
		}
		return response;
	}

}
