package com.example.stickheaderexample.utils.staticdata;

import java.util.ArrayList;
import java.util.List;

import com.example.stickheaderexample.R;
import com.example.stickheaderexample.StickyHeaderExampleApp;
import com.example.stickheaderexample.models.Category;
import com.example.stickheaderexample.models.CategoryDetails;
import com.example.stickheaderexample.models.CategoryHeader;

public class StaticDataManager {
	private static StaticDataManager mStaticDataManager = new StaticDataManager();
	
	public static StaticDataManager getInstance() {
		return mStaticDataManager;
	}
	
	public List<Category> getCategoryList() {
		List<Category> categoryList = new ArrayList<Category>();
		for(int i=0;i<10;i++) {
			Category category = new Category();
			category.setCategoryDesc("This is a categroy description : " + (i+1));
			category.setCategoryName("Category Name : " + (i+1));
			categoryList.add(category);
		}
		return categoryList;
	}
	
	public CategoryHeader getCategoryHeader() {
		CategoryHeader categoryHeader = new CategoryHeader();
		categoryHeader.setName("Header One ");
		categoryHeader.setDescription(StickyHeaderExampleApp.getAppCtx().getString(R.string.dummy_text));
		return categoryHeader;
	}
	
	public CategoryDetails getCategoryDetails() {
		CategoryDetails categoryDetails = new CategoryDetails();
		categoryDetails.setCategoryHeader(getCategoryHeader());
		categoryDetails.setCategoryList(getCategoryList());
		return categoryDetails;
	}
}
