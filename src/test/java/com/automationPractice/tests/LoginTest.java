package com.automationPractice.tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void verifyUserCanLogin() {

        loginPage.doLogin();

        homePage.verifyHomePage();
    }

}
