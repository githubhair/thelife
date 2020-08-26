package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildSexualAbusePage extends BaseChildPage {
    //private By lawEnforcementLink = By.xpath("//*[@id=\"ctnr-child-sexual-abuse\"]/div/div[21]/div[3]/div/div[12]/div/a");
    private By lawEnforcementLink = By.linkText("https://thelifestory.org/law-enforcement");
    ChildSexualAbusePage(WebDriver driver) {
        super(driver);
    }

    public ChildSexualAbusePage clickLawEnforcementBottomLink(){
        driver.findElement(lawEnforcementLink).click();
        return new ChildSexualAbusePage(driver);
        }
}
