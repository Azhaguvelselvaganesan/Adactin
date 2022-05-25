package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order extends Baseclass{
	public Order() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="order_no")
private WebElement orderNum;
public WebElement getOrderNum() {
	return orderNum;
}

}
