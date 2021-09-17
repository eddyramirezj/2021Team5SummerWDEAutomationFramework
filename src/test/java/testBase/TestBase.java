package testBase;

import baseAPI.BasePage;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import pom.*;

public class TestBase extends BasePage {

    public Homepage getHomepage() {
        return new Homepage();
    }


    /*
    region ASSERTION HELPER METHODS
     */
    public boolean isElementPresent(WebElement element) {
        boolean flag = false;

        try {
            if (element.isDisplayed()) {
                flag = true;
            }
        } catch (ElementNotVisibleException e) {
            e.printStackTrace();
        }
        return flag;
    }

}
