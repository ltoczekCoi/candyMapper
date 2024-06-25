import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PinterestPage;
import pages.PopupChallengePage;
import pages.SocialMediaPage;

public class SocialMediaTest extends BaseTest {


    @Test
    public void goToPinterestPage() throws InterruptedException {
        SocialMediaPage socialMediaPage = new SocialMediaPage(driver);
        PopupChallengePage popupChallengePage = new PopupChallengePage(driver);
        PinterestPage pinterestPage = new PinterestPage(driver);

        popupChallengePage.closePopup();
        socialMediaPage.pinterestLinkClick();
        socialMediaPage.switchToNewTab();
        pinterestPage.getBoardTitle();

        Assert.assertEquals(pinterestPage.getBoardTitle(),"CandyMapper: A sandbox website for test automation");
    }
}
