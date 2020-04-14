package base;

import circlelinks.BirthIntoInequalityTests;
import demos.SkipDemoTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BirthIntoInequalityPage;
import pages.DemoPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    protected WebDriver driver; //protected means extended classes will see this.
    protected HomePage homePage;
    private BirthIntoInequalityTests birthIntoInequalityTests;


    @BeforeTest
    public void baseSetup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://thelifestory.org");

        //System.out.println(driver.getTitle());
        //driver.manage().window().maximize();

        homePage = new HomePage(driver);
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.clickSkipDemo();
    }

//    @AfterClass
//    public void cleanUp() {
//        driver.quit();
//    }
}


