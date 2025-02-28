package com.alkosto.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class SeleniumWebDriver {

    private SeleniumWebDriver(){
        throw new UnsupportedOperationException("utility class");
    }

    public static WebDriver driver;

    private static final String START_MAXIMIZED = "--start-maximized";
    private static final String IGNORE_CERTIFICATE_ERRORS = "--ignore-certificate-errors";
    private static final String DISABLE_INFOBARS = "--disable";

    public static void chromeDrive(String url){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments(START_MAXIMIZED);
        options.addArguments(IGNORE_CERTIFICATE_ERRORS);

        driver = new ChromeDriver(options);
        driver.get(url);


    }

    public static WebDriver getDriver() {
        return driver;
    }
}
