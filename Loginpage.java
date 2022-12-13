package com.stepDefination.hotel;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.support.PageFactory;
import com.Baseclass.NewCode.All_methods;
import com.HotelBooks.HotelBook;
import com.HotelBooks.HotelSearch;
import com.HotelBooks.Login;
import com.HotelBooks.Review;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Loginpage extends All_methods{

	@Given("^: User has to go Adactin hotel login page$")
	public void user_has_to_go_Adactin_hotel_login_page() throws Throwable {
		launch();
		geturl("http://adactinhotelapp.com/");
		waits();  
	}

	@Given("^: User has to pass correct username and password in textbox$")
	public void user_has_to_pass_correct_username_and_password_in_textbox() throws Throwable {
		PageFactory.initElements(driver,Login.class);
		FileInputStream fi=new FileInputStream("/home/tamilvelan/eclipse-workspace/NewCucumber/src/main/java/properties/Hotel.properties");
		Properties file=new Properties();
		file.load(fi);
	  Login.username.sendKeys(file.getProperty("username"));
	  Login.password.sendKeys(file.getProperty("password"));
	}

	@Given("^:User has to click login button$")
	public void user_has_to_click_login_button() throws Throwable {
		Login.login.click();
	}

	@Then("^: User has to navigate to Adactin Search hotel page$")
	public void user_has_to_navigate_to_Adactin_Search_hotel_page() throws Throwable {
		print("login successfully");
	}

	
	@Given("^: User has to navigate search hotel page$")
	public void user_has_to_navigate_search_hotel_page() throws Throwable {
	    gettitle();
	}

	@Given("^: user should select the mandatory box\\.$")
	public void user_should_select_the_mandatory_box() throws Throwable {
		PageFactory.initElements(driver,HotelSearch.class);
		HotelSearch.dropdown(HotelSearch.location,5);
		HotelSearch.dropdown(HotelSearch.hotels, 2);
		HotelSearch.dropdown(HotelSearch.room_type,3);
		HotelSearch.dropdown(HotelSearch.room_nos, 3);
		HotelSearch.dropdown(HotelSearch.adult_room, 4);
		HotelSearch.dropdown(HotelSearch.child_room, 3);
	}

	@Given("^: User has to pass check in date and check out date$")
	public void user_has_to_pass_check_in_date_and_check_out_date() throws Throwable {
		FileInputStream fi=new FileInputStream("/home/tamilvelan/eclipse-workspace/NewCucumber/src/main/java/properties/Hotel.properties");
		Properties file=new Properties();
		file.load(fi);
		HotelSearch.date_in.clear();
		HotelSearch.date_in.sendKeys(file.getProperty("date_in"));
		HotelSearch.date_out.clear();
		HotelSearch.date_out.sendKeys(file.getProperty("date_out"));
		HotelSearch.Search.click();
	}

	@Given("^: User has to click search button$")
	public void user_has_to_click_search_button() throws Throwable {
		HotelSearch.radio.click();
		HotelSearch.click.click();   
	}

	@Then("^: User has to navigate to book hotel page$")
	public void user_has_to_navigate_to_book_hotel_page() throws Throwable {
	    gettitle();
	}

	@Given("^: User has to go book hotel page$")
	public void user_has_to_go_book_hotel_page() throws Throwable {
	    gettitle();
	}

	@Given("^: User should pass the mandatory textbox$")
	public void user_should_pass_the_mandatory_textbox() throws Throwable {
		PageFactory.initElements(driver,HotelBook.class);
		FileInputStream fi=new FileInputStream("/home/tamilvelan/eclipse-workspace/NewCucumber/src/main/java/properties/Hotel.properties");
		Properties file=new Properties();
		file.load(fi);
		HotelBook.firstName.sendKeys(file.getProperty("firstName"));
		HotelBook.lastName.sendKeys(file.getProperty("lastName"));
		HotelBook.address.sendKeys(file.getProperty("address"));
		HotelBook.cardNo.sendKeys(file.getProperty("cardNo"));
		HotelBook.Cvv.sendKeys(file.getProperty("cvv"));
	}

	@Given("^: User should select the mandatory boxs$")
	public void user_should_select_the_mandatory_boxs() throws Throwable {
		FileInputStream fi=new FileInputStream("/home/tamilvelan/eclipse-workspace/NewCucumber/src/main/java/properties/Hotel.properties");
		Properties file=new Properties();
		file.load(fi);
		HotelBook.dropdown(HotelBook.cardType, file.getProperty("cardType"));
		HotelBook.dropdown(HotelBook.month, file.getProperty("month"));
		HotelBook.dropdown(HotelBook.exp, file.getProperty("year"));
	}

	@Then("^: User has to click Book now button$")
	public void user_has_to_click_Book_now_button() throws Throwable {
		HotelBook.booknow.click();  
	}

	@Given("^: User has to go Booked Itinerary page$")
	public void user_has_to_go_Booked_Itinerary_page() throws Throwable {
		PageFactory.initElements(driver, Review.class);
		Review.review.click();
		gettitle();
	}

	@Then("^: user click logout button$")
	public void user_click_logout_button() throws Throwable {
	    Review.logout.click();
	}
}


	