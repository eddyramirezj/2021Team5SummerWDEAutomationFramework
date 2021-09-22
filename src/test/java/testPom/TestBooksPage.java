package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TestBooksPage extends TestBase {

    @Test
    public void testGoToBooksPage() {
        getHomepage().goToBooksPage();

        String expectedResults = "Amazon.com: Books";
        String actualResults = driver.getTitle().toString();

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test
    public void testGoToBestSellers() {
        getHomepage().goToBooksPage();

        String expectedResults = "Amazon.com: Books";
        String actualResults = driver.getTitle();

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test
    public void testGoToPopularInBooks() {
        getHomepage().goToBooksPage();
        String expectedResults = "Amazon.com: Books";
        String actualResults = driver.getTitle();

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test
    public void testGoToAwardWinners() {
        getHomepage().goToBooksPage();
        String expectedResults = "Amazon.com: Books";
        String actualResults = driver.getTitle();

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test
    public void testGoToComingSoon() {
        getHomepage().goToBooksPage();
        String expectedResults = "Amazon.com: Books";
        String actualResults = driver.getTitle();

        Assert.assertEquals(actualResults, expectedResults);
    }
}
