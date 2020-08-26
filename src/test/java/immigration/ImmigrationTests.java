package immigration;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AboutPage;
import pages.ImmigrationPage;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.assertEquals;

public class ImmigrationTests extends BaseTests {
    private ImmigrationPage immigrationPage;

    @BeforeTest
    public void clickImmigrationLink() throws InterruptedException {
        immigrationPage = homePage.clickAboutLink().hoverOverMainMenu().clickImmigrationLink();
    }

    @Test
    public void test_UsingHardAssertion() throws InterruptedException {
        Assert.assertEquals(immigrationPage.getTextTest(), "An immigrant girl or woman who ends up in the Life in the US was likely vulnerable long before she got here.");
    }
}