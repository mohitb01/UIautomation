package com.gl.automation.keywords;
/*
 * author : Mohit Bhatt
 * Date : 
 */

import static com.gl.automation.base.DriverScript.OR;

//import static com.mb.automationUI.base.DriverScript.OR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gl.automation.resources.Constants;
import com.gl.automation.utilities.BrowserFactory;

public class ActionKeywords {

    public static WebDriver driver;

    public static void openBrowser(String object) {
        // driver=new FirefoxDriver();
        driver = BrowserFactory.getBrowser(object);
    }

    public static void navigate(String object) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constants.URL);
    }

    public static void click_MyAccount(String object) {
        driver.findElement(By.xpath(OR.getProperty(object))).click();
    }

    public static void input_Username(String object) {
        driver.findElement(By.id(OR.getProperty(object)))
                .sendKeys(Constants.UserName);
    }

    public static void input_Password(String object) {
        driver.findElement(By.id(OR.getProperty(object)))
                .sendKeys(Constants.Password);
    }

    public static void click_Login(String object) {
        driver.findElement(By.id(OR.getProperty(object))).click();
    }

    public static void waitFor() throws Exception {
        Thread.sleep(5000);
    }

    public static void click_Logout(String object) {
        driver.findElement(By.xpath(OR.getProperty(object))).click();
    }

    public static void closeBrowser(String object) {
        driver.quit();
    }

}