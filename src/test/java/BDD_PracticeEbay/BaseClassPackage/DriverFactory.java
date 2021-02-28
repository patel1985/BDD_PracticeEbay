package BDD_PracticeEbay.BaseClassPackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }


    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.ebay.co.uk/");
        driver.manage().window().maximize();
        sleep(8000);
        driver.findElement(By.id("gdpr-banner-accept")).click(); //For cookies
    }


    public void closeBrowser(){
        //driver.quit();
    }

    public void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
