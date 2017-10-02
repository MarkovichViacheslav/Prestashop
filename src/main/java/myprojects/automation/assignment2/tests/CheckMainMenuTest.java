package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckMainMenuTest extends BaseScript{

    private static WebDriver driver = getConfiguredDriver();
    private static By emailField = By.id("email");
    private static By passwordField = By.id("passwd");
    private static By loginButton = By.name("submitLogin");
    private static String emailText = "webinar.test@gmail.com";
    private static String passwordText = "Xcg7299bnSmMuRLp9ITw";

    private static By sectionHeader = By.tagName("h2");
    private static By dashBoardTab = By.id("tab-AdminDashboard");
    private static By ordersTab = By.id("subtab-AdminParentOrders");
    private static By catalogTab = By.id("subtab-AdminCatalog");
    private static By clientsTab = By.cssSelector(".main-menu > li:nth-of-type(5)");
    private static By supportTab = By.id("subtab-AdminParentCustomerThreads");
    private static By statsTab = By.id("subtab-AdminStats");
    private static By modulesTab = By.id("subtab-AdminParentModulesSf");
    private static By designTab = By.cssSelector(".main-menu > li:nth-of-type(10)");
    private static By shippingTab = By.id("subtab-AdminParentShipping");
    private static By paymentTab = By.id("subtab-AdminParentPayment");
    private static By internationalTab = By.id("subtab-AdminInternational");
    private static By shopTab = By.id("subtab-ShopParameters");
    private static By configurationTab = By.id("subtab-AdminAdvancedParameters");

    private static By[] array = {dashBoardTab, ordersTab, catalogTab, clientsTab, supportTab, statsTab, modulesTab, designTab, shippingTab, paymentTab, internationalTab, shopTab, configurationTab};

    public static void loggingToAdminPanel() throws InterruptedException {
        fillEmailField();
        fillPasswordField();
        clickLoginButton();
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

    public static void checkMainMenuItemsWithPageHeaders() {
        for (By i : array) {
            driver.findElement(i).click();   //clicking on the section tab
            WebElement header = driver.findElement(sectionHeader);
            String headerName = getHeaderName(header);
            printHeaderName(headerName);
            reloadPage();
            WebElement headerAfterReload = driver.findElement(sectionHeader);
            String headerName2 = getHeaderName(headerAfterReload);
            checkHeaderAfterReloadPage(headerName, headerName2);
        }
    }
    //return header of the Page
    public static String getHeaderName(WebElement element){
        String headerName = element.getText();
        return headerName;
    }
    // printing header to console*/
    public static void printHeaderName(String headerName){
        System.out.println(headerName);
    }

    public static void reloadPage(){
        driver.navigate().refresh();
    }

    // checking that user is on the the same section after page reload
    private static void checkHeaderAfterReloadPage(String header, String headerAfterReload) {

        if (header.equals(headerAfterReload)) {
            System.out.println("User is on the the same section after page reload");
        } else {
            System.out.println("Not the same section after page reload");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to check Main Menu items

        driver.navigate().to(Properties.getBaseAdminUrl());

        loggingToAdminPanel();

        checkMainMenuItemsWithPageHeaders();

        quitDriver(driver);
    }
}

