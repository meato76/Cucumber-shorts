package cydeo.step_definitions;

import cydeo.pages.WT_ViewAllOrdersPage;
import cydeo.pages.WT_orderPage;
import cydeo.pages.WebTableLoginPage;
import cydeo.utilties.BrowserUtils;
import cydeo.utilties.BrowserUtilsADAM;
import cydeo.utilties.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class WebTableSteps {

    WebTableLoginPage webTablePage = new WebTableLoginPage();

    @Given("user is on the Web Table app login page")
    public void user_is_on_the_web_table_app_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("user enter correct username")
    public void user_enter_correct_username() {
        webTablePage.username.sendKeys("Test");
    }
    @When("user enter correct password")
    public void user_enter_correct_password() {
       webTablePage.password.sendKeys("Tester");
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
       webTablePage.loginBtn.click();
    }
    @Then("user should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {


        String currentUrl = Driver.getDriver().getCurrentUrl();

        String expectedInURL = "orders";

       Assert.assertTrue(currentUrl.contains(expectedInURL));

    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        webTablePage.username.sendKeys(username);
        webTablePage.password.sendKeys(password);
    }

    @Then("user should see {string} word in the URL")
    public void userShouldSeeWordInTheURL(String str) {

       String expectedInUrl = str;

       Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInUrl));
    }

    @When("user enters below correct credentials")
    public void user_enters_below_correct_credentials(Map<String, String> credential) {

        webTablePage.username.sendKeys(credential.get("username"));
        webTablePage.password.sendKeys(credential.get("password"));
    }



    @Given("user is already in logging webTable page")
    public void user_is_already_in_logging_web_table_page() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTablePage.login();

    }

    WT_orderPage orderPage= new WT_orderPage();
    @When("user is on the order page")
    public void user_is_on_the_order_page() {


        orderPage.orderLink.click();

        BrowserUtilsADAM.sleep(2);
    }



    @Then("user sees Visa as enabled payment option")
    public void user_sees_visa_as_enabled_payment_option() {
      Assert.assertTrue(orderPage.visaRadioBtn.isEnabled());
    }
    @Then("user sees MasterCard as enabled payment option")
    public void user_sees_master_card_as_enabled_payment_option() {
        ;
        Assert.assertTrue(orderPage.masterCardRadioBtn.isEnabled());
    }
    @Then("user sees American Express as enabled payment option")
    public void user_sees_american_express_as_enabled_payment_option() {
       Assert.assertTrue(orderPage.americanExpressRadioBtn.isEnabled());
    }

    @And("user enters quantity {string}")
    public void userEntersQuantity(String arg0) {

        orderPage.inputQuantity.clear();
        orderPage.inputQuantity.sendKeys("2");
    }

    @Then("user clicks to the calculate button")
    public void userClicksToTheCalculateButton() {
        orderPage.calculateButton.click();
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String name) {
        orderPage.inputName.sendKeys(name);
    }

    @And("user enters street {string}")
    public void userEntersStreet(String street) {
        orderPage.inputStreet.sendKeys(street);

    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {

        orderPage.inputCity.sendKeys(city);
    }

    @And("user enters state {string}")
    public void userEntersState(String state) {
        orderPage.inputState.sendKeys(state);

    }

    @And("user enters zip {string}")
    public void userEntersZip(String zip) {
        orderPage.inputZip.sendKeys(zip);
    }

    @And("user select payment option {string}")
    public void userSelectPaymentOption(String expectedCardType) {
    BrowserUtilsADAM.clickRadioButton(orderPage.cardTypes,expectedCardType);

    }

    @And("user enters credit card number{string}")
    public void userEntersCreditCardNumber(String cardNumber) {
        orderPage.inputCreditCard.sendKeys(cardNumber);
    }

    @And("user enters expiration date {string}")
    public void userEntersExpirationDate(String expDate) {

        orderPage.cardExpiration.sendKeys(expDate);
    }

    @And("user clicks to process order button")
    public void userClicksToProcessOrderButton() {
        orderPage.processBtn.click();
    }

    WT_ViewAllOrdersPage wtViewAllOrdersPage= new WT_ViewAllOrdersPage();
    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {

        String actualName = wtViewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(actualName,expectedName);

    }

    @Then("user sees below options under product dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> listOptins) {

        List <String> expectedOptions = BrowserUtilsADAM.dropdownOptions_as_STRING(orderPage.productDropDown);
        Assert.assertEquals(listOptins,expectedOptions);
    }





}
