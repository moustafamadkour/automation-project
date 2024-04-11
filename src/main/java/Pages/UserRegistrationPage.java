package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase
{


    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id = "gender-male")
    WebElement genderRdoBtn;

    @FindBy(id = "FirstName")
    WebElement fnTxtBox;

    @FindBy(id = "LastName")
    WebElement inTxtBox;

    @FindBy(id = "Email")
    WebElement emailTxtBox;

    @FindBy(id = "Password")
    WebElement passwordTxtBox;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPasswordTxtBox;

    @FindBy(id = "register-button")
    WebElement registerBtn;

    @FindBy(linkText ="Log out")
    public  WebElement logoutLink;
    public void userRegistration(String firstName , String lastName , String email , String password)
    {
        ClickButton(genderRdoBtn);
        setTextElementText(fnTxtBox , firstName  );
        setTextElementText(inTxtBox  ,  lastName );
        setTextElementText(emailTxtBox ,  email );
        setTextElementText(passwordTxtBox  , password   );
        setTextElementText(ConfirmPasswordTxtBox  , password  );
        ClickButton(registerBtn);
    }
    public void userLogout()
    {
        ClickButton(logoutLink);
    }



}
