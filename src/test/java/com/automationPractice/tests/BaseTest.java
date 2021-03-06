package com.automationPractice.tests;

import com.automationPractice.pages.HomePage;
import com.automationPractice.pages.LoginPage;
import com.automationPractice.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
LoginPage loginPage;
HomePage homePage;


    @BeforeMethod
    public void setUp () {
   DriverUtils.createDriver();

        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @AfterMethod
    public void cleanUp() {
        DriverUtils.getDriver().quit();
    }
}
