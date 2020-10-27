package com.coditationsystem.service;

import java.util.List;

import com.coditationsystem.model.Category;
import com.coditationsystem.model.Product;
import com.coditationsystem.model.Response;

public interface CategoryAndProductService {

	public Response allProducts();

	public Product productById(int id);

	public Response saveProduct(Product product);

	public Response updateProduct(int id, Product product);

	public Response saveCategory(Category category);

	public Response allCategory();

}
