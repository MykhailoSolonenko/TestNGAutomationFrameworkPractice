package com.automationPractice.pages;

import com.automationPractice.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class LoginPage extends BasePage {

    @FindBy(id="username")
    WebElement userNameElement;

    @FindBy(id="password")
    WebElement passwordElement;

    @FindBy(xpath = "//button[@id='UsernamePasswordForm--loginButton']")
    WebElement loginButton;


    public void doLogin() {
        userNameElement.sendKeys(PropertyReader.getProperty("login.username"));
        passwordElement.sendKeys(PropertyReader.getProperty("login.password"));
        loginButton.click();
    }

    public void verifyLoginPage() {
            Assert.assertTrue(userNameElement.isDisplayed(),"Username input is missing from login page");
            Assert.assertTrue(passwordElement.isDisplayed(),"Password input is missing from login page");
    }
}




