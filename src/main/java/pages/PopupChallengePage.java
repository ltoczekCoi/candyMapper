package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class PopupChallengePage extends BasePage {

    @FindBy(id = "popup-widget238491-cta")
    private WebElement findMyCandyButton;
    public PopupChallengePage(WebDriver driver) {
        super(driver);
    }
    public void closePopup(){
        findMyCandyButton.click();
    }
    public boolean isMyCandyButtonDisplayed(){
        return findMyCandyButton.isDisplayed();
    }



}
