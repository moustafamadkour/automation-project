package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class ProductHoverMenu extends TestBase{

HomePage homeObject;
@Test
    public void UserCnSelectFromTheMenu()
{
    homeObject = new HomePage(driver);
    homeObject.selectNotebooksMenu();

}
}
