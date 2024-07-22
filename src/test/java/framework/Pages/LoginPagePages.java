package framework.Pages;

import framework.Maps.LoginPageMap;
import framework.Utils.CommonActions;
import org.testng.annotations.BeforeMethod;

public class LoginPagePages {

    CommonActions commands;

    LoginPageMap lg = new LoginPageMap();

    public LoginPagePages(CommonActions commands) {
        this.commands = commands;
    }
    @BeforeMethod
    public void logIn(){
        commands.enterText(lg.loginPageUserEmail, "test888999000@gmail.com");
        commands.enterText(lg.loginPageUserPassword, "Test1234");
        commands.click(lg.loginButton);
    }

    @BeforeMethod
    public void invalidMail(){
        commands.enterText(lg.loginPageUserEmail, "test8@gmail.com");
        commands.enterText(lg.loginPageUserPassword, "Test1234");
        commands.click(lg.loginButton);
    }

    @BeforeMethod
    public void invalidPsw(){
        commands.enterText(lg.loginPageUserEmail, "test888999000@gmail.com");
        commands.enterText(lg.loginPageUserPassword, "Test100");
        commands.click(lg.loginButton);
    }
}
