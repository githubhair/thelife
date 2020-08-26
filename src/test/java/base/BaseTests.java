package base;

import circlelinks.BirthIntoInequalityTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

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
        //driver.manage().window().setSize(new Dimension(925, 950));

        homePage = new HomePage(driver);
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.clickSkipDemo();
    }
//
    @AfterClass
    public void cleanUp() {
        driver.quit();
    }
}


