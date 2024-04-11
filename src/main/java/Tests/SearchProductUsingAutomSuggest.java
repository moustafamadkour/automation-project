package Tests;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class SearchProductUsingAutomSuggest extends TestBase{

    String ProductName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject ;
    ProductDetailsPage detailsObject ;

    @Test
    public void UserCanSearchWithAutoSuggest()
    {
        searchObject = new SearchPage(driver);
        searchObject.ProductSearchUsingUatoSuggest("MacB");
        detailsObject = new ProductDetailsPage(driver);

    }






}
