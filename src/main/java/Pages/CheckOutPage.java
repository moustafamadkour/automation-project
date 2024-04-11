package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "button.button-1.register-button")
    private WebElement registerBtn;
    @FindBy(css = "button.button-1.checkout-as-guest-button")
   private WebElement guestBtn;
@FindBy(name = "BillingNewAddress.FirstName")
private WebElement fnTxt;
    @FindBy(id = "BillingNewAddress_LastName")
    private WebElement lnTxt;
    @FindBy(id = "BillingNewAddress_Email")
    private WebElement emailTxt ;
    @FindBy(name = "BillingNewAddress.CountryId")
    private WebElement countryList ;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement phoneTxt ;
    @FindBy(id = "BillingNewAddress_City")
    private WebElement cityTxt ;
    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement  addressTxt;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement  postCodeTxt;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]")
    private WebElement continueBtn ;
    @FindBy(id = "shippingoption_1")
    private WebElement shippingMethodRdo ;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")
    private WebElement continueShippingBtn ;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")
    private WebElement continuePaymentBtn ;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")
    private WebElement continueInfoBtn ;
    @FindBy(css = "a.product-name")
    private WebElement productName ;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")
    private WebElement confirmBtn ;
    @FindBy(css = "h1")
    private WebElement ThankyouLbl ;
    @FindBy(css = "dive.title")
    private WebElement successMessage ;
    @FindBy(linkText = "Click here for order details")
    private WebElement  orderDetailsLink;

    public void RegisteredUserCheckoutProduct(String countryName, String address,
       String postcode, String phone,String city, String productName) throws InterruptedException {
         ClickButton(registerBtn);
        select =new Select(countryList);
        select.selectByVisibleText(countryName);
        setTextElementText(cityTxt,city);
        setTextElementText(addressTxt,address);
        setTextElementText(postCodeTxt,postcode);
        setTextElementText(phoneTxt,phone);
        ClickButton(continueBtn);
        ClickButton(shippingMethodRdo);
        ClickButton(continueShippingBtn);
        Thread.sleep(1000);
        ClickButton(continuePaymentBtn);
        Thread.sleep(1000);
        ClickButton(continueInfoBtn);
    }
    public void confirmOrder() throws InterruptedException {
        ClickButton(confirmBtn);
        Thread.sleep(2000);
    }

    public void CheckoutProduct(String firstName,String lastName, String countryName,String email, String address,
                                              String postcode, String phone,String city, String productName) throws InterruptedException {
       ClickButton(guestBtn);
        setTextElementText(fnTxt,firstName);
        setTextElementText(lnTxt,lastName);
        setTextElementText(emailTxt, email);
        select =new Select(countryList);
        select.selectByVisibleText(countryName);
        setTextElementText(cityTxt,city);
        setTextElementText(addressTxt,address);
        setTextElementText(postCodeTxt,postcode);
        setTextElementText(phoneTxt,phone);
        ClickButton(continueBtn);
        ClickButton(shippingMethodRdo);
        ClickButton(continueShippingBtn);
        Thread.sleep(2000);
        ClickButton(continuePaymentBtn);
        Thread.sleep(2000);
        ClickButton(continueInfoBtn);
    }
}
