package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class SocialMediaPage extends BasePage {

    @FindBy(css = "a[aria-label='Pinterest Social Link']")
    private WebElement pinterestLink;
    public SocialMediaPage(WebDriver driver) {
        super(driver);
    }
    public void pinterestLinkClick(){
        pinterestLink.click();



    }
}
