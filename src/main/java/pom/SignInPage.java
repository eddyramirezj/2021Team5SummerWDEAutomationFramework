package pom;

import baseAPI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    public SignInPage(){
        PageFactory.initElements(driver, this);}


    @FindBy (id = "ap_email")
    public WebElement userNameField;
    public By userNameFieldLocator;

    @FindBy (id = "continue")
    public WebElement continueButton;

    @FindBy (css = "#ap_password")
    public WebElement passwordField;

    @FindBy (id = "signInSubmit")
    public WebElement signInButton;

    @FindBy (css = ".a-alert-heading")
    public WebElement incorrectUserNameAlertMessage;

    @FindBy (css = ".a-alert-heading")
    public WebElement incorrectPasswordAlertMessage;










}

