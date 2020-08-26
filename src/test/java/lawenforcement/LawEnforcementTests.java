package lawenforcement;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LawEnforcementPage;

import static org.testng.AssertJUnit.assertEquals;

public class LawEnforcementTests extends BaseTests {
    private LawEnforcementPage lawEnforcementPage;

    @Test
    public void clickLawEnforcementLink() throws InterruptedException{
        lawEnforcementPage = homePage.clickAboutLink().hoverOverMainMenu().clickLawEnforcementLink();
    }
    @Test
    public void validateTextLawEnforcementText() throws InterruptedException{
        homePage.clickAboutLink().hoverOverMainMenu().clickLawEnforcementLink().validateLawEnforcementText();
        assertEquals(driver.getTitle(), "The Life Story – Law Enforcement");
    }



}
