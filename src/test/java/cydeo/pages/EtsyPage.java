package cydeo.pages;

import cydeo.utilties.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {

    public EtsyPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "search_query")
   public WebElement searchBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement searchBtn;
}

