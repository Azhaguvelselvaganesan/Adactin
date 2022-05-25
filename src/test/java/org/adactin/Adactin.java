package org.adactin;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.sun.glass.events.KeyEvent;

public class Adactin extends Baseclass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		getDriver();
		loadUrl("http://adactinhotelapp.com/index.php");
		maximize();
		AdactinLogin login=new AdactinLogin();
		sendKeys(login.getUsername(), "Azhaguvel1994");
		sendKeys(login.getTxtPass(), "azhagu@1997");
		btnClick(login.getLogin());
		SearchHotel hotel=new SearchHotel();
		sendKeys(hotel.getLocation(), "Sydney");
		sendKeys(hotel.getHotel(), "Hotel Creek");
		sendKeys(hotel.getRoomtype(), "Double");
		sendKeys(hotel.getNumberOfRooms(), "1-One");
		sendKeys(hotel.getAdults(), "1-One");
		sendKeys(hotel.getChildrens(), "1-One");
		btnClick(hotel.getSubmit());
		SelectHotel select=new SelectHotel();
		btnClick(select.getRadiobtn());
		btnClick(select.getBtncontinue());
		BookHotel book=new BookHotel();
		sendKeys(book.getFnName(), "Ajith");
		sendKeys(book.getLnName(), "kumar");
		sendKeys(book.getAddress(), "kumbakonam");
		sendKeys(book.getCardnum(), "1234567890123456");
		sendKeys(book.getCardType(), "VISA");
		sendKeys(book.getMomth(), "May");
		sendKeys(book.getYear(), "2023");
		sendKeys(book.getCvv(), "1234");
		btnClick(book.getBookNow());
		//Order order=new Order();
		//String text = getText(order.getOrderNum());
		//System.out.println(text);
		//WebElement ord = locatorById("order_no");
		
		Thread.sleep(10);
//		WebElement ord = driver.findElement(By.className("disable_text"));
//		JavascriptExecutor executor=(JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].scrollIntoView(true)", ord);
//		String text = ord.getText();
//		System.out.println(text);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
				//JavascriptExecutor executor=(JavascriptExecutor)driver;
				//executor.executeScript("window.scrollBy(0,200)", "");
		//executor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				WebElement lit = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
				//executor.executeScript("arguments[0].scrollIntoView();", lit);
		

		lit.click();
		
		
}
}