package com.coditationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coditationsystem.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	

}
