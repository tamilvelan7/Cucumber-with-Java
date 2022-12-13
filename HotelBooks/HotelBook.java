package com.HotelBooks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class HotelBook {

	@FindBy(id="first_name")
	public static WebElement firstName;
	
	@FindBy(how=How.ID,using ="last_name")
	public static WebElement lastName;
			
	@FindBy(how=How.ID,using ="address")
	public static WebElement address;
	
	@FindBy(id="cc_num")
	public static WebElement cardNo;
	
	@FindBy(id="cc_cvv")
	public static WebElement Cvv;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	public static WebElement cardType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	public static WebElement month;
	
	@FindBy(xpath="(//select)[3]")
	public static WebElement exp;
	
	@FindBy(id="book_now")
	public static WebElement booknow;
	
	public static void dropdown(WebElement element, String text) {
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText(text);
	}
	
}
