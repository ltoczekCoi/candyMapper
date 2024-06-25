import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;
import java.util.List;

public class HallowenPartyTest extends BaseTest {

    @Test
    public void checkSetUpNumbersOfQuests() throws InterruptedException {
        PopupChallengePage popupChallengePage = new PopupChallengePage(driver);
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        HalloweenPartyPage halloweenPartyPage = new HalloweenPartyPage(driver);
        PartyThemePage partyThemePage = new PartyThemePage(driver);
        AreYouBringingAnyGuestsPage areYouBringingAnyGuestsPage = new AreYouBringingAnyGuestsPage(driver);


        popupChallengePage.closePopup();

        topMenuPage.clickHallowenPartyButton();
        halloweenPartyPage.clickHostingAPartyButton();
        partyThemePage.clickZombiesButton();
        areYouBringingAnyGuestsPage.selectBy("2");

        List<String> namesOfNumber = new ArrayList<>();
        namesOfNumber.add("0");
        namesOfNumber.add("1");
        namesOfNumber.add("2");

        Assert.assertEquals(areYouBringingAnyGuestsPage.getOptionsFromSelect(),namesOfNumber);
    }
}
