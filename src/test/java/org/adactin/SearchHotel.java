package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Baseclass{
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="location")	
private WebElement Location;
@FindBy(id="hotels")	
private WebElement Hotel;
@FindBy(id="room_type")
private WebElement Roomtype;
@FindBy(id="room_nos")
private WebElement numberOfRooms;
@FindBy(id="adult_room")
private WebElement adults;
@FindBy(id="child_room")
private WebElement childrens;
@FindBy(id="Submit")
private WebElement submit;
public WebElement getSubmit() {
	return submit;
}
public WebElement getLocation() {
	return Location;
}
public WebElement getHotel() {
	return Hotel;
}
public WebElement getRoomtype() {
	return Roomtype;
}
public WebElement getNumberOfRooms() {
	return numberOfRooms;
}
public WebElement getAdults() {
	return adults;
}
public WebElement getChildrens() {
	return childrens;
}
}
