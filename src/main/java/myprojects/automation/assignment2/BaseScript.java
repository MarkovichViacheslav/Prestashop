package myprojects.automation.assignment2;

import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;

public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        // TODO return  WebDriver instance
        String browser = Properties.getBrowser();
        try {
            switch (browser) {
                case "firefox":
                    System.setProperty(
                            "webdriver.gecko.driver",
                            new File(BaseScript.class.getResource("/geckodriver.exe").getFile()).getPath());
                    return new FirefoxDriver();
                case "ie":
                case "internet explorer":
                    System.setProperty(
                            "webdriver.ie.driver",
                            new File(BaseScript.class.getResource("/IEDriverServer.exe").getFile()).getPath());
                    return new InternetExplorerDriver();
                case "chrome":
                default:
                    System.setProperty(
                            "webdriver.chrome.driver",
                            new File(BaseScript.class.getResource("/chromedriver.exe").getFile()).getPath());
                    return new ChromeDriver();
            }
      
        } catch (UnsupportedOperationException exc) {
            throw new UnsupportedOperationException("Method doesn't return WebDriver instance");
        }
    }

    public static WebDriver getConfiguredDriver(){
        WebDriver configuredDriver = getDriver();
        configuredDriver.manage().window().maximize();

        return configuredDriver;
    }

        public static void quitDriver(WebDriver driver){
            driver.quit();
        }
    }
