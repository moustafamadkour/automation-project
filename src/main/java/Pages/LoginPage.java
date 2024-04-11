package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="Email")
    WebElement emailTxtBox;

    @FindBy(id="password")
    WebElement passwordTxtBox;

    @FindBy(css="input.button-1.login-button")
    WebElement loginBtn ;

    public void UserLogin() {
        UserLogin(null, null);
    }

    public void UserLogin(String email , String password)
    {
        setTextElementText(emailTxtBox,email);
        setTextElementText(passwordTxtBox,password);
        ClickButton(loginBtn);
    }
}
