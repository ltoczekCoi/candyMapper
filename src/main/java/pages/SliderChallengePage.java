package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

import java.io.IOException;
import java.util.List;

public class SliderChallengePage extends BasePage {

    @FindBy(xpath = "//select[@id='tCounty']")
    private WebElement countryWebElement;////span[text() = 'Validate Random Dollar Amounts']
    public SliderChallengePage(WebDriver driver) {
        super(driver);
    }

    public void selectBy(String coutry) throws IOException, InterruptedException {

        switchToIFrame("//div[@id='bs-6']//iframe");
        Select countryDropDown = new Select(countryWebElement);
        List<WebElement> coutries = countryDropDown.getOptions();

        for(int i = 0; i < coutries.size(); i++){
            System.out.println(coutries.get(i).getText());
        }
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//div[@class='help-block with-errors']"));
        scrollTo(element);
        element.click();
        countryDropDown.selectByValue(coutry);

    }
}
