package framework.Maps;

import org.openqa.selenium.By;

public class LoginPageMap {

    public By loginPageUserEmail = By.cssSelector("input#userEmail");

    public By loginPageUserPassword = By.cssSelector("input#userPassword");

    public By loginButton = By.cssSelector("input#login");

    public static By errorMessage = By.cssSelector("div.ng-tns-c4-12[aria-label='Incorrect email or password']");
}
