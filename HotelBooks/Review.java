package com.HotelBooks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Review {
	
	@FindBy(id = "my_itinerary")
	public static WebElement review;
	
	@FindBy(linkText = "Logout")
	public static WebElement logout;

}
