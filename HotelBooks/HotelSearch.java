package com.HotelBooks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HotelSearch {
	
	@FindBy(id="location")	
	public static WebElement location;
	
	@FindBy(id="hotels")	
	public static WebElement hotels;
	
	@FindBy(id="room_type")	
	public static WebElement room_type;
	
	@FindBy(id="room_nos")	
	public static WebElement room_nos;
	
	@FindBy(id="adult_room")	
	public static WebElement adult_room;
	
	@FindBy(id="child_room")	
	public static WebElement child_room;
	
	@FindBy(id="datepick_in")
	public static WebElement date_in;
	
	@FindBy(id="datepick_out")
	public static WebElement date_out;
	
	@FindBy(xpath = "//input[@name='Submit']")
	public static WebElement Search;
	
	
	@FindBy(id="radiobutton_0")
	public static WebElement radio;
	
	@FindBy(id="continue")
	public static WebElement click;
	
	
	public static void dropdown(WebElement element, int sel) {
		Select dropdown=new Select(element);
		dropdown.selectByIndex(sel);
	}
	
}
