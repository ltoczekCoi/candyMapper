package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class PinterestPage extends BasePage {

    @FindBy(css = "div[data-test-id='board-title'] h1")
    private WebElement boardTitle;
    public PinterestPage(WebDriver driver) {
        super(driver);
    }
    public String getBoardTitle(){
        return boardTitle.getText();
    }

}
