package base;

import configuration.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    public WebDriver driver;
    private DriverManager driverManager;
    @BeforeMethod
    public void setUp() throws IOException {
        driverManager = new DriverManager();
        driver = driverManager.getDriver();
        driver.get("https://candymapper.com/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
