package pom;

import baseAPI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {


    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(), 'results')]")
    public WebElement resultsCount;
    public By resultsCountLocator;


    public String getResultsCountToString() {
        waitForElementToBeVisible(resultsCount);
        return resultsCount.getText();
    }

}
