package abuse;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BirthIntoInequalityPage;
import pages.ChildSexualAbusePage;

import java.util.List;

public class ChildSexualAbuseTests extends BaseTests {

    private ChildSexualAbusePage childSexualAbusePage;
    private By lawEnforcementLink = By.linkText("https://thelifestory.org/law-enforcement");

    @Test
    public void clickChildSexualAbuseLink() throws InterruptedException {
        homePage.clickAboutLink().hoverOverMainMenu().
                clickChildSexualAbuseLink().scrollThenClickLawEnforcement(0, 800);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement lawEnforcementLink : allLinks) {
            if (lawEnforcementLink.getText().equals("https://thelifestory.org/law-enforcement")) {
                //SOPL("Link found");
                break;
            }
        }
    }
}
