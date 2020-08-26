package pages;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class BirthIntoInequalityPage extends BaseChildPage {


    private By inHouseActualPlayButton = By.xpath("//*[@id=\"video-hero\"]/div/div[2]/div/button");
    //private By childAbuseLink = By.xpath("//*[@id=\"ctnr-birth-into-inequality\"]/div/div[21]/div[3]/div/div[2]/div/a");

    public BirthIntoInequalityPage(WebDriver driver) {
        super(driver);
    }

        public void ClickInHouseActualPlayButton(){
            driver.findElement(inHouseActualPlayButton).click();
        }
    }

