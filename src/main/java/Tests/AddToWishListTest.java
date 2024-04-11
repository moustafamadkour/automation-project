package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class AddToWishListTest extends TestBase{
    HomePage homeobject;
    UserRegistrationPage registerObject;
    String ProductName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject ;
    ProductDetailsPage productDetails ;
    EmailPage emailObject;
    WishListPage wishlistObject;


    @Test(priority = 1)
    public void UserCanRegistrationSuccssfully()
    {
        homeobject = new HomePage(driver);
        homeobject.openregistrationpage();
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration("test","user","testemail922@gmail.com","12345678");
    }
    @Test(priority = 2)
    public void UserCanSearchWithAutoSuggest()
    {
        searchObject = new SearchPage(driver);
        searchObject.ProductSearchUsingUatoSuggest("MacB");
       productDetails  = new ProductDetailsPage(driver);

    }

    @Test(priority = 3)
    public void UserCanAddProductToWishList() {
        productDetails = new ProductDetailsPage(driver);
        productDetails.AddProductToWishList();
        driver.navigate().to("https://demo.nopcommerce.com" +"/wishList");
        wishlistObject = new WishListPage(driver);
    }

}
