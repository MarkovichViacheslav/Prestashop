package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        // TODO return  WebDriver instance
        try {
            System.setProperty("webdriver.chrome.driver", "C:/Program Files/Google/Chrome/chromedriver.exe");
            return new ChromeDriver();
        }
        catch(UnsupportedOperationException exc) {
            throw new UnsupportedOperationException("Method doesn't return WebDriver instance");
        }
    }
}