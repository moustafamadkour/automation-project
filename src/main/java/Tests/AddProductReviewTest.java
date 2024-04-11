package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class AddProductReviewTest extends TestBase{
    HomePage homeobject;
    UserRegistrationPage registerObject;
    String ProductName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject ;
    ProductDetailsPage detailsObject ;
    EmailPage emailObject;
    ProductReviewPage reviewObject;
    @Test(priority = 1)
    public void UserCanRegistrationSuccssfully()
    {
        homeobject = new HomePage(driver);
        homeobject.openregistrationpage();
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration("test","user","tesmlil12532@gmail.com","12345678");

    }
    @Test(priority = 2)
    public void UserCanSearchWithAutoSuggest()
    {
        searchObject = new SearchPage(driver);
        searchObject.ProductSearchUsingUatoSuggest("MacB");
        detailsObject = new ProductDetailsPage(driver);

    }

    @Test(priority = 3)
    public void RegisteredUserCanReviewProduct() throws InterruptedException {
detailsObject.openAddReviewPage();
reviewObject = new ProductReviewPage(driver);
        Thread.sleep(1000);
//reviewObject.AddProductReview("new review","the product is very good");
    }



}
