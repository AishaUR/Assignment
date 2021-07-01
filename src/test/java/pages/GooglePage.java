package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class GooglePage { //create class for webpage to store own web elements with locators
    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath ="//input[@name='q']")
    public WebElement searchBox;
}
