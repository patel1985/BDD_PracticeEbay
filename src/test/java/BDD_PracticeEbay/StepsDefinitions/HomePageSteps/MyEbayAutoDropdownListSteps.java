package BDD_PracticeEbay.StepsDefinitions.HomePageSteps;

import BDD_PracticeEbay.PageObject.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyEbayAutoDropdownListSteps {

    HomePage homepage = new HomePage();

    @When("user click one of the item from the my ebay auto dropdown list")
    public void user_click_one_of_the_item_from_the_my_ebay_auto_dropdown_list() {
            homepage.clickItemFromAutoDropdownList();
    }
    @Then("user should able to see the page related to searched")
    public void user_should_able_to_see_the_page_related_to_searched() {
            homepage.assertionForBidOfferPage();
    }

}
