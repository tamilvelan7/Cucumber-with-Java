package com.Baseclass.NewCode;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Tamilvelan
 *
 */
public class All_methods {
	// launch the browser
	public static WebDriver driver;
	public static Robot keyboard;
	public static Select dropdown;

	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "/home/tamilvelan/eclipse-workspace/NewCucumber/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// url paste
	public static void geturl(String url) {
		driver.get(url);
	}

	// get current url
	public static void getcurreturl() {
		System.out.println(driver.getCurrentUrl());
	}

	// get title of the page
	public static void gettitle() {
		System.out.println(driver.getTitle());
	}

	// close the current tab
	public static void closeTab() {
		driver.close();
	}

	// close the all Tab or quict the browser
	public static void quit() {
		driver.quit();
	}

	// Parent tab
	public static void parentTab() {
		driver.getWindowHandle();
	}

	// Access all tab
	public static void allTab() {
		driver.getWindowHandles();
	}

	// implicity wait
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// ID locator
	public static WebElement id(String element) {
		return driver.findElement(By.id(element));
	}

	// sysout
	public static void print(String string) {

		System.out.println(string);
	}


	// fullscreen screenshot
	public static void fullScreenshot() {
		keyboard.keyPress(KeyEvent.VK_ALT);
		keyboard.keyPress(KeyEvent.VK_PRINTSCREEN);
		keyboard.keyRelease(KeyEvent.VK_ALT);
		keyboard.keyRelease(KeyEvent.VK_PRINTSCREEN);
	}

	// ID with sendkeys
	public static void idwithSendkeys(String id, String keys) {
		driver.findElement(By.id(id)).sendKeys(keys);
	}

	// ID with Click
	public static void idwithClick(String id) {
		driver.findElement(By.id(id)).click();
	}

	// xpath only
	public static WebElement xpath(String xpath) {
		return driver.findElement(By.xpath(xpath));

	}

	// xpath with sendkeys
	public static void xpathwithSendkeys(String xpath, String keys) {
		driver.findElement(By.xpath(xpath)).sendKeys(keys);
	}

	// xpath with click
	public static void xpathwithClick(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	// linktext
	public static void linkClick(String link) {
		driver.findElement(By.linkText(link)).click();
	}

	// particle link text
	public static void partialClick(String link) {
		driver.findElement(By.partialLinkText(link)).click();
	}

	// sysout of integer
	public static void print(int integer) {
		System.out.println(integer);
	}

	// Select class methods index based
	public static void dropDownofIndexusingXpath(String xpath, int index) {
		dropdown = new Select(xpath(xpath));
		dropdown.selectByIndex(index);
	}

	// Select class methods using value and visible text
	public static void dropDownofValueusingXpath(String xpath, String value) {
		dropdown = new Select(xpath(xpath));
		dropdown.selectByValue(value);
	}

	// Select class methods using visible text
	public static void dropDownoftextusingXpath(String xpath, String visibletext) {
		dropdown = new Select(xpath(xpath));
		dropdown.selectByVisibleText(visibletext);
	}

	// Select class using Id of index
	public static void dropDownofIndexusingId(String id, int index) {
		dropdown = new Select(id(id));
		dropdown.selectByIndex(index);
	}

	public static void idwithSendkey(String id, String sendkeys) {
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys(sendkeys);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}