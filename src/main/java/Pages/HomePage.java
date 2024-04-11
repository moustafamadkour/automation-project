package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;
       action =new  Actions (driver);



        }

    @FindBy(linkText="Register")
    WebElement registerLink;

    @FindBy(linkText="Contact us")
    WebElement contactusLink;

    @FindBy(id = "customerCurrency")
    WebElement currencydrl;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    WebElement ComputerMenu;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a" )
    WebElement NotebooksMenu;

   // @FindBy(linkText="log in")
    //WebElement loginLink;

    public void openregistrationpage ()
    {
        ClickButton(registerLink);
    }

    public void openContactUsPage()
    {
        ScrollToBottom();
        ClickButton(contactusLink);
    }
public void changeCurrency()
{
    select = new Select(currencydrl);
    select.selectByVisibleText("Euro");
}
public void selectNotebooksMenu()
{
action.moveToElement(ComputerMenu).moveToElement(NotebooksMenu).click().build().perform();
}


   // public void openLogenPage()
    //{
     //   ClickButton(loginLink);
    //}
}
