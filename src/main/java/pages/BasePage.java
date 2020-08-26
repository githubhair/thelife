package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.WeakHashMap;

abstract public class BasePage {
    protected WebDriver driver;
    protected HomePage homePage;
    protected WebDriverWait wait;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 100);
    }

    //Add header links - "The Life Story", "Share" and "About"

    By aboutLink = By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div/div[2]/a");

    public AboutPage clickAboutLink() {
        driver.findElement(aboutLink).click();
        return new AboutPage(driver);
    }
}