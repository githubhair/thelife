package medicalemergency;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MedicalEmergencyPage;

public class MedicalEmergencyTests extends BaseTests {
    private MedicalEmergencyPage medicalEmergencyPage;

    @Test
    public void MedicalEmergencyPage() throws InterruptedException{
        medicalEmergencyPage = homePage.clickAboutLink().hoverOverMainMenu().clickMedicalEmergencyLink();
    }
}
