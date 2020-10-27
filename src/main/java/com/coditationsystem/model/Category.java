package com.coditationsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	private int categoryId;
	private String categoryType;
	@ManyToOne(cascade = CascadeType.ALL)
	private SubCategory subCategory;
	@ManyToMany(cascade = CascadeType.ALL)
	private Product product;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Category(int categoryId, String categoryType, Product product) {
		super();
		this.categoryId = categoryId;
		this.categoryType = categoryType;
		this.product = product;
	}

	public Category() {
		super();
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryType=" + categoryType + ", product=" + product + "]";
	}

}
