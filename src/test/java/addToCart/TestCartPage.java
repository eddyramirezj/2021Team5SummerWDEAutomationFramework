package addToCart;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.CartPage;
import testBase.TestBase;

public class TestCartPage extends TestBase {
//    AddToCartPage addToCartPage = new AddToCartPage(driver);
public boolean isPresent(WebElement element) {
    boolean flag = false;
    waitForElementToBeVisible(element);

    try {
        if (element.isDisplayed()) {
            flag = true;
            System.out.println("Element found: " + element);
        }
    } catch (ElementNotVisibleException e) {
        e.printStackTrace();
        System.out.println("Element NOT found: " + element);
    }
    return flag;
}


    @Test(priority = 0)
    public void testTitleOfGoToCartPage(){

    getHomepage().goToCartPage();
    String actualTile = driver.getTitle();
    boolean ifTitle = actualTile.equals("Amazon.com Shopping Cart");
    Assert.assertTrue(ifTitle, "Navigated to shopping cart");
}

    @Test(priority = 2)
    public void testIsUserSignedIn(){

        getHomepage().goToCartPage();
        waitForElementToBeVisible(getCartPage().signInToYourAccount);
        boolean isCartEmpty = isElementPresent(getCartPage().signInToYourAccount);
        if(isCartEmpty){
            System.out.println("User is NOT signed in");
        }
        else {
            System.out.println("User is signed in.");
        }
    }

@Test(priority = 1)
    public void testSignInWithInvalidUsernameFromCartPage(){

    getHomepage().goToCartPage();
    waitForElementToBeVisible(getCartPage().emptyCartMessage);
    boolean isCartEmpty = isElementPresent(getCartPage().emptyCartMessage);
    clickOnElement(getCartPage().signInToYourAccount);
    sendKeysToElement(getSignInPageFromCartPage().userNameField, "salmasInvalidUserName");

    clickOnElement(getSignInPageFromCartPage().continueButton);

    waitForElementToBeVisible(getSignInPageFromCartPage().incorrectUserNameAlertMessage);


    boolean errorMessage = isPresent(getSignInPageFromCartPage().incorrectUserNameAlertMessage);
    if(errorMessage){
        System.out.println("Your user name is INCORRECT");
    }
    else {
        System.out.println("Your user name is CORRECT");
    }

}


/*    @Test(priority = 1)
    public void testSignInWithInvalidPasswordFromCartPage(){

        getHomepage().goToCartPage();
        waitForElementToBeVisible(getCartPage().emptyCartMessage);
        clickOnElement(getCartPage().signInToYourAccount);
        sendKeysToElement(getSignInPageFromCartPage().userNameField, "1347285****");

        clickOnElement(getSignInPageFromCartPage().continueButton);

        waitForElementToBeVisible(getSignInPageFromCartPage().passwordField);

        sendKeysToElement(getSignInPageFromCartPage().passwordField, "salmasInvalidPassword");
        clickOnElement(getSignInPageFromCartPage().signInButton);

        boolean errorMessage = isPresent(getSignInPageFromCartPage().incorrectPasswordAlertMessage);
        if(errorMessage){
            System.out.println("Your password is INCORRECT");
        }
        else {
            System.out.println("Your password is CORRECT");
        }

    }*/


    @Test
    public void testIfUserCanCheckoutFromCartPage(){
        getHomepage().goToCartPage();
        waitForElementToBeVisible(getCartPage().emptyCartMessage);
        boolean isCartEmpty = isElementPresent(getCartPage().emptyCartMessage);

        if(!isCartEmpty) {

            isPresent(getCartPage().proceedToCheckoutBtn);
            System.out.println("User CAN proceed to checkout");

        }else {
            System.out.println("Cart is empty. User CANNOT proceed to checkout");

        }
    }









    @Test(priority = 1)
    public void testIfCartIsEmpty(){

        getHomepage().goToCartPage();
        waitForElementToBeVisible(getCartPage().emptyCartMessage);
        boolean isCartEmpty = isElementPresent(getCartPage().emptyCartMessage);
        if(isCartEmpty){
            System.out.println("Your Cart is Empty");
        }
        else {
            System.out.println("your cart has items to checkout.");
        }
    }





}
