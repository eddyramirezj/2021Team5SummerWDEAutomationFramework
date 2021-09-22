package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class TestSearchResultsPage extends TestBase {


    @Test(enabled = true)
    public void testGetResultsCountToString() {
        getHomepage().searchOnSearchBar("Selenium testing books");
        String actualResults = getSearchResultsPage().getResultsCountToString();

        String expectedResults = "1-16 of 409 results for";

        Assert.assertEquals(actualResults, expectedResults);
    }
}
