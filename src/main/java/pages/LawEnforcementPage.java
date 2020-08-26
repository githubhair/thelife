package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;


public class LawEnforcementPage extends BaseChildPage {
    public LawEnforcementPage(WebDriver driver){super(driver);}

    public LawEnforcementPage validateLawEnforcementText(){
        return new LawEnforcementPage(driver);

    }
}

