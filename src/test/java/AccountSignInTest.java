import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountSignInPage;
import pages.PopupChallengePage;
import pages.TopMenuPage;

public class AccountSignInTest extends BaseTest {
    @Test
    public void checkInvalidMessageAfterFailedSignIn(){
        PopupChallengePage popupChallengePage = new PopupChallengePage(driver);
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        AccountSignInPage accountSignInPage = new AccountSignInPage(driver);

        popupChallengePage.closePopup();
        topMenuPage.clickJoinUsButton();
        accountSignInPage.fullInInputs("testowy@wp.pl","password1!");
        Assert.assertEquals(accountSignInPage.getWrongLogInMessage(),"The password/email address combo is incorrect.");
    }
}
