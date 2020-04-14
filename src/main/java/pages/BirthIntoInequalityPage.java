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

public class BirthIntoInequalityPage {

    private WebDriver driver;
    private By InitializePlayButton = By.xpath("//*[@id=\"video-hero\"]/div/div[2]/div/button");
    private By inHouseActualPlayButton = By.xpath("//*[@id=\"video-hero\"]/div/div[2]/div/button");
    private By childAbuseLink = By.xpath("//*[@id=\"ctnr-birth-into-inequality\"]/div/div[21]/div[3]/div/div[2]/div/a");

    public BirthIntoInequalityPage(WebDriver driver){
        this.driver = driver;
    }


    public void clickInitializePlayButton() {

          try
          {
              WebDriverWait wait = new WebDriverWait(driver,10);
              wait.until(ExpectedConditions.visibilityOfElementLocated(InitializePlayButton));

              JavascriptExecutor js = (JavascriptExecutor) driver; //casting the javascriptExecutor
              js.executeScript("window.scroll(0, 450)");
              driver.findElement(InitializePlayButton).click();
          }

          catch (Exception e)
          {
             System.out.println("The system threw and exception");
          }


    }
    public void ClickIninHouseActualPlayButton(){
        driver.findElement(inHouseActualPlayButton).click();
    }

    public ChildAbusePage clickChildAbuselink() {
        driver.findElement(childAbuseLink).click();
        return new ChildAbusePage(driver);

    }

//    public BirthIntoInequalityPage clickBirthIntoInequality(){
//            driver.findElement(birthIntoInequalityLink).click();
//            return new BirthIntoInequalityPage(driver);
//    }

}
