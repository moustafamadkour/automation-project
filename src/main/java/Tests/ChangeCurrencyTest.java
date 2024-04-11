package Tests;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class ChangeCurrencyTest extends TestBase{

HomePage homeObject;
ProductDetailsPage detailsObject;
    String ProductName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject ;

@Test(priority = 1)
    public void UserCanChangeCurrency()
{
    homeObject =new HomePage(driver);
    homeObject.changeCurrency();
    detailsObject = new ProductDetailsPage(driver);
}

    @Test(priority = 2)
    public void UserCanSearchWithAutoSuggest()
    {
        searchObject = new SearchPage(driver);
        searchObject.ProductSearchUsingUatoSuggest("MacB");
        detailsObject = new ProductDetailsPage(driver);

    }
}
