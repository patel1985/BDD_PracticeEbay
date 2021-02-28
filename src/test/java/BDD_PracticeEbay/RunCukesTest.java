package BDD_PracticeEbay;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\ResultPageForShoes.feature",tags = "@ShoesPriceRanges")

class RunCukesTest {
}
