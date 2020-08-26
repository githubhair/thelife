package runaway;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.RunawayPage;

public class RunawayTests extends BaseTests {
    private RunawayPage runawayPage;

    @Test
    public void clickRunawayLink() throws InterruptedException{
        runawayPage = homePage.clickAboutLink().hoverOverMainMenu().clickRunawayLink();
    }
}
