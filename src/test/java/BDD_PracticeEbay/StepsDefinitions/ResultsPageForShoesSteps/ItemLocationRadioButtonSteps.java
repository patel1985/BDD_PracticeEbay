package BDD_PracticeEbay.StepsDefinitions.ResultsPageForShoesSteps;

import BDD_PracticeEbay.PageObject.ResultPageForSohes;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class ItemLocationRadioButtonSteps {

    ResultPageForSohes resultpageforshoes = new ResultPageForSohes();

    @When("user is select any item location")
    public void user_is_select_any_item_location() throws IOException {
        resultpageforshoes.clickItemLocationRadioButton();
    }
    @Then("user should able to see the products from selected location option only")
    public void user_should_able_to_see_the_products_from_selected_location_option_only() {
        resultpageforshoes.assrtionForItemLocationRadioButton();
    }

}
