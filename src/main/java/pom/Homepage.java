package pom;

import baseAPI.BasePage;
import org.openqa.selenium.support.PageFactory;


public class Homepage extends BasePage {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }




}
