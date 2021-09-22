package pom;

import baseAPI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

public CartPage(){PageFactory.initElements(driver, this);}

    @FindBy (id = "//div[@id='nav-cart-text-container']")
    public WebElement cartButton;
    public By cartButtonLocator;

    @FindBy (id = "#sc-buy-box-ptc-button > span:nth-child(1) > input:nth-child(1)")
    public WebElement proceedToCheckoutBtn;
    public By proceedToCheckoutBtnLocator;

    @FindBy (css = ".sc-your-amazon-cart-is-empty")
    public WebElement emptyCartMessage;
    public By emptyCartMessageLocator;

    @FindBy (id = "a-autoid-0-announce")
    public WebElement signInToYourAccount;
    public By signInToYourAccountLocator;

    @FindBy (css = "#twotabsearchtextbox")
    public WebElement searchtextbox;





}
