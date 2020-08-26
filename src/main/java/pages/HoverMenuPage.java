package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverMenuPage extends BaseChildPage {
    String selector;


    //private By linkName = By.linkText(selector);

    private By birthIntoInequality = By.xpath("//*[@id=\"app\"]/div[2]/a[1]");
    private By childSexualAbuseLink = By.xpath("//*[@id=\"app\"]/div[2]/a[2]");
    private By fosterCareLink = By.xpath("//*[@id=\"app\"]/div[2]/a[3]");
    private By schoolLink = By.xpath("//*[@id=\"app\"]/div[2]/a[4]");
    private By runawayLink = By.xpath("//*[@id=\"app\"]/div[2]/a[5]");
    private By immigrationLink = By.xpath("//*[@id=\"app\"]/div[2]/a[6]");
    private By entryIntoTheLifeLink = By.xpath("//*[@id=\"app\"]/div[2]/a[7]");
    private By medicalEmergencyLink = By.xpath("//*[@id=\"app\"]/div[2]/a[8]");
    private By motherhoodLink = By.xpath("//*[@id=\"app\"]/div[2]/a[9]");
    private By housingLink = By.xpath("//*[@id=\"app\"]/div[2]/a[10]");
    private By traumaAndAddictionLink = By.xpath("//*[@id=\"app\"]/div[2]/a[11]");
    private By lawEnforcementLink = By.xpath("//*[@id=\"app\"]/div[2]/a[12]");
    private By theLongExitLink = By.xpath("//*[@id=\"app\"]/div[2]/a[13]");

    public HoverMenuPage(WebDriver driver) {
        super(driver);

    }

    public BirthIntoInequalityPage clickBirthIntoInequalityLink() {
        driver.findElement(birthIntoInequality).click();
        return new BirthIntoInequalityPage(driver);

    }

    public ChildSexualAbusePage clickChildSexualAbuseLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(childSexualAbuseLink));
        driver.findElement(childSexualAbuseLink).click();
        return new ChildSexualAbusePage(driver);
    }

    public FosterCarePage clickFosterCareLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(fosterCareLink));
        driver.findElement(fosterCareLink).click();
        return new FosterCarePage(driver);
    }

    public SchoolPage clickSchoolLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(schoolLink));
        driver.findElement(schoolLink).click();
        return new SchoolPage(driver);
    }

    public RunawayPage clickRunawayLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(runawayLink));
        driver.findElement(runawayLink).click();
        return new RunawayPage(driver);
    }

    public ImmigrationPage clickImmigrationLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(immigrationLink));
        driver.findElement(immigrationLink).click();
        return new ImmigrationPage(driver);
    }

    public MedicalEmergencyPage clickMedicalEmergencyLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(medicalEmergencyLink));
        driver.findElement(medicalEmergencyLink).click();
        return new MedicalEmergencyPage(driver);
    }

    public EntryIntoTheLifePage clickEntryIntoTheLifeLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(entryIntoTheLifeLink));
        driver.findElement(entryIntoTheLifeLink).click();
        return new EntryIntoTheLifePage(driver);
    }

    public MotherhoodPage clickMotherhoodLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(motherhoodLink));
        driver.findElement(motherhoodLink).click();
        return new MotherhoodPage(driver);
    }

    public HousingPage clickHousingLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(housingLink));
        driver.findElement(housingLink).click();
        return new HousingPage(driver);
    }

    public TraumaAndAddictionPage clickTraumaAndAddictionLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(traumaAndAddictionLink));
        driver.findElement(traumaAndAddictionLink).click();
        return new TraumaAndAddictionPage(driver);
    }

    public LawEnforcementPage clickLawEnforcementLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lawEnforcementLink));
        driver.findElement(lawEnforcementLink).click();
        return new LawEnforcementPage(driver);
    }

    public TheLongExitPage clickTheLongExitLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(theLongExitLink));
        driver.findElement(theLongExitLink).click();
        return new TheLongExitPage(driver);
    }
}