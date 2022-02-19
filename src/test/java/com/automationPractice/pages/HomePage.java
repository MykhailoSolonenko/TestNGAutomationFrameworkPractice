package com.automationPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage {
    @FindBy(xpath="//div [@class='dewey--Logo dewey--TopBar--logo']")
    WebElement homePageLogo;

    @FindBy(xpath = "//h1[@class='dewey--TopBar--title']")
    WebElement homePageTitle;

    @FindBy(xpath = "//span[@class='fa fa-user']")
    WebElement burgerMenu;

    @FindBy(xpath = "//a[@class='Menu--MenuItem Menu--MenuItem--default']")
    WebElement logoutLink;


    public void verifyHomePage() {
        Assert.assertTrue(homePageLogo.isDisplayed(), "Logo is missing from homepage");
        Assert.assertTrue(homePageTitle.isDisplayed(), "Title is missing from homepage");
    }

    public void clickOnLogoutMenu() {

        burgerMenu.click();
    }

    public void clickLogoutLink() {

        logoutLink.click();
    }
}
