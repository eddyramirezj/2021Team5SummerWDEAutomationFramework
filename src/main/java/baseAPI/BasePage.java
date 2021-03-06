package baseAPI;

import baseAPI.listeners.WebEventListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class BasePage {

    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    private static EventFiringWebDriver eventFiringWebDriver;
    public static DataReader dataReader;
    public MySQLConnection database;

    private Properties properties;
    public final String ABSOLUTE_PATH = System.getProperty("user.dir");
    public final String PROPERTIES_RELATIVE_PATH = "/src/main/resources/secret.properties";
    private final String PROP_FILE_PATH = ABSOLUTE_PATH + PROPERTIES_RELATIVE_PATH;

    @BeforeSuite (alwaysRun = true)
    public void setUp() {
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream(PROP_FILE_PATH);
            properties.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            dataReader = new DataReader();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            database = new MySQLConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Parameters({"browserName"})
    @BeforeMethod
    public void driverInit(@Optional("chrome") String browserName) {

        driver = getLocalDriver(browserName);
        webDriverWait = new WebDriverWait(driver, 7);
        driver.get(properties.getProperty("URL"));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @AfterSuite (alwaysRun = true)
    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getLocalDriver(String browserName) {

        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
        }

        eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventFiringWebDriver.register(new WebEventListener());
        driver = eventFiringWebDriver;

        return driver;
    }

    public void clickOnElement(WebElement element) {
        try {
            waitForElementToBeClickable(element);
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("COULD NOT CLICK ON ELEMENT");
        }
    }

    public void sendKeysToElement(WebElement element, String value) {
        try {
            waitForElementToBeVisible(element);
            element.sendKeys(value);
        } catch (TimeoutException e) {
            element.sendKeys(value);
        }
    }

    public List<WebElement> getListOfElements(By by) {
        try {
            waitForAllElementsToBeVisibleBy(by);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return driver.findElements(by);
    }

    public void hoverOverElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();

    }





    /*
    SYNCHRONIZATION HELPER METHODS
     */
    public void waitForElementToBeVisible(WebElement element) {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForElementToContainText(WebElement element, String text) {
        try {
            webDriverWait.until(ExpectedConditions.textToBePresentInElement(element, text));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForElementToBeClickable(WebElement element) {
        try {
            webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForElementToBeSelected(WebElement element) {
        try {
            webDriverWait.until(ExpectedConditions.elementToBeSelected(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForElementToBePresentBy(By locator) {
        try {
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForTitleOfPageToContain(String title) {
        try {
            webDriverWait.until(ExpectedConditions.titleContains(title));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForElementToBeVisibleBy(By locator) {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForAllElementsToBeVisibleBy(By locator) {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}