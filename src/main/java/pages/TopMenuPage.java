package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class TopMenuPage extends BasePage {
    @FindBy(xpath = "//a[text()='JOIN US']")
    private WebElement joinUsButton;
    @FindBy(xpath = "//a[text()='Halloween Party']")
    private WebElement hallowenPartyButton;
    public TopMenuPage(WebDriver driver) {
        super(driver);
    }
    public void clickJoinUsButton(){
        joinUsButton.click();
    }
    public void clickHallowenPartyButton(){
        hallowenPartyButton.click();
    }
}
