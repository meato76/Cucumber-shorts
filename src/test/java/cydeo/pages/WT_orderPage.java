package cydeo.pages;

import cydeo.utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_orderPage extends WT_BasePage{

    public WT_orderPage(){


        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "product")
    public WebElement productDropDown;
}
