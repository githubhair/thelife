package traumaandaddiction;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.TraumaAndAddictionPage;

public class TraumaAndAddictionTests extends BaseTests {
    private TraumaAndAddictionPage traumaAndAddictionTests;

    @Test
    public void clickTramaAndAddictionLink() throws InterruptedException{
        traumaAndAddictionTests = homePage.clickAboutLink().hoverOverMainMenu().clickTraumaAndAddictionLink();
    }
}
