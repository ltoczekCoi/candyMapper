package pages.base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BasePage {

    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;
    public Random random;
    public BasePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        random = new Random();
    }
    public void scrollTo(WebElement webElement){
        actions.moveToElement(webElement).perform();
    }
    public void scrollToByJSScript(WebElement webElement){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",webElement);
    }
    public void waitUntilElementIsVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public void waintUntilVisibilityOfElementLocated(String selector){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selector)));
    }
    public void wait2(By selector, String text){
        wait.until(ExpectedConditions.textToBePresentInElementLocated(selector,text));
    }
    public void switchToNewTab(){
        String currentWindowName = driver.getWindowHandle();
        Set<String> windowNames = driver.getWindowHandles();
        for(String windowName : windowNames){
            if(!(windowName.equals(currentWindowName))){
                driver.switchTo().window(windowName);
            }
        }
    }public int generateRandomNumber(){
        return random.nextInt(0,100000);
    }
    public void switchToIFrame(String iframeLocator){
        WebElement iFrame = driver.findElement(By.xpath(iframeLocator));
        driver.switchTo().frame(iFrame);
    }
    public List<String> getOptionsFromDropDown(WebElement webElement){
        Select select = new Select(webElement);
        List<WebElement> optionsOfSelect = select.getOptions();
        List<String> namesOfTheOptions = new ArrayList<>();
        for(WebElement option : optionsOfSelect){
            namesOfTheOptions.add(option.getText());
        }
        return namesOfTheOptions;
    }

}
