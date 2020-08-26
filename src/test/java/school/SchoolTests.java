package school;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SchoolPage;

public class SchoolTests extends BaseTests {
    private SchoolPage schoolPage;

    @Test
    public void setSchoolPage() throws InterruptedException{
        schoolPage = homePage.clickAboutLink().hoverOverMainMenu().clickSchoolLink();
    }
}
