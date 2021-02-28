package BDD_PracticeEbay.StepsDefinitions.HomePageSteps;

import BDD_PracticeEbay.PageObject.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndividualProdSearchSteps {

    HomePage homepage = new HomePage();

    @Given("user is on ebay homepage")
    public void user_is_on_ebay_homepage() {
        homepage.assertionHomepage();
    }
    @When("user types shoes in serach box")
    public void user_types_shoes_in_serach_box() {
        homepage.searchItem("Shoes");
    }
    @When("user click on search button")
    public void user_click_on_search_button() {
        homepage.clickSearchButton();
    }
    @Then("user should able to see all shoes products")
    public void user_should_able_to_see_all_shoes_products() {
        homepage.assertionShoesPage();
    }

}
