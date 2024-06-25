package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class PartyThemePage extends BasePage {

    @FindBy(xpath = "//a[text()='Zombies']")
    private WebElement zombiesButton;
    public PartyThemePage(WebDriver driver) {
        super(driver);
    }
    public void clickZombiesButton(){
        zombiesButton.click();
    }

}
