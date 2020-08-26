package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseChildPage extends BasePage { //abstract
    private By initializePlayButton = By.xpath("//*[@id=\"video-hero\"]/div/div[2]/div/button/div");
    private By lawEnforcementLink = By.xpath("//*[@id=\"ctnr-child-sexual-abuse\"]/div/div[21]/div[3]/div/div[12]/div/a");


    private By mainMenu = By.xpath("//*[@id=\"app\"]/div[2]/p[1]");



    BaseChildPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 10);
    }

    public HoverMenuPage hoverOverMainMenu() throws InterruptedException {
        //WebElement hover = driver.findElement(By.xpath(//*[@id="app"]/div[2]/p[1]));

        Actions actions = new Actions(driver);
        WebElement main = driver.findElement((By.xpath("//*[@id=\"app\"]/div[2]")));
        actions.moveToElement(main).moveToElement(driver.findElement(mainMenu)).build().perform();
        return new HoverMenuPage(driver);
    }


    public void clickInitializePlayButton(int h, int v) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(initializePlayButton));

            JavascriptExecutor js = (JavascriptExecutor) driver; //casting the javascriptExecutor
            js.executeScript("window.scroll(" + h + ", " + v + ")");
            driver.findElement(initializePlayButton).click();
        }
        catch (Exception e) {
            System.out.println("The system threw an exception");
        }
    }
            public void scrollThenClickLawEnforcement(int h, int v){

        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(lawEnforcementLink));

            JavascriptExecutor js = (JavascriptExecutor) driver; //casting the javascriptExecutor
            js.executeScript("window.scroll(" + h + ", " + v + ")");
            driver.findElement(lawEnforcementLink).click();
        }
        catch (Exception e) {
            System.out.println("The system threw an exception");
        }
    }
}