package com.example.stickheaderexample.adapters;

import java.util.List;

import com.example.stickheaderexample.R;
import com.example.stickheaderexample.models.Category;
import com.example.stickheaderexample.models.CategoryHeader;

import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CateogryAdapter extends ArrayAdapter<Category> implements StickyListHeadersAdapter{
	private Context mContext;
	private LayoutInflater mInflater;
	private LayoutInflater mHeaderInflater;
	private List<Category> categoryList;
	private CategoryHeader mCategoryHeader;
	private int mResource;
	
	public CateogryAdapter(Context context, int resource, 
			List<Category> objects, CategoryHeader categoryHeader) {
		super(context, resource, objects);
		mContext = context;
		categoryList = objects;
		mCategoryHeader = categoryHeader;
		mResource =  resource;
	}

	@Override
	public View getHeaderView(int position, View convertView, ViewGroup parent) {
		View view =convertView;
		ViewHolder vh;
		
		if(view == null) {
			mHeaderInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = mHeaderInflater.inflate(R.layout.list_header_view, parent, false);
			vh = new ViewHolder();
			vh.txtHeaderDesc = (TextView)view.findViewById(R.id.txtHeaderDesc);
			vh.txtHeaderName = (TextView)view.findViewById(R.id.txtHeaderText);
			view.setTag(vh);
		}else {
			vh = (ViewHolder)view.getTag();
		}
		
		vh.txtHeaderDesc.setText(mCategoryHeader.getDescription());
		vh.txtHeaderName.setText(mCategoryHeader.getName());
 		return view;
	}

	@Override
	public long getHeaderId(int position) {
		return 0;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view =convertView;
		ViewHolder vh;
		
		if(view == null) {
			mInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = mInflater.inflate(mResource, parent, false);
			vh = new ViewHolder();
			vh.txtCategoryDesc = (TextView)view.findViewById(R.id.txtCategoryDesc);
			vh.txtCategoryName = (TextView)view.findViewById(R.id.txtCategoryName);
			view.setTag(vh);
		}else {
			vh = (ViewHolder)view.getTag();
		}
		
		Category category = categoryList.get(position);
		vh.txtCategoryDesc.setText(category.getCategoryDesc());
		vh.txtCategoryName.setText(category.getCategoryName());
		
 		return view;
	}
	
	static class ViewHolder {
		TextView txtCategoryName;
		TextView txtCategoryDesc;
		TextView txtHeaderName;
		TextView txtHeaderDesc;
	}

}
