package org.adactin;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
		
	public static WebDriver  driver;
	public static Robot r;
	public static Actions a;
	public static Select s;
	public static TakesScreenshot screenshot;
		
		public static WebDriver getDriver() {


			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe" );
			 driver=new ChromeDriver();
			return driver;

		}
		public static void loadUrl(String url) {
			driver.get(url);

		}
		public static void currentUrl() {
			System.out.println(driver.getCurrentUrl());
		}
		public static void title() {
			System.out.println(driver.getTitle());

		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		public static void  btnClick(WebElement element) {
			element.click();

		}
		public static void thread(int sleep) throws InterruptedException {
			Thread.sleep(sleep);
		}
		public static WebElement locatorById(String data) {
			return driver.findElement(By.id(data));

		}
		public static WebElement locatorByXpath(String data) {
			return driver.findElement(By.xpath(data));
			

		}
		public static void sendKeys(WebElement element,String name) {
	         element.sendKeys(name);
		}
		
		public static void rightClick(WebElement element) {
			a=new Actions(driver);
			a.contextClick(element).perform();

		}
		
		public static String getText(WebElement element) {
		 System.out.println(element.getText());
		return null;
			} 
		public static String getAttribute(WebElement element,String data) {
			System.out.println(element.getAttribute(data));
			return data;

		}
		public static void doubleClick(WebElement element) {
			a=new Actions(driver);
			a.doubleClick(element).perform();
		}
		
	
		
		public static void screen(String data) throws IOException {
			
			 screenshot=(TakesScreenshot)driver;
			File location = screenshot.getScreenshotAs(OutputType.FILE);
			File destFile=new File(System.getProperty("user.dir")+"\\Screenshot"+data+".png");
			FileUtils.copyFile(location, destFile);

		}
		public static void quit() {
			driver.quit();
		}
		public static  WebElement dDnSelect(WebElement element,int index) {
			
			
			s=new Select(element);
			 List<WebElement> options = s.getOptions();
			return options.get(index);
			 
			
			
		}
		public static void dDnByIndex(WebElement element,int index) {
			s=new Select(element);
			s.selectByIndex(index);
			

		}
	
		
		
	}



