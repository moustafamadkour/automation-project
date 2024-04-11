package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class RegisteredUserCheckOutProductTest extends TestBase{
    HomePage homeobject;
    UserRegistrationPage registerObject;
    LoginPage loginObject;
    String ProductName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject ;
    ProductDetailsPage detailsObject ;
    ShoppingCartPage cartPage;
    CheckOutPage checkoutObject;
    @Test(priority = 1)
    public void UserCanRegistrationSuccssfully()
    {
        homeobject = new HomePage(driver);
        homeobject.openregistrationpage();
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration("test","user","testemail997822@gmail.com","12345678");
    }
    @Test(priority = 2)
    public void UserCanSearchWithAutoSuggest()
    {
        searchObject = new SearchPage(driver);
        searchObject.ProductSearchUsingUatoSuggest("MacB");
        detailsObject = new ProductDetailsPage(driver);

    }
    @Test(priority = 3)
    public void UserCanAddProductToShoppingCart() throws InterruptedException {
        detailsObject  = new ProductDetailsPage(driver);
        detailsObject.AddToCart();
        Thread.sleep(1000);
        driver.navigate().to("https://demo.nopcommerce.com" + "/cart");
        cartPage = new ShoppingCartPage(driver);
    }
    @Test(priority = 4)
    public void UserCanCheckoutProduct() throws InterruptedException {
        checkoutObject = new CheckOutPage(driver);
        cartPage.openCheckOutPage();
        checkoutObject.RegisteredUserCheckoutProduct("Egypt","test address","1234567","324455666777","cairo",ProductName);
        checkoutObject.confirmOrder();
    }

}
