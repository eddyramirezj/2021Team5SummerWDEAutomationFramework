package pom;

import baseAPI.BasePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.*;


public class RegisterPage extends BasePage {

    public RegisterPage() {
        PageFactory.initElements(driver, this);

    }
    @FindBy (css = "#nav-link-accountList-nav-line-1")  // homepage web elements
    public WebElement signInHoverMenuButton;
    public By signInHoverMenuButtonLocator;

    @FindBy (xpath = "//a[text()='Start here.']")  // homepage web elements
    public WebElement registerStartHereButton;
    public By registerStartHereButtonLocator;

    @FindBy ( css = "#nav-link-accountList > span")
    public WebElement helloSignInButton;
    public By helloSignInButtonLocator;

    @FindBy ( css = "#createAccountSubmit")
    public WebElement createYourAmazonAccount;
    public By createYourAmazonAccountLocator;

    @FindBy ( css = "#ap_customer_name")
    public WebElement nameTextBox;
    public By nameTextBoxLocator;


    @FindBy ( css = "#ap_email")
    public WebElement enterEmailBox;
    public By enterEmailBoxLocator;


    @FindBy (css = "#ap_password")
    public WebElement enterPassWordBox;
    public By enterPassWordBoxLocator;


    @FindBy (css = "#ap_password_check")
    public WebElement reEnterPassWordBox;
    public By reEnterPassWordBoxLocator;


    @FindBy (css = "#continue")
    public WebElement continueButton;
    public By continueButtonLocator;

    @FindBy (css ="#createAccountSubmit")
    public WebElement createYourAmazonAccountButton;
    public By createYourAmazonAccountButtonLocator;

    @FindBy (css = "#legalTextRow > a:nth-child(1)")
    public WebElement ConditionsOfUse;
    public By ConditionsOfUseLocator;

    public void navigateToRegisterPageFromSignInPage() {

        waitForElementToBeVisible(helloSignInButton);
        clickOnElement(helloSignInButton);
        waitForElementToBeVisible(createYourAmazonAccountButton);
        clickOnElement(createYourAmazonAccountButton);


    }



    public void setCreateYourAmazonAccount(WebElement createYourAmazonAccount) {
        this.createYourAmazonAccount = createYourAmazonAccount;
        waitForElementToBeVisible(createYourAmazonAccount);
        clickOnElement(createYourAmazonAccount);
    }



    public void enterNameInNameBox( String name) {
        waitForElementToBeVisible(nameTextBox);
        nameTextBox.sendKeys(name);

    }

    public void enterEmailAddressInBox(String email) {
       waitForElementToBeVisible(enterEmailBox);
        enterEmailBox.sendKeys(email);

    }

        public void enterPassWordInBox(String password) {
        waitForElementToBeVisible(enterPassWordBox);
        enterPassWordBox.sendKeys(password);
    }

    public void reEnterPassWordBox(String password) {
        waitForElementToBeVisible(reEnterPassWordBox);
        reEnterPassWordBox.sendKeys(password);
    }

   /* public void conditionsOfUse();
    waitForElementToBeVisible() */

    public void registerAccountFromRegisterPage(String name, String email,  String password1, String password2){
            enterNameInNameBox(name);
            enterEmailAddressInBox(email);
            enterPassWordInBox(password1);
            reEnterPassWordBox(password2);
            waitForElementToBeVisible(continueButton);
            clickOnElement(continueButton);

    }
}

