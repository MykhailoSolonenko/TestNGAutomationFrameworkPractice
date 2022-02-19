package com.automationPractice.utils;

import com.automationPractice.pages.HomePage;
import com.automationPractice.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {

   static WebDriver driver;

   public static void createDriver() {
       // Setting path to chromedriver.exe
       System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
       // Open the browser
       driver = new ChromeDriver();
       // 1. To open url in browser
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

       driver.get(PropertyReader.getProperty("app.url"));
       driver.manage().window().maximize();
   }

   public static WebDriver getDriver() {
       return driver;
   }

}
