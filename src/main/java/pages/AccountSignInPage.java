package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class AccountSignInPage extends BasePage {

    @FindBy(name = "email")
    private WebElement emailInput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[@data-aid='MEMBERSHIP_SSO_SUBMIT']")
    private WebElement joinUsButton;

    @FindBy(xpath = "//p[@data-aid='MEMBERSHIP_SSO_ERR_REND']")
    private WebElement wrongLogInMassage;

    @FindBy(xpath = "//a[text()='Create account.']")
    private WebElement createAccountLink;
    public AccountSignInPage(WebDriver driver) {
        super(driver);
    }

    public void fullInInputs(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        joinUsButton.click();
    }

    public String getWrongLogInMessage(){
        return wrongLogInMassage.getText();
    }
    public void clickCreateAccountLink(){
        createAccountLink.click();
    }
}
