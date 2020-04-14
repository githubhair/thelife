package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoversPage {
    private WebDriver driver;
    private By menu = By.className(".sidenav show");

   public HoversPage(WebDriver driver) {
       this.driver = driver;
    }
}
