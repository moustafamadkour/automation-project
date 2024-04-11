package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase{
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
@FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[7]/button")
    WebElement removeCheck;
   // @FindBy(name = "updatecart")
   // WebElement updateCartBtn;
  @FindBy(css = "input.qty-input valid")
    public WebElement quantityTxt;
  @FindBy(css = "td.subtotal")
    public WebElement totalLbl;
  @FindBy(id = "checkout")
  WebElement checkoutBtn;
  @FindBy(id = "termsofservice")
  WebElement agreeCheckBox;
  public void RemoveProductFromCart()
  {
      ClickButton(removeCheck);
    //  ClickButton(updateCartBtn);
  }
  public void UpdateProductQuantityInCart(String quantity)
  {
      clearText(quantityTxt);
      setTextElementText(quantityTxt,quantity);
     // ClickButton(updateCartBtn);
  }
  public void openCheckOutPage()
  {
      ClickButton(agreeCheckBox);
      ClickButton(checkoutBtn);
  }
    public void openCheckOutPageaAsGuest()
    {
        ClickButton(agreeCheckBox);
        ClickButton(checkoutBtn);

    }
}
