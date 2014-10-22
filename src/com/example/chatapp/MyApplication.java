package com.example.chatapp;

import android.app.Application;
import com.parse.Parse;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "zhvlLiBXIyFCSUew9PDGqSKHpAssCznklweTrhDA",
				"APzCo9UrNMFkbWs0ez4RmA8xaQZrDdreS6iBXetU");
	}
}
