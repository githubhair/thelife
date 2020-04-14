package circlelinks;

import base.BaseTests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BirthIntoInequalityPage;

import java.util.concurrent.TimeUnit;

public class BirthIntoInequalityTests extends BaseTests {
    private BirthIntoInequalityPage birthIntoInequalityPage;


    @BeforeTest
    public void setUp() {
        birthIntoInequalityPage = homePage.clickBirthIntoInequality();
    }

    @Test
    public void clickInitializePlayButton(){
        birthIntoInequalityPage.clickInitializePlayButton();
    }
    @Test
    public void inTheHouseMainRealPlayButton(){
        birthIntoInequalityPage.ClickIninHouseActualPlayButton();

    }
}