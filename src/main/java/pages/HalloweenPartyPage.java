package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class HalloweenPartyPage extends BasePage {

    @FindBy(xpath = "//a[text()='I Am Hosting A Party']")
    private WebElement hostingAPartyButton;
    public HalloweenPartyPage(WebDriver driver) {
        super(driver);
    }
    public void clickHostingAPartyButton(){
        hostingAPartyButton.click();
    }
}
