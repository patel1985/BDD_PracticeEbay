package BDD_PracticeEbay.StepsDefinitions.ResultsPageForShoesSteps;

import BDD_PracticeEbay.PageObject.ResultPageForSohes;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoesPriceRangeSteps {

    ResultPageForSohes resultpageforsohes = new ResultPageForSohes();

    @When("user select any price range checkbox")
    public void user_select_any_price_range_checkbox() {
        resultpageforsohes.selectShoesPriceRange();
    }
    @Then("user should able to see all shoes within that price ranges")
    public void user_should_able_to_see_all_shoes_within_that_price_ranges() {
        resultpageforsohes.assrtionForPriceRange();
    }
}
