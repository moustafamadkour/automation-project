package Tests;

import Pages.ContactUsPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class ContactUs extends TestBase{
 HomePage home;
 ContactUsPage contactPage;

 String email = "test@test.com";
 String fullName = "tset User";
 String enquiry = "hello Admin , this is for test";

 @Test
    public void UserCanUseContactUs()
 {
     home = new HomePage(driver);
     home.openContactUsPage();
     contactPage = new ContactUsPage(driver);
     contactPage.ContactUs(fullName, email,enquiry);
 }




}
