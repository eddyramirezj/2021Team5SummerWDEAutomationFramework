package testBase;

import baseAPI.BasePage;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pom.*;

public class TestBase extends BasePage {

    @Test

    public Homepage getHomepage() {
        return new Homepage();
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage();
    }
    public CartPage getCartPage() {
        return new CartPage();
    }

    public SignInPageFromCartPage getSignInPageFromCartPage(){
        return new SignInPageFromCartPage();
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
