package cydeo.pages;

import cydeo.utilties.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WT_BasePage {

    public WT_BasePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Order']")
    public WebElement orderLink;


    @FindBy(xpath = "//button[text()='View all orders']")
    public WebElement viewAllOrdersLink;



    @FindBy(xpath = "//button[text()='View all products']")
    public WebElement viewAllProducts;


    @FindBy(xpath = "//button[text()='Logout']")
    public WebElement logOut;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioBtn;


    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCardRadioBtn;



    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpressRadioBtn;

    @FindBy(name = "card")
    public List<WebElement> cardTypes;

    @FindBy(name = "quantity")
    public WebElement inputQuantity;


    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;

    @FindBy(name= "name")
    public WebElement inputName;

    @FindBy(name = "street")
    public WebElement inputStreet;

    @FindBy(name = "city")
    public WebElement inputCity;


    @FindBy(name = "state")
    public WebElement inputState;


    @FindBy(name = "zip")
    public WebElement inputZip;

    @FindBy(name = "cardNo")
    public WebElement inputCreditCard;

    @FindBy(name = "cardExp")
    public WebElement cardExpiration;


    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processBtn;









}
