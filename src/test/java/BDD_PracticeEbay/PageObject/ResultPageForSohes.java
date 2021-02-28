package BDD_PracticeEbay.PageObject;

import BDD_PracticeEbay.BaseClassPackage.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

public class ResultPageForSohes extends DriverFactory {

    //For Shoes Size Checkbox
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[2]")
    WebElement shoespageheader;

    @FindBy(css = ".cbx.x-refine__multi-select-cbx")
    List<WebElement> shoesSizeCheckboxes;

    @FindBy(xpath = "//*[@id=\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\"]/li[1]/div/a/div")
    WebElement shoesSizePageheading;

    @FindBy(xpath = "//*[@id=\"x-refine__group_1__0\"]/ul/li[1]/div/a/div/span/input")
    WebElement size8Checkbox;

    public void assertionForShoesResultpage(){
        String expectedshoespageheader = shoespageheader.getText();
        Assert.assertThat(expectedshoespageheader,is("Shoes"));
    }
    public void selectShoesSize() throws IOException {
        List<WebElement> shoesSizes = shoesSizeCheckboxes;
        for (WebElement shoesSize : shoesSizes){
            System.out.println(shoesSize.getText());
            if (shoesSize.getText().contains("UK 8")){
                shoesSize.click();
                sleep(5000);
                break;
            }
        }

        File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("C:\\Users\\unnati\\Desktop\\Testing DOCS\\Ketan Lectures\\ScreenShot\\shoesSize-8.png");
        FileUtils.copyFile(sourcefile,destinationfile);
    }
    public void assertionForSelectedShoesSize(){
        String expectedShoesizePage = driver.getCurrentUrl();
        Assert.assertThat(expectedShoesizePage,is(containsString("Size=UK%25208")));

    }

    //For Shoes Price Ranges

    @FindBy(css = ".x-refine__multi-select.x-refine__multi-select")
    List<WebElement> shoesPriceRangeCheckbox;

    @FindBy(css = ".s-item__price")
    List<WebElement> shoesProductPrices;

    public void selectShoesPriceRange(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2100);");

        List<WebElement> priceRanges = shoesPriceRangeCheckbox;
        for (WebElement pricerange : priceRanges){
            System.out.println(pricerange.getText());
            if (pricerange.getText().contains("£4.00 to £10.00")){
                pricerange.click();
                break;
            }
        }
    }

    public void assrtionForPriceRange(){
       /*/ List<WebElement> shoesPrices = shoesProductPrices;
        for (WebElement shoesPrice : shoesPrices){
            System.out.println(shoesPrice.getText());

            String priceWithoutSign = shoesPrice.getText().replace("£","");

            double priceInDouble = Double.parseDouble(priceWithoutSign);
            System.out.println(priceInDouble);

            Assert.assertThat(priceInDouble,is(greaterThanOrEqualTo(4.0)));
            Assert.assertThat(priceInDouble,is(lessThanOrEqualTo(10.0)));

       // Some prices are like £9.99 to £13.99 this so its give me exception "java.lang.numberformatexception".
       // Need to ask any other ways to resolve this exception????

        }*/

       String expectedURL = driver.getCurrentUrl();
       Assert.assertThat(expectedURL,is(containsString("_udlo=4&_udhi=10")));
    }

    //For Item Location

    @FindBy(xpath = "//*[@id=\"x-refine__group__5\"]/ul/li[3]/div/a/div/span/input")
    WebElement itemLocationRadioButton;

    public void clickItemLocationRadioButton() throws IOException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2400);");

        itemLocationRadioButton.click();

        File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("C:\\Users\\unnati\\Desktop\\Testing DOCS\\Ketan Lectures\\ScreenShot\\shoesRadioButton.png");
        FileUtils.copyFile(sourcefile,destinationfile);

    }
    public void assrtionForItemLocationRadioButton(){
        Assert.assertTrue(itemLocationRadioButton.isSelected());
    }


} //Class Ends
