package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseScript {

    private static WebDriver driver =  getConfiguredDriver();
    private static By emailField = By.id("email");
    private static By passwordField = By.id("passwd");
    private static By loginButton = By.name("submitLogin");
    private static String emailText = "webinar.test@gmail.com";
    private static String passwordText = "Xcg7299bnSmMuRLp9ITw";
    private static By logoutImage = By.cssSelector("span.employee_avatar_small");
    private static By logoutButton = By.id("header_logout");

    public static void loggingToAdminPanel() throws InterruptedException {
        fillEmailField();
        fillPasswordField();
        clickLoginButton();
    }

    public static void logout() throws InterruptedException {
        clickLogoutImage();
        clicklogoutButton();
    }

    public static void fillEmailField(){
        driver.findElement(emailField).sendKeys(emailText);
    }

    public static void fillPasswordField(){
        driver.findElement(passwordField).sendKeys(passwordText);
    }

    public static void clickLoginButton() throws InterruptedException {
        driver.findElement(loginButton).submit();
        Thread.sleep(5000);
    }

    public static void clickLogoutImage(){
        driver.findElement(logoutImage).click();
    }

    public static void clicklogoutButton(){
        driver.findElement(logoutButton).click();
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps

        driver.navigate().to(Properties.getBaseAdminUrl());

        //logging to AdminPanel
        loggingToAdminPanel();

        //logout
        logout();

        quitDriver(driver);
    }
}
