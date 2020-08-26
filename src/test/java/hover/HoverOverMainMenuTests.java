package hover;

import base.BaseTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AboutPage;
import pages.BaseChildPage;
import pages.HomePage;
import pages.HoverMenuPage;

public class HoverOverMainMenuTests extends BaseTests {

    private HoverMenuPage hoverOverMainMenuPage;


    @Test
    public void AfterHoverClickBirth() throws InterruptedException {
        hoverOverMainMenuPage = homePage.clickAboutLink().hoverOverMainMenu();
    }
}