package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.imageio.stream.ImageInputStream;

public class ImmigrationPage extends BaseChildPage {
    private By vulnerableText = By.xpath("//h3[contains(.,'An immigrant girl or woman who ends up in the Life in the US was likely vulnerab')]");

    public ImmigrationPage(WebDriver driver){super(driver);}

    public String getTextTest(){
        wait.until(ExpectedConditions.elementToBeClickable(vulnerableText));

        String actualString = driver.findElement(vulnerableText).getText();
        return actualString;
    }
}

