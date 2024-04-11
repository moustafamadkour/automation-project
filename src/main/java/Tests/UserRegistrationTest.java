package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistrationPage;
import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase
{
HomePage homeobject;
UserRegistrationPage registerObject;

 LoginPage loginobject;

@Test(priority = 1)
public void UserCanRegistrationSuccssfully()
{
    homeobject = new HomePage(driver);
    homeobject.openregistrationpage();
    registerObject = new UserRegistrationPage(driver);
    registerObject.userRegistration("mostafa","madkour","testemail822@gmail.com","12345678");
}

//@Test (dependsOnMethods = ("UserCanRegistrationSuccssfully"))
//public void registerUserCanLogout()
//{
   // registerObject.userLogout();
//}

//@Test (dependsOnMethods = ("registerUserCanLogout"))
//public void registerUserCanLogin()
//{
//homeobject.openLoginPage();
//loginobject = new LoginPage(driver);
//loginobject.UserLogin("testemail722@gmail.com", "12345678" );
//}

}
