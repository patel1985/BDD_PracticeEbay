package BDD_PracticeEbay.StepsDefinitions.ResultsPageForShoesSteps;

import BDD_PracticeEbay.PageObject.ResultPageForSohes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class ShoeSizeCheckboxSteps {

    ResultPageForSohes resultpageforshoes = new ResultPageForSohes();

    @Given("user is on shoes Resultpage of Ebay website")
    public void user_is_on_shoes_resultpage_of_ebay_website() {
        resultpageforshoes.assertionForShoesResultpage();
    }
    @When("user select one of the shoes size")
    public void user_select_one_of_the_shoes_size() throws IOException {
        resultpageforshoes.selectShoesSize();
    }
    @Then("user able to see all shoes products related selected sizes")
    public void user_able_to_see_all_shoes_products_related_selected_sizes() {
        resultpageforshoes.assertionForSelectedShoesSize();
    }

}
