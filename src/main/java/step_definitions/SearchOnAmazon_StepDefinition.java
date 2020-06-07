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
import java.util.List;

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


    @Given("I Enter {string} in search input field")
    public void i_Enter_in_search_input_field(String string) {
        getInitElements();
        homePage.enterKeyWord(string);
    }

    @Then("I should see {string}")
    public void i_should_see(String string) {
        getInitElements();
        homePage.validateSearchProduct(string);
    }


    @Given("I Enter Items in search input field")
    public void i_Enter_Items_in_search_input_field(List<String> items) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        getInitElements();
        homePage.validateSearchProduct(items);


    }


//    @Then("I should see (.*)")
//    public void i_should_see(List<String> string) {
//        getInitElements();
//        homePage.validateSearchProduct(string);
//    }

//    @Then("I should see \"\"T shirt\"\"")
//    public void i_should_see_T_shirt() {
//
//    }
//
//    @Then("I should see \"\"Hand soap\"\"")
//    public void i_should_see_Hand_soap() {
//
//    }
//
//    @Then("I should see \"\"I Phone {int} Pro Max\"\"")
//    public void i_should_see_I_Phone_Pro_Max(Integer int1) {
//
//    }


}
