package longexit;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.TheLongExitPage;

public class TheLongExitTests extends BaseTests {
    private TheLongExitPage theLongExitPage;

    @Test
    public void clickTheLongExitLink()throws InterruptedException{
        theLongExitPage = homePage.clickAboutLink().hoverOverMainMenu().clickTheLongExitLink();
    }
}
