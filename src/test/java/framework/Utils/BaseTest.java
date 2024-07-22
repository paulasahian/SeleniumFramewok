package framework.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected CommonActions commands;

    @BeforeMethod
    public void setUp(){
        driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/client/");
        commands = new CommonActions(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
