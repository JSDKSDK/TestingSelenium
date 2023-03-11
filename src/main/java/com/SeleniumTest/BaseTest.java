package com.SeleniumTest;

import java.time.Duration;
import java.util.logging.Logger;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    Logger logger = Logger.getLogger("myLogger");
    public WebDriver  setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Desarrollo/Java/Plugins-librerias-drivers/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get(Constants.URL);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return driver;
    }
}*/
public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    Logger logger = Logger.getLogger("myLogger");

    public void setup() {
        driver = DriverManager.getDriver();

        driver.manage().window().maximize();
        driver.get(Constants.URL);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
      // DriverManager.quitDriver();
    }
}


