package cydeo.step_definitions;

import cydeo.pages.GoogleSearchPage;
import cydeo.utilties.ConfigurationReader;
import cydeo.utilties.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleSearchStepDefs {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on the google page")
    public void userIsOnTheGooglePage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @When("user types apple in the google search box and click enter")
    public void userTypesAppleInTheGoogleSearchBoxAndClickEnter() {


        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user sees apple in the page title")
    public void userSeesAppleInThePageTitle() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));
    }


    @When("user types orange in the google search box and click enter")
    public void user_types_orange_in_the_google_search_box_and_click_enter() {
        googleSearchPage.searchBox.sendKeys("orange" + Keys.ENTER);
    }

    @Then("user sees orange in the page title")
    public void user_sees_orange_in_the_page_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("orange"));
    }

    @When("user types {string} in the google search box and click enter")
    public void user_types_in_the_google_search_box_and_click_enter(String string) {

        googleSearchPage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("user sees {string} in the page title")
    public void user_sees_in_the_page_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

    @Then("user should be able to search for following:")
    public void user_should_be_able_to_search_for_following(List<String> searchKeywords) {

        for (String eachKeyword : searchKeywords) {
            googleSearchPage.searchBox.clear();
            googleSearchPage.searchBox.sendKeys(eachKeyword+Keys.ENTER);
        }
    }


    @When("user searches for {string} capital")
    public void user_searches_for_capital(String string) {
        googleSearchPage.searchBox.sendKeys("capital of "+ string + Keys.ENTER);
    }

    @Then("user should see {string} in the result")
    public void user_should_see_in_the_result(String capitalCity) {

        Assert.assertEquals(capitalCity,googleSearchPage.resultText.getText());
    }


}
