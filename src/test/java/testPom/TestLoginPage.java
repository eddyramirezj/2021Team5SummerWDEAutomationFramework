package testPom;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TestLoginPage extends TestBase {

    @Test
    public void testSignInButton() {
        getHomepage().goToLoginPage();

        String expectedResults = "Amazon.com: Sign In";
        String actualResults = driver.findElements(By.cssSelector("#nav-flyout-ya-signin > a > span")).toString();

        Assert.assertEquals(actualResults, expectedResults);

        @Test
        public void testEmailFunction () {
            getHomepage().goToLoginPage();

            String expectedResults = "Amazon.com: Sign In";
            String actualResults = driver.findElements(By.cssSelector("#ap_email")).toString();

            Assert.assertEquals(actualResults, expectedResults);

            @Test
            public void testContinueButton () {
                getHomepage().goToLoginPage();

                String expectedResults = "Amazon.com: Sign In";
                String actualResults = driver.findElements(By.cssSelector("#continue")).toString();

                Assert.assertEquals(actualResults, expectedResults);

                @Test
                public void testNeedHelpButton () {
                    getHomepage().goToLoginPage();

                    String expectedResults = "Amazon.com: Sign In";
                    String actualResults = driver.findElements(By.cssSelector("#authportal-main-section > div:nth-child(2) > div > div.a-section > form > div > div > div > div:nth-child(5) > div > a > span")).toString();

                    Assert.assertEquals(actualResults, expectedResults);

                    @Test
                    public void testForgotPasswordButton () {
                        getHomepage().goToLoginPage();

                        String expectedResults = "Amazon.com: Sign In";
                        String actualResults = driver.findElements(By.cssSelector("#auth-fpp-link-bottom")).toString();

                        Assert.assertEquals(actualResults, expectedResults);
                    }
                }
            }
        }
    }
}
