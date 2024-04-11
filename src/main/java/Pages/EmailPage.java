package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends PageBase{
    public EmailPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="FriendEmail")
    private WebElement emailfriendTxt;

    @FindBy(id="PersonalMessage")
    private WebElement personalMessageTxt ;

    @FindBy(name="send-email")
    private WebElement sendemailBtn;

    @FindBy(css="div.result")
    private WebElement MessageNotification ;

    public void SendEmailToFriend(String FriendEmail  ,  String personalMessage )
    {

        setTextElementText(emailfriendTxt, FriendEmail);
        setTextElementText(personalMessageTxt,personalMessage);
        ClickButton(sendemailBtn);
    }


}
