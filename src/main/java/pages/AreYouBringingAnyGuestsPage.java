package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

import java.util.List;

public class AreYouBringingAnyGuestsPage extends BasePage {

    @FindBy(xpath = "//select[@id='guests']")
    private WebElement guestsWebElemenent;
    public AreYouBringingAnyGuestsPage(WebDriver driver) {
        super(driver);
    }

    public void selectBy(String numberOfGuests){
        switchToIFrame("//div[@id='bs-6']//iframe");
        Select numberOfGuestsDropDown = new Select(guestsWebElemenent);
        numberOfGuestsDropDown.selectByValue(numberOfGuests);
    }

    public List<String> getOptionsFromSelect(){
        return getOptionsFromDropDown(guestsWebElemenent);
    }

}
