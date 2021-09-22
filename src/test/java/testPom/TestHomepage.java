package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testBase.TestBase;


public class TestHomepage extends TestBase {

    @Test (enabled = true)
    public void testGoToLoginPage() {
        getHomepage().goToLoginPage();

        String expectedResults = "Amazon Sign-In";
        String actualResults = driver.getTitle().toString();

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test (enabled = true)
    public void testGoToRegisterPage() {
        getHomepage().goToRegisterPage();

        String expectedResults = "Amazon Registration";
        String actualResults = driver.getTitle().toString();

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test (enabled = true)
    public void testGoToCartPage() {
        getHomepage().goToCartPage();

        String expectedResults = "Amazon.com Shopping Cart";
        String actualResults = driver.getTitle().toString();

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test (enabled = true)
    public void testGoToCustomerServicePage() {
        getHomepage().goToCustomerServicePage();

        String expectedResults = "Amazon.com Help: Help & Customer Service";
        String actualResults = driver.getTitle().toString();

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test (enabled = true)
    public void testGoToBestSellersPage() {
        getHomepage().goToBestSellersPage();

        String expectedResults = "Amazon.com Best Sellers: The most popular items on Amazon";
        String actualResults = driver.getTitle().toString();

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test (enabled = true)
    public void testGoToBooksPage() {
        getHomepage().goToBooksPage();

        String expectedResults = "Amazon.com: Books";
        String actualResults = driver.getTitle().toString();

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test (enabled = true)
    public void testGoToPharmacyPage() {
        getHomepage().goToPharmacyPage();

        String expectedResults = "Amazon.com: Amazon Pharmacy";
        String actualResults = driver.getTitle().toString();

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test (enabled = true)
    public void testGoToChooseYourLocationWindow() {
        getHomepage().goToChooseYourLocationWindow();

        Assert.assertTrue(isElementPresent(getHomepage().popUpWindowChooseLocationHeader));
    }

    @Test (enabled = true)
    public void testReturnToAmazonHomepageViaAmazonButton() {
        SoftAssert softAssert = new SoftAssert();
        String expectedResults = "Amazon.com. Spend less. Smile more.";
        getHomepage().goToBooksPage();
        getHomepage().returnToAmazonHomepageViaAmazonButton();
        String actualResults = driver.getTitle().toString();
        softAssert.assertEquals(actualResults, expectedResults);
        getHomepage().goToPharmacyPage();
        getHomepage().returnToAmazonHomepageViaAmazonButton();
        actualResults = driver.getTitle().toString();
        softAssert.assertEquals(actualResults, expectedResults);
        getHomepage().goToBestSellersPage();
        getHomepage().returnToAmazonHomepageViaAmazonButton();
        actualResults = driver.getTitle().toString();
        softAssert.assertEquals(actualResults, expectedResults);
        getHomepage().goToCustomerServicePage();
        getHomepage().returnToAmazonHomepageViaAmazonButton();
        actualResults = driver.getTitle().toString();
        softAssert.assertEquals(actualResults, expectedResults);

        softAssert.assertAll();

    }

    @Test (enabled = true)
    public void testSearchOnSearchBar() {
        getHomepage().searchOnSearchBar("Selenium testing books");

        String expectedResults = "1-16 of 411 results for";
        String actualResults = getSearchResultsPage().getResultsCountToString();

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test (enabled = true)
    public void testChangeLanguageToSpanish() {
        getHomepage().changeLanguageToSpanish();

        String expectedResults = "Amazon.com. Gasta menos. Sonríe más.";
        String actualResults = driver.getTitle().toString();

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test (enabled = true)
    public void testChangeLanguageToEnglish() {
        getHomepage().changeLanguageToSpanish();
        getHomepage().changeLanguageToEnglish();

        String expectedResults = "Amazon.com. Spend less. Smile more.";
        String actualResults = driver.getTitle().toString();

        Assert.assertEquals(actualResults, expectedResults);

    }

}
