package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage extends BaseChildPage{
    //private WebDriver driver;
    By faqLink = By.cssSelector("#ctnr-about > div.ctnr-nav-about > div > ul > li:nth-child(2) > a");
    By contactLink = By.xpath("//*[@id=\"ctnr-about\"]/div[1]/div/ul/li[3]/a");
    By resourcesLink = By.xpath("//*[@id=\"ctnr-about\"]/div[1]/div/ul/li[4]/a");

    AboutPage(WebDriver driver) {
        super(driver);
    }
    
        public void clickFaqLink(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(faqLink));
        }
        public void clickContactLink(){
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(contactLink));

        }
        public void clickResourceLink(){
            driver.findElement(resourcesLink).click();
    }
}
