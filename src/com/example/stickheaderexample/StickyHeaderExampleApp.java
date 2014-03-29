package com.example.stickheaderexample;

import android.app.Application;

public class StickyHeaderExampleApp extends Application{
	private static StickyHeaderExampleApp mApp;
	@Override
	public void onCreate() {
		super.onCreate();
		mApp = this;
	}
	
	public static StickyHeaderExampleApp getAppCtx() {
		return mApp;
	}
}
