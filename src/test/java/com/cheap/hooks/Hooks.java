package com.cheap.hooks;

import com.cheap.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	public static void setup()
	{
		launchBrowser("Chrome");
		loadUrl("https://www.cheapair.com/");

	}
	
//	@After
//	public static void close() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		driver.quit();
//	}
//	
	
	

}
