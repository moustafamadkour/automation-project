package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "small-searchterms")
    WebElement searchTextBox;

    @FindBy(css = "input.button-1.search-box-button")
    WebElement searchBtn;

    @FindBy(id = "ui-id-1")
   List<WebElement>  productList ;

    @FindBy(css = "h2.product-title")
    WebElement productTitle;

    public void ProductSearch(String ProductName)
    {
        setTextElementText(searchTextBox ,ProductName);
        ClickButton(searchBtn);
    }
    public void openproductDetailsPage()
    {
        ClickButton(productTitle);
    }

    public void ProductSearchUsingUatoSuggest(String searchTxt)
    {
        setTextElementText(searchTextBox,searchTxt);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        productList.get(0).click();
    }

}
