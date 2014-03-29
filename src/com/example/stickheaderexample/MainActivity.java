package com.example.stickheaderexample;

import java.util.List;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import android.app.Activity;
import android.os.Bundle;

import com.example.stickheaderexample.adapters.CateogryAdapter;
import com.example.stickheaderexample.models.Category;
import com.example.stickheaderexample.models.CategoryDetails;
import com.example.stickheaderexample.utils.staticdata.StaticDataManager;

public class MainActivity extends Activity {
	private StickyListHeadersListView mListView;
	private CateogryAdapter  mCateogryAdapter;
	private CategoryDetails mCategoryDetails;
	private List<Category> lstCategories;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView = (StickyListHeadersListView)findViewById(android.R.id.list);
		mCategoryDetails =  StaticDataManager.getInstance().getCategoryDetails();
		setListView();
	}
	
	private void setListView() {
		lstCategories  = mCategoryDetails.getCategoryList();
		
		// send the list items and also the header details
		mCateogryAdapter = new CateogryAdapter(MainActivity.this,
				R.layout.individual_row,
				lstCategories,
				mCategoryDetails.getCategoryHeader());
		mListView.setAdapter(mCateogryAdapter);
	}
}
