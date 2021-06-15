package pages.login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

import static factory.DriverFactory.getDriver;

public class LoginPage extends ElementUtils {

    private By USERNAME_TEXTBOX = By.id("UserName");
    private By PASSWORD_TEXTBOX = By.id("password");
    private By SUBMIT_BUTTON = By.id("ys-fastlogin-button");
    private By AVATAR_IMAGE = By.xpath("//*[@data-yslinktracking='anasayfa:profilim:avatar']");
    private By FAIL_MESSAGE_TEXT = By.cssSelector(".ys-xl.inner");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillSellerLoginForm(String username, String password) {
        fill(USERNAME_TEXTBOX, username);
        fill(PASSWORD_TEXTBOX, password);
        return this;
    }

    public void clickSignInButton() {
        onClick(SUBMIT_BUTTON);
    }

    public void loginChecked() {
        visibilityOfElement(AVATAR_IMAGE);
        Assert.assertTrue("avatar is not visible",
                getDriver().findElements(AVATAR_IMAGE).size() > 0);
    }

    public void checkFailMessageAs(String failMessage) {
        visibilityOfElement(FAIL_MESSAGE_TEXT);
        String failMessageText = getDriver().findElement(FAIL_MESSAGE_TEXT).getText();
        Assert.assertEquals("fail message should be : " + failMessage, failMessage, failMessageText);
    }
}
