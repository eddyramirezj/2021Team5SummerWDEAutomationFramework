package baseAPI.listeners;

import baseAPI.BasePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.*;


public class Register {
    private BasePage basePage= new basePage();

    String absPath = System.getProperty("user.dir");
    String website = "https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fbestsellers%2F%3F_encoding%3DUTF8%26ie%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
    static ChromeDriver driver;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", basePage.PROPERTIES_RELATIVE_PATH);
        driver = new ChromeDriver();
        driver.get(website);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @Test
    public void enterName () {
        WebElement enterName = (WebElement) driver.findElements(By.cssSelector("#ap_customer_name"));
        enterName.sendKeys("Poyesh Refahi");
        enterName.sendKeys(Keys.TAB);

    }
    @Test
    public void enterEmail () {
        WebElement enterEmail = (WebElement) driver.findElements(By.cssSelector("#ap_email"));
        enterEmail.sendKeys("prefahi99@gmail.com");
        enterEmail.sendKeys(Keys.TAB);

    }
    @Test
    public void enterPassWord () {
        WebElement enterPassWord = (WebElement) driver.findElements(By.cssSelector("#ap_email"));
        enterPassWord.sendKeys("Snowy2011!");
        enterPassWord.sendKeys(Keys.TAB);

    }

    @Test
    public void reenterPassWord () {
        WebElement reenterPassWord = (WebElement) driver.findElements(By.cssSelector("#ap_password_check"));
        reenterPassWord.sendKeys("Snowy2011!");
        reenterPassWord.sendKeys(Keys.TAB);

    }
    @Test
    public void clickContinue() {
        WebElement clickContinue = (WebElement) driver.findElements(By.cssSelector("#continue"));
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#continue"));
        driver.findElement().click();

    }


    @After
    public void close () {
        driver.close();
        driver.quit();
    }
}
