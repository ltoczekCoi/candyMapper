import base.BaseTest;
import base.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PopupChallengePage;

public class PopupChallengeTest extends BaseTest {

    @Test
    public void closePopup() throws InterruptedException {
        PopupChallengePage popupChallengePage = new PopupChallengePage(driver);
        popupChallengePage.closePopup();
        Assert.assertFalse(popupChallengePage.isMyCandyButtonDisplayed());
    }
}
