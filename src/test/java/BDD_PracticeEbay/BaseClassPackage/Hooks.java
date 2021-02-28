package BDD_PracticeEbay.BaseClassPackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

   public DriverFactory driverFactory = new DriverFactory();

   @Before
    public void setUp(){
        driverFactory.openBrowser();
    }

    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }
}
