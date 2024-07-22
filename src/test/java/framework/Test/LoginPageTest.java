package framework.Test;

import framework.Maps.DashPageMap;
import framework.Maps.LandingPageMap;
import framework.Maps.LoginPageMap;
import framework.Pages.LoginPagePages;
import framework.Utils.BaseTest;
import framework.Utils.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LoginPageTest extends BaseTest {

    //LoginPageMap lg = new LoginPageMap();
    LandingPageMap landingPageMap = new LandingPageMap();

    @Test
    public void loginValidCredencials(){
        LoginPagePages lpp= new LoginPagePages(commands);
        lpp.logIn();
        commands.waitForElementToBeClickable(landingPageMap.btnSignOut);
        Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/client/dashboard/dash");
    }

    public void loginValidCredencials(CommonActions commands, WebDriver driver){
        LoginPagePages lpp= new LoginPagePages(commands);
        lpp.logIn();
        commands.waitForElementToBeClickable(landingPageMap.btnSignOut);
        Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/client/dashboard/dash");
    }

//    @Test
//    public void loginInvalidMail(){
//        LoginPagePages lpp= new LoginPagePages(commands);
//        lpp.invalidMail();
//        commands.waitForElementToBeVisible(LoginPageMap.errorMessage);
//    }

//    @Test
//    public void loginInvalidPass(){
//        LoginPagePages lpp= new LoginPagePages(commands);
//        lpp.invalidPsw();
//        commands.waitForElementToBeVisible(LoginPageMap.errorMessage);
//    }
}
