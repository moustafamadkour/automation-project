package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends PageBase{
    public ProductReviewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/input")
    WebElement reviewTitleTxt;
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/textarea")
    WebElement reviewText;
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div[2]/div[2]/input[6]")
    WebElement rating5RdoBtn;
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[3]/button")
    WebElement submitReviewBtn;
   // @FindBy(css="div.result")
  // public WebElement reviewNotification;

    public void AddProductReview(String reviewTitle, String reviewMessage)
    {
        setTextElementText(reviewTitleTxt,reviewTitle);
        setTextElementText(reviewText,reviewMessage);
        ClickButton(rating5RdoBtn);
        ClickButton(submitReviewBtn);
    }
}
