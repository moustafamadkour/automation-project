package Tests;

import Pages.*;
import org.apache.tools.ant.taskdefs.SendEmail;
import org.testng.annotations.Test;

public class EmailFriendTest extends TestBase{

    HomePage homeobject;
    UserRegistrationPage registerObject;
    String ProductName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject ;
    ProductDetailsPage detailsObject ;
    EmailPage emailObject;
    

    @Test(priority = 1)
    public void UserCanRegistrationSuccssfully()
    {
        homeobject = new HomePage(driver);
        homeobject.openregistrationpage();
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration("test","user","testemail9282@gmail.com","12345678");
    }
    @Test(priority = 2)
    public void UserCanSearchWithAutoSuggest()
    {
        searchObject = new SearchPage(driver);
        searchObject.ProductSearchUsingUatoSuggest("MacB");
        detailsObject = new ProductDetailsPage(driver);

    }

    @Test(priority = 3)
    public void RegisteredUserCanSendProductToFriend()
    {
        detailsObject.openSendEmail();
        emailObject =new EmailPage(driver);
        emailObject.SendEmailToFriend("aaa@ttt.com","hello my friend kkkkkkkkkkkkggggg");
    }

//@Test (dependsOnMethods = ("UserCanRegistrationSuccssfully"))
//public void registerUserCanLogout()
//{
    // registerObject.userLogout();
//}


}
