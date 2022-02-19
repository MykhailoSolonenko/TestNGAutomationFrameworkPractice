package com.automationPractice.tests;

import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{

    @Test
    public void userCanLogoutFromApp () {

        loginPage.doLogin();

        homePage.verifyHomePage();

        homePage.clickOnLogoutMenu();

        homePage.clickLogoutLink();

        loginPage.verifyLoginPage();

    }

}
