package step_definitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SearchOnAmazon_StepDefinition extends WebAPI {
    // Cucumber Hook
    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.amazon.com/");
    }
    @After
    public void closeBrowser() {
        cleanUp();
    }

    static HomePage homePage; // Reference Variable/ object of HomePage

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Given("I am at amazon Home Page")
    public void i_am_at_amazon_Home_Page() throws IOException {
        getInitElements();
    }

    @And("I Enter Hand Sanitizer in search input field")
    public void i_Enter_Hand_Sanitizer_in_search_input_field() {
        getInitElements();
    homePage.enterKeyWord("Hand Sanitizer");
    }

    @When("I Click search button")
    public void i_Click_search_button() {
        getInitElements();
    homePage.clickSearchButton();
    }

    @Then("I should see Hand Sanitizer")
    public void i_should_see_Hand_Sanitizer() {
        getInitElements();
        homePage.validateSearchProduct("\"Hand Sanitizer\"");
    }


}
