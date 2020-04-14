package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoPage {
    private WebDriver driver;
    private By validateText = By.id("HOME-PAGE");

    public void DemoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String validateHomePage(){
        return driver.findElement(validateText).getText();

    }

}

