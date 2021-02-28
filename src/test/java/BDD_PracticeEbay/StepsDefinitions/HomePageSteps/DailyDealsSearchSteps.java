package BDD_PracticeEbay.StepsDefinitions.HomePageSteps;

import BDD_PracticeEbay.PageObject.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DailyDealsSearchSteps {

    HomePage homepage = new HomePage();

    @When("user click on daily deals from homepage")
    public void user_click_on_daily_deals_from_homepage() {
        homepage.searchDailyDealsProducts();
    }
    @Then("user should able to see all daily deals products")
    public void user_should_able_to_see_all_daily_deals_products() {
        homepage.assertionForDailyDealsProducts();
    }

}
