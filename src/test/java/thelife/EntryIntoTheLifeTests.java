package thelife;

import base.BaseTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.EntryIntoTheLifePage;

public class EntryIntoTheLifeTests extends BaseTests {

    private EntryIntoTheLifePage entryIntoTheLifePage;

    @Test
    public void EntryIntoTheLifePage() throws InterruptedException {
        entryIntoTheLifePage = homePage.clickAboutLink().hoverOverMainMenu().clickEntryIntoTheLifeLink();
    }
}