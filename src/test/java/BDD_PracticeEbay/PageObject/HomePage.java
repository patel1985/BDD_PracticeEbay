package BDD_PracticeEbay.PageObject;

import BDD_PracticeEbay.BaseClassPackage.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;

public class HomePage extends DriverFactory {

    //For Individual Product search
    @FindBy(id = "gh-ac")
    WebElement searchBox;

    @FindBy(id = "gh-btn")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[2]")
    WebElement shoesProductPage;

    public void assertionHomepage(){
        String expectedURL = driver.getCurrentUrl();
        Assert.assertThat(expectedURL,is("https://www.ebay.co.uk/"));
    }
    public void searchItem(String items){
        searchBox.click();
        searchBox.sendKeys(items);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
    public void assertionShoesPage(){
        String expectedPage = shoesProductPage.getText();
        Assert.assertThat(expectedPage,containsString("Shoes"));
    }
    public void multiSearch(String items){
        searchBox.sendKeys(items);
        searchButton.click();
    }

    //For Multi-Product search
    @FindBy(xpath = "//span[contains(text(),'Mens Jecket')]")
    WebElement MensJecketpageHeader;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[2]")
    WebElement laptopPageHeader;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/div[2]/div[2]/div[1]/div[1]/h1/span[2]")
    WebElement watchPageHeader;

    public void asertionMultiProductSearch(){

        String s = "items";

        if (s=="Mens Jeckets"){
            String expectedHeader1 = MensJecketpageHeader.getText();
            Assert.assertThat(expectedHeader1,is("Mens Jecket"));
        }else if(s=="Laptop"){
            String expectedHeader2 = laptopPageHeader.getText();
            Assert.assertThat(expectedHeader2,is("Laptop"));
        }else if (s=="watches"){
            String expectedHeader3 = watchPageHeader.getText();
            Assert.assertThat(expectedHeader3,is("watches"));
        }
    }

    //For Daily Deals Product search
    @FindBy(xpath = "//a[contains(text(),'Daily Deals')]")
    WebElement dailydealsButton;

    @FindBy(linkText = "Deals")
    WebElement dealsPageHeader;

    public void searchDailyDealsProducts(){
        dailydealsButton.click();
    }
    public void assertionForDailyDealsProducts(){
        String expecteddealpageHeader = dealsPageHeader.getText();
        Assert.assertThat(expecteddealpageHeader,is("Deals"));
    }

    //For My Ebay Auto Dropdown List Product search
    @FindBy(xpath = "//*[@id=\"gh-eb-My\"]/div/a[1]")
    WebElement myEbayList;

    @FindBy(xpath = "//a[contains(text(),'Bids/Offers')]")
    WebElement bidOffers;

    @FindBy(id = "userid")
    WebElement userNameBox;

    @FindBy(id = "signin-continue-btn")
    WebElement userNameContinueButton;

    @FindBy(id = "pass")
    WebElement passwordBox;

    @FindBy(id = "sgnBt")
    WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"biddinglist\"]/div[1]/div/h2")
    WebElement biddingPageHeader;

    public void clickItemFromAutoDropdownList(){

        Actions actions = new Actions(driver);
        actions.moveToElement(myEbayList).perform();
        sleep(3000);
        actions.moveToElement(bidOffers).click().perform();

        userNameBox.sendKeys("ptlunnati@yahoo.co.in");
        userNameContinueButton.click();
        passwordBox.sendKeys("Harshul@23");
        signInButton.click();
        sleep(5000);

    }
    public void assertionForBidOfferPage(){
        //String expectedPageHeaderForBidding = biddingPageHeader.getText();
        //Assert.assertThat(expectedPageHeaderForBidding,is("Bidding"));

        String expectedURLForBiddingOfferPage = driver.getCurrentUrl();
        Assert.assertThat(expectedURLForBiddingOfferPage,is(endsWith("BidsOffers")));
    }

    //For Sports&Leisure Auto Dropdown List Product search

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")
    WebElement sportsAndLeisureBtn;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[3]/a")
    WebElement footballBtn;

    @FindBy(xpath = "//span[contains(text(),'Football Equipment')]")
    WebElement footbalPageHeading;

    public void clickProductFromSportsAndLeisureAutoDropdown(){

        Actions actions = new Actions(driver);
        actions.moveToElement(sportsAndLeisureBtn).perform();
        sleep(3000);
        actions.moveToElement(footballBtn).click().perform();
        sleep(3000);
    }
    public void assertionForFootballPage(){
        String expectedfootballpageheading = footbalPageHeading.getText();
        Assert.assertThat(expectedfootballpageheading,is("Football Equipment"));
    }

} //Class Ends
