package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Baseclass{
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="first_name")
private WebElement fnName;
@FindBy(id="last_name")
private WebElement lnName;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement cardnum;
@FindBy(id="cc_type")
private WebElement cardType;
@FindBy(id="cc_exp_month")
private WebElement momth;
@FindBy(id="cc_exp_year")
private WebElement year;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement bookNow;
public WebElement getFnName() {
	return fnName;
}
public WebElement getLnName() {
	return lnName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCardnum() {
	return cardnum;
}
public WebElement getCardType() {
	return cardType;
}
public WebElement getMomth() {
	return momth;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBookNow() {
	return bookNow;
}

}
