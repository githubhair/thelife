package motherhood;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MotherhoodPage;

public class MotherhoodTests extends BaseTests {
    private MotherhoodPage motherhoodPage;

    @Test
    public void clickMotherHoodLink() throws InterruptedException{
        motherhoodPage = homePage.clickAboutLink().hoverOverMainMenu().clickMotherhoodLink();
    }
}
