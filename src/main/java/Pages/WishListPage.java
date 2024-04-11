package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase{
    public WishListPage(WebDriver driver) {
        super(driver);
    }

@FindBy(css = "td.product")
    public WebElement productCell;
    @FindBy(css = "h1")
    public WebElement wishistHeader;
    @FindBy(name = "updatecart")
    private WebElement updateWishListBtn;
    @FindBy(name = "removeFromCart")
    private WebElement removeFromCartCheck;
    @FindBy(css = "div.no-data")
    public WebElement EmptyCartlbl;
    
    public void removeProductFromWishList()
    {
        ClickButton(removeFromCartCheck);
        ClickButton(updateWishListBtn);
    }
}
