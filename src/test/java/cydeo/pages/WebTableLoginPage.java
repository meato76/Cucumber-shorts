package cydeo.pages;

import cydeo.utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {


    public WebTableLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (name = "username")
    public WebElement username;

    @FindBy (name = "password")
    public WebElement password;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginBtn;


    /**
     * This method will login with below credentials
     * @username: Test
     * @Password: Tester
     */
    public void login(){

        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.loginBtn.click();

    }

    /**
     * This method will login with below credentials that are provided in the method at the time of calling it
     * @username: Test
     * @Password: Tester
     */



    public void login(String user, String pass){

        this.username.sendKeys(user);
        this.password.sendKeys(pass);
        this.loginBtn.click();

    }


}
