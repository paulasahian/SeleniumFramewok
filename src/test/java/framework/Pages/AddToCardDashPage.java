package framework.Pages;

import framework.Maps.DashPageMap;
import framework.Utils.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class AddToCardDashPage {
    CommonActions commands;
    private DashPageMap dashPage = new DashPageMap();

    private DashPageMap add = new DashPageMap();

    public AddToCardDashPage(CommonActions commands) {
        this.commands = commands;
    }

    public void addToCard() {
        commands.wait.until(ExpectedConditions.elementToBeClickable(add.zaraAddToCartButton)).click();
        commands.waitForElementToBeInvisible(dashPage.overlay);
        commands.wait.until(ExpectedConditions.elementToBeClickable(add.adidasAddToCartButton)).click();
    }
}
