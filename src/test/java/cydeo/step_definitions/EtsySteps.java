package cydeo.step_definitions;

import cydeo.pages.EtsyPage;
import cydeo.utilties.BrowserUtils;
import cydeo.utilties.BrowserUtilsADAM;
import cydeo.utilties.ConfigurationReader;
import cydeo.utilties.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class EtsySteps {

    EtsyPage etsyPage = new EtsyPage();

    @Given("User is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }
    @Then("User should see title is as expected.")
    public void user_should_see_title_is_as_expected() {

        String expectedTitle ="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
        BrowserUtilsADAM.verifyTitle(expectedTitle);
    }


    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");

    }
    @When("User clicks search button")
    public void user_clicks_search_button() {

        etsyPage.searchBtn.click();
    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
       BrowserUtilsADAM.verifyTitle("Wooden spoon - Etsy");
    }

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String string) {
        etsyPage.searchBox.sendKeys(string);

    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {

        BrowserUtilsADAM.verifyTitle(expectedTitle);

    }
}
