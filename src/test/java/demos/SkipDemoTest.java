package demos;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DemoPage;

public class SkipDemoTest extends BaseTests {

    @Test
    public void testSkipDemo() {
        DemoPage demoPage = homePage.clickSkipDemo();
    }
}
