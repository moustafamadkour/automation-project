package Tests;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.ShoppingCartPage;
import org.testng.annotations.Test;

public class AddToShoppingCartTest extends TestBase{
    String ProductName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject ;
    ProductDetailsPage productDetails ;
    ShoppingCartPage cartPage;

    @Test(priority = 1)
    public void UserCanSearchWithAutoSuggest()
    {
        searchObject = new SearchPage(driver);
        searchObject.ProductSearchUsingUatoSuggest("MacB");
        productDetails = new ProductDetailsPage(driver);

    }
    @Test(priority = 2)
    public void UserCanAddProductToShoppingCart() throws InterruptedException {
        productDetails = new ProductDetailsPage(driver);
        productDetails.AddToCart();
        Thread.sleep(1000);
        driver.navigate().to("https://demo.nopcommerce.com" + "/cart");
    }
    @Test(priority = 3)
    public void UserCanRemoveProductFromCart() throws InterruptedException {
        cartPage = new ShoppingCartPage(driver);
        Thread.sleep(1000);
        cartPage.RemoveProductFromCart();
    }

}
