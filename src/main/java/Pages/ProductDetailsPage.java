package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{


    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "strong.current-item")
    public WebElement productNamebreadCrumn;


    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[9]/div[3]/button")
    WebElement emailFriendBtn ;

@FindBy(css = "span.price-value-4")
public WebElement productPricelbl;

@FindBy(id = "add-to-wishlist-button-4")
WebElement addToWishListBtn;
@FindBy(linkText = "Add your review")
WebElement addReviewLink;
@FindBy(css = "button.button-2.add-to-compare-list-button")
WebElement addToCompareBtn;
@FindBy(id = "add-to-cart-button-4")
WebElement addToCartBtn;
    public void openSendEmail()
    {
        ClickButton(emailFriendBtn);
    }

    public void openAddReviewPage()
    {
        ClickButton(addReviewLink);
    }
public void AddProductToWishList()
{
    ClickButton(addToWishListBtn);
}
public void AddProductToCompera()
{
    ClickButton(addToCompareBtn);
}
public void AddToCart()
{
    ClickButton(addToCartBtn);
}
}
