package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By skipDemoLink = By.xpath("//*[@id=\"ctnr-homepage\"]/div[1]/a");
    private By birthIntoInequalityLink = By.xpath("//*[@id=\"ctnr-homepage\"]/div[3]/div/div[2]/p/a/span[2]");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public DemoPage clickSkipDemo(){
        driver.findElement(skipDemoLink).click();

        return null;
    }
    public BirthIntoInequalityPage clickBirthIntoInequality(){
        driver.findElement(birthIntoInequalityLink).click();
        return new BirthIntoInequalityPage(driver);
    }
    //private void clickLink(String linkText) {
      //  driver.findElement(By.linkText(linkText)).click();
}


