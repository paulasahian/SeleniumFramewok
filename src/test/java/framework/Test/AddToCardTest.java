package framework.Test;

import framework.Maps.DashPageMap;
import framework.Maps.LandingPageMap;
import framework.Pages.AddToCardDashPage;
import framework.Pages.LoginPagePages;
import framework.Utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class    AddToCardTest extends BaseTest {
    DashPageMap dashPage = new DashPageMap();


    @Test
    public void addProductsToCart() {
        AddToCardDashPage add = new AddToCardDashPage(commands);
        LoginPageTest loginPageTest = new LoginPageTest();
        loginPageTest.loginValidCredencials(commands, driver);
        add.addToCard();
        commands.waitForElementToBeInvisible(dashPage.overlay);

        commands.wait.until(ExpectedConditions.elementToBeClickable(dashPage.cartButton)).click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/client/dashboard/cart");
    }

}
