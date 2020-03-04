package com.gl.automation.utilities;
/*
 * author : Mohit Bhatt
 * Date : 
 */

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gl.automation.resources.Constants;

public class BrowserFactory {

    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    /*
     * Factory method for getting browsers
     */
    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;

        switch (browserName) {
        case "Firefox":
            driver = drivers.get("Firefox");
            if (driver == null) {
                System.setProperty("webdriver.gecko.driver",
                        Constants.Path_GECKO);
                driver = new FirefoxDriver();
                drivers.put("Firefox", driver);
            }
            break;
        case "IE":
            driver = drivers.get("IE");
            if (driver == null) {
                System.setProperty("webdriver.ie.driver",
                        Constants.Path_IEDRIVER);
                driver = new InternetExplorerDriver();
                drivers.put("IE", driver);
            }
            break;
        case "Chrome":
            driver = drivers.get("Chrome");
            if (driver == null) {
                System.setProperty("webdriver.chrome.driver",
                        Constants.Path_CHROMEDRIVER);
                driver = new ChromeDriver();
                drivers.put("Chrome", driver);
            }
            break;
        }
        return driver;
    }

    public static void closeAllDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            drivers.get(key).quit();
        }
    }
}