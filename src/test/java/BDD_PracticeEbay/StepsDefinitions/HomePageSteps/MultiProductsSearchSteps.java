package BDD_PracticeEbay.StepsDefinitions.HomePageSteps;

import BDD_PracticeEbay.PageObject.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiProductsSearchSteps {

    HomePage homepage = new HomePage();

    @When("user types {string} in search box")
    public void user_types_in_search_box(String items) {
        homepage.multiSearch(items);
    }
    @Then("user should able to see respective products related to search")
    public void user_should_able_to_see_respective_products_related_to_search() {
        homepage.asertionMultiProductSearch();
    }


}
