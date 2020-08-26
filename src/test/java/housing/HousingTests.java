package housing;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HousingPage;

public class HousingTests extends BaseTests {

    private HousingPage housingPage;

    @Test
    public void clickHousingPageLink() throws InterruptedException{
        housingPage = homePage.clickAboutLink().hoverOverMainMenu().clickHousingLink();
    }
}
