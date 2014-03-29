package com.example.stickheaderexample.models;

import java.util.List;

public class CategoryDetails {
	private CategoryHeader categoryHeader;
	List<Category> categoryList;
	public CategoryHeader getCategoryHeader() {
		return categoryHeader;
	}
	public void setCategoryHeader(CategoryHeader categoryHeader) {
		this.categoryHeader = categoryHeader;
	}
	public List<Category> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
}
