package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class CreateAccountPage extends BasePage {

    @FindBy(name = "nameFirst")
    private WebElement nameFirstInput;
    @FindBy(name = "nameLast")
    private WebElement nameLastInput;
    @FindBy(name = "email")
    private WebElement emailInput;
    @FindBy(name = "phone")
    private WebElement phoneInput;

    @FindBy(xpath = "//button[@data-ux='ButtonPrimary']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//p[@data-aid='CREATE_ACCOUNT_DESCRIPTION_REND']")
    private WebElement messageAfterSuccessfulEmmailCreation;

    @FindBy(xpath = "//h4[@data-typography='HeadingDelta']")
    private WebElement checkYourEmailLabel;

    private String email;
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void fullFillCreateAccountForm(String firstName, String lastName,String phone){
        email = firstName + "." + lastName + generateRandomNumber() + "@gmail.com";
        System.out.println(email);
        nameFirstInput.sendKeys(firstName);
        nameLastInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        phoneInput.sendKeys(phone);
        createAccountButton.click();
    }
    public boolean isEmailCreated(String message){
        System.out.println(messageAfterSuccessfulEmmailCreation.getText());
        waitUntilElementIsVisible(checkYourEmailLabel);
        return messageAfterSuccessfulEmmailCreation.getText().endsWith(message);
    }


}
