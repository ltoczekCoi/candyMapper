import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CreateAccountTest extends BaseTest {

    @Test
    public void fullFillCreateAccountTest() throws InterruptedException {
        PopupChallengePage popupChallengePage = new PopupChallengePage(driver);
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        AccountSignInPage accountSignInPage = new AccountSignInPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        popupChallengePage.closePopup();
        topMenuPage.clickJoinUsButton();
        accountSignInPage.clickCreateAccountLink();
        createAccountPage.fullFillCreateAccountForm("Naruto","Uzumaki","800800800");

        Assert.assertTrue(createAccountPage.isEmailCreated("Please check your email and click the activation link."));
    }
}
