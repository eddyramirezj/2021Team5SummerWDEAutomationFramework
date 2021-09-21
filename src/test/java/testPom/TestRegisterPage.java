package testPom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TestRegisterPage extends TestBase {

    @Test
    public void testNavigateToSignInPage()
    {
        getRegisterPage().navigateToRegisterPageFromSignInPage();
    }

    @Test
    public void registerAccountFromRegisterPage()
    {
        getRegisterPage().navigateToRegisterPageFromSignInPage();
        getRegisterPage().registerAccountFromRegisterPage("Poyesh", "prefahi999@gmail.com", "Snowy1", "Snowy1");

        String expectedResults = "Verify email address";
        String actualResults = driver.findElement(By.xpath("//h1[contains(text(), 'Verify email address')]")).toString();
        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void registerAccountFromRegisterPageWithInvalidEmail()
    {
        getRegisterPage().navigateToRegisterPageFromSignInPage();
        getRegisterPage().registerAccountFromRegisterPage("Poyesh", "prefahi99@gmail.com", "Snowy1", "Snowy1");

        String expectedResults = "Verify email address";
        String actualResults = driver.findElement(By.xpath("//h1[contains(text(), 'Verify email address')]")).toString();
        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void registerAccountFromRegisterPageWithPhoneNumber()
    {
        getRegisterPage().navigateToRegisterPageFromSignInPage();
        getRegisterPage().registerAccountFromRegisterPage("Poyesh", "7039866555", "Snowy1", "Snowy1");

        String expectedResults = "Verify email address";
        String actualResults = driver.findElement(By.xpath("//h1[contains(text(), 'Verify email address')]")).toString();
        Assert.assertEquals(actualResults, expectedResults);

    }
    @Test
    public void registerAccountFromRegisterPageWithWrongPassword2()
    {
        getRegisterPage().navigateToRegisterPageFromSignInPage();
        getRegisterPage().registerAccountFromRegisterPage("Poyesh", "prefahi999@gmail.com", "Snowy1", "Snowy2");

        String expectedResults = "Verify email address";
        String actualResults = driver.findElement(By.xpath("//h1[contains(text(), 'Verify email address')]")).toString();
        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void registerAccountFromRegisterPageWithInvalidCharForName()
    {
        getRegisterPage().navigateToRegisterPageFromSignInPage();
        getRegisterPage().registerAccountFromRegisterPage("Poyesh!", "prefahi99@gmail.com", "Snowy1", "Snowy1");

        String expectedResults = "Verify email address";
        String actualResults = driver.findElement(By.xpath("//h1[contains(text(), 'Verify email address')]")).toString();
        Assert.assertEquals(actualResults, expectedResults);

    }
    }


