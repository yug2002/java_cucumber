package com.cucumber.junit.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Optional;

import static org.openqa.selenium.chrome.ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;

public class DriverManager {

    private final static String CHROME_DRIVER_PATH = "./src/main/resources/chromedriver.exe";
    private final static int IMPLICITLY_WAITER = 5;
    private final static int PAGELOAD_WAITER = 20;
    private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    private DriverManager() {

    }

    public static void setupDriver() {
        System.setProperty(CHROME_DRIVER_EXE_PROPERTY, CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAITER, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(PAGELOAD_WAITER, TimeUnit.SECONDS);
        webDriverThreadLocal.set(driver);
    }

    public static WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }

    public static void quitDriver() {
        Optional.ofNullable(getDriver()).ifPresent(webDriver -> {
            webDriver.quit();
            webDriverThreadLocal.remove();
        });
    }
}
