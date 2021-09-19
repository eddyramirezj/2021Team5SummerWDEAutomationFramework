package pom;

import baseAPI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage extends BasePage {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "#nav-link-accountList-nav-line-1")
    public WebElement signInHoverMenuButton;
    public By signInHoverMenuButtonLocator;

    @FindBy (css = "a.nav-action-button")
    public WebElement signInButton;
    public By signInButtonLocator;

    @FindBy (xpath = "//a[text()='Start here.']")
    public WebElement registerStartHereButton;
    public By registerStartHereButtonLocator;

    @FindBy (css = "a.nav-a.nav-a-2.nav-progressive-attribute>span.nav-line-1")
    public WebElement returnsButton;
    public By returnsButtonLocator;

    @FindBy (css = "#nav-cart-count")
    public WebElement goToCartButton;
    public By goToCartButtonLocator;

    @FindBy (css = "#twotabsearchtextbox")
    public WebElement searchBar;
    public By searchBarLocator;

    @FindBy (css = "#nav-search-submit-button")
    public WebElement searchButton;
    public By searchButtonLocator;

    @FindBy (css = "a.nav-a.nav-a-2.icp-link-style-2")
    public WebElement changeLanguageHoverMenu;
    public By changeLanguageHoverMenuLocator;

    @FindBy (css = "div#nav-flyout-icp a[href='#switch-lang=es_US']>span.nav-text")
    public WebElement languageToSpanishRadioButton;

    @FindBy (css = "div#nav-flyout-icp a[href='#switch-lang=en_US']>span.nav-text")
    public WebElement languageToEnglishRadioButton;

    @FindBy (css = "#nav-logo-sprites")
    public WebElement amazonButton;
    public By amazonButtonLocator;

    @FindBy (css = "span.nav-line-2.nav-progressive-content")
    public WebElement selectAddressButton;
    public By selectAddressButtonLocator;

    @FindBy (css = ".a-popover-header-content")
    public WebElement popUpWindowChooseLocationHeader;

    @FindBy (css = ".hm-icon-label")
    public WebElement hamburgerMenu;
    public By hamburgerMenuLocator;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[contains(text(), 'Best Sellers')]")
    public WebElement bestSellersButtonTopMenu;
    public By bestSellersButtonTopMenuLocator;

    @FindBy (css = "div#nav-xshop>#nav-link-prime")
    public WebElement primeButtonTopMenu;
    public By primeButtonTopMenuLocator;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_2']")
    public WebElement customerServiceButtonTopMenu;
    public By customerServiceButtonTopMenuLocator;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_3']")
    public WebElement newReleasesButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_4']")
    public WebElement todaysDealsButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_5']")
    public WebElement pharmacyButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_6']")
    public WebElement booksButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_7']")
    public WebElement fashionButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_8']")
    public WebElement registryButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_9']")
    public WebElement toysAndGamesButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_10']")
    public WebElement kindleBooksButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_11']")
    public WebElement giftCardsButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_12']")
    public WebElement amazonHomeButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_13']")
    public WebElement sellButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_14']")
    public WebElement computersButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_15']")
    public WebElement automotiveButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_16']")
    public WebElement couponsButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_17']")
    public WebElement homeImprovementButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_18']")
    public WebElement videoGamesButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_19']")
    public WebElement shopperToolkitButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_20']")
    public WebElement smartHomeButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_21']")
    public WebElement findAGiftButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_22']")
    public WebElement beautyAndPersonalCaseButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_23']")
    public WebElement healthAndHouseholdButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_24']")
    public WebElement amazonBasicsButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_25']")
    public WebElement petSuppliesButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_26']")
    public WebElement tvAndVideoButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_27']")
    public WebElement handmadeButtonTopMenu;

    @FindBy (xpath = "//div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_28']")
    public WebElement babyButtonTopMenu;

    public void goToCustomerServicePage() {
        waitForElementToBeClickable(customerServiceButtonTopMenu);
        clickOnElement(customerServiceButtonTopMenu);
    }

    public void goToLoginPage() {
        waitForElementToBePresentBy(signInHoverMenuButtonLocator);
        hoverOverElement(signInHoverMenuButton);
        waitForElementToBeClickable(signInButton);
        clickOnElement(signInButton);
    }

    public void goToRegisterPage() {
        waitForElementToBePresentBy(signInHoverMenuButtonLocator);
        hoverOverElement(signInHoverMenuButton);
        waitForElementToBeClickable(registerStartHereButton);
        clickOnElement(registerStartHereButton);
    }

    public void goToCartPage() {
        waitForElementToBeClickable(goToCartButton);
        clickOnElement(goToCartButton);
    }

    public void goToBestSellersPage() {
        waitForElementToBeClickable(bestSellersButtonTopMenu);
        clickOnElement(bestSellersButtonTopMenu);
    }

    public void goToBooksPage() {
        waitForElementToBeClickable(booksButtonTopMenu);
        clickOnElement(booksButtonTopMenu);
    }

    public void goToPharmacyPage() {
        waitForElementToBeClickable(pharmacyButtonTopMenu);
        clickOnElement(pharmacyButtonTopMenu);
    }

    public void returnToAmazonHomepageViaAmazonButton() {
        waitForElementToBeClickable(amazonButton);
        clickOnElement(amazonButton);
    }

    public void goToChooseYourLocationWindow() {
        waitForElementToBeClickable(selectAddressButton);
        clickOnElement(selectAddressButton);
    }

    public void searchOnSearchBar(String value) {
        try {
            waitForElementToBeClickable(searchBar);
            sendKeysToElement(searchBar, value);
            waitForElementToBeClickable(searchButton);
            clickOnElement(searchButton);
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void changeLanguageToSpanish() {
        try {
            waitForElementToBePresentBy(changeLanguageHoverMenuLocator);
            hoverOverElement(changeLanguageHoverMenu);
            waitForElementToBeVisible(languageToSpanishRadioButton);
            clickOnElement(languageToSpanishRadioButton);

        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void changeLanguageToEnglish() {
        try {
            waitForElementToBePresentBy(changeLanguageHoverMenuLocator);
            hoverOverElement(changeLanguageHoverMenu);
            waitForElementToBeVisible(languageToEnglishRadioButton);
            clickOnElement(languageToEnglishRadioButton);

    }
        catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

}
