package base;

import org.testng.annotations.BeforeTest;
import pages.PopupChallengePage;

public class Pages extends BaseTest{

    public PopupChallengePage popupChallengePage;
    @BeforeTest
    public void setUp(){
        popupChallengePage = new PopupChallengePage(driver);
    }
}
