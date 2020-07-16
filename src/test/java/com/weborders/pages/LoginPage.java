package com.weborders.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id="ctl00_MainContent_username")
    private WebElement userName;
    @FindBy(id="ctl00_MainContent_password")
    private WebElement password;

    public void login(String usernameValue, String passwordValue){

        userName.sendKeys ( usernameValue );
        password.sendKeys ( passwordValue, Keys.ENTER );

    }
}
