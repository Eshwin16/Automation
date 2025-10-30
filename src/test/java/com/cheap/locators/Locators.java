package com.cheap.locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cheap.base.BaseClass;
//import com.cheap.hooks.Hooks;

public class Locators extends BaseClass
{
	public static WebElement getFlight()
	{
		return BaseClass.ById("flights");
	}
	public static WebElement getPackages()
	{
		return BaseClass.ById("vacations");
	}
	public static WebElement getHotels()
	{
		return BaseClass.ById("hotels");
	}
	public static WebElement getCars()
	{
		return BaseClass.ById("cars");
	}
	public static WebElement getDoubleTrip()
	{
		return BaseClass.ById("roundTrip");
	}
	public static WebElement getOneWayTrip()
	{
		return BaseClass.ById("onewayTrip");
	}
	public static WebElement getMultiCity()
	{
		return BaseClass.ById("multiTrip");
	}
	
	public static WebElement getFromWhere()
	{
		return BaseClass.ById("fs_originCity_0");
	}
	public static WebElement getToWhere()
	{
		return BaseClass.ById("fs_destCity_0");
	}
	public static WebElement getDepart()
	{
		return BaseClass.ById("fs_departDate_0");
	}
	public static WebElement getReturn()
	{
		return BaseClass.ById("fs_returnDate_0");
	}
	public static WebElement getTraveller()
	{
		return BaseClass.ById("travellerButtonFlights");
	}
	public static WebElement getFromWhereLocation()
	{
		return BaseClass.ByXpath("//li[@data-suggestion='CJB']");
	}
	public static WebElement InputRenderedFrom()
	{
		return BaseClass.ByXpath("(//*[@class='airport-location-v2-text' and text()='CJB'])[1]");
	}
}
