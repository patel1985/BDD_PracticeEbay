package BDD_PracticeEbay.StepsDefinitions.HomePageSteps;

import BDD_PracticeEbay.PageObject.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SportLeisureAutoDropdownListSteps {

    HomePage homepage = new HomePage();

    @When("user click one of the category from the Sport&Leisure auto dropdown list")
    public void user_click_one_of_the_category_from_the_sport_leisure_auto_dropdown_list() {
        homepage.clickProductFromSportsAndLeisureAutoDropdown();
    }
    @Then("user should able to see the related products page")
    public void user_should_able_to_see_the_related_products_page() {
        homepage.assertionForFootballPage();
    }

}
