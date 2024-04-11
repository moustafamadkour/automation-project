package Tests;

import Pages.ComparePage;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class AddProductToCompareTest extends TestBase{

    String firstProductName ="Apple MacBook Pro 13-inch";
    String secondProductName ="Asus N551JK-XO076H Laptop";

    ProductDetailsPage detailsObject;
    HomePage homeObject;
    ComparePage compareObject;
    SearchPage searchObject;

    @Test(priority = 1)
    public void UserCanCompareProduct() throws InterruptedException {

detailsObject = new ProductDetailsPage(driver);
compareObject = new ComparePage(driver);

        searchObject = new SearchPage(driver);
        searchObject.ProductSearchUsingUatoSuggest("MacB");
        detailsObject = new ProductDetailsPage(driver);
detailsObject.AddProductToCompera();

searchObject.ProductSearchUsingUatoSuggest("Asus");
detailsObject.AddProductToCompera();
Thread.sleep(1000);

driver.navigate().to("https://demo.nopcommerce.com" + "/compareProducts");
compareObject.CompareProduct();
    }
    @Test(priority = 2)
    public void UserCanClearCompareList()
    {
        compareObject.clearCompareList();
    }
}
