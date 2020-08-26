package about;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AboutPage;
import pages.BasePage;
import pages.BirthIntoInequalityPage;
import pages.HomePage;

public class AboutTests extends BaseTests {
    private AboutPage aboutPage;


    @BeforeTest
    public void clickAboutPageLink() {
        aboutPage = homePage.clickAboutLink();
    }
    //clicks the Contact Link on the About Page
    @Test
    public void clickContactLink() {
        aboutPage.clickContactLink();
    }

    //clicks the Resource link on the About Page
    @Test
    public void clickResourceLink() {
        aboutPage.clickResourceLink();
    }

    //Clicks the Faq Link on the about page
    @Test
    public void clickFaqLink() {
        homePage.clickAboutLink().clickFaqLink();
    }
}

