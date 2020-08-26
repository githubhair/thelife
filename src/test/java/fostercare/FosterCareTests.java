package fostercare;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.FosterCarePage;

public class FosterCareTests extends BaseTests {
    private FosterCarePage fosterCarePage;


    @Test
    public void clickFosterCarePageLink() throws InterruptedException{
        fosterCarePage = homePage.clickAboutLink().hoverOverMainMenu().clickFosterCareLink();
    }

    public static Double multipy(double a, double b){
        return a * b;
    }
}

