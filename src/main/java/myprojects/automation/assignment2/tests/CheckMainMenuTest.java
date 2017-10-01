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

    public static void clickDashBoardTab(){
        driver.findElement(dashBoardTab).click();
    }

    public static void clickOrdersTab(){
        driver.findElement(ordersTab).click();
    }

    public static void clickCatalogTab(){
        driver.findElement(catalogTab).click();
    }

    public static void clickClientsTab(){
        driver.findElement(clientsTab).click();
    }

    public static void clickSupportTab(){
        driver.findElement(supportTab).click();
    }

    public static void clickStatsTab(){
        driver.findElement(statsTab).click();
    }

    public static void clickModulesTab(){
        driver.findElement(modulesTab).click();
    }

    public static void clickDesignTab(){
        driver.findElement(designTab).click();
    }

    public static void clickShippingTab(){
        driver.findElement(shippingTab).click();
    }

    public static void clickPaymentTab(){
        driver.findElement(paymentTab).click();
    }

    public static void clickInternationalTab(){
        driver.findElement(internationalTab).click();
    }
    
    public static void clickShopTab(){
        driver.findElement(shopTab).click();
    }

    public static void clickConfigurationTab(){
        driver.findElement(configurationTab).click();
    }

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

        //navigating to "Dashboard"
        clickDashBoardTab();
        WebElement dashboardHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String dashboardHeaderName = getHeaderName(dashboardHeader);
        printHeaderName(dashboardHeaderName);
        reloadPage();
        WebElement dashboardHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String dashboardHeaderName2 = getHeaderName( dashboardHeaderAfterReload);
        checkHeaderAfterReloadPage(dashboardHeaderName, dashboardHeaderName2);

        //navigating to "Заказы"
        clickOrdersTab();
        WebElement ordersHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String ordersHeaderName = getHeaderName(ordersHeader);
        printHeaderName(ordersHeaderName);
        reloadPage();
        WebElement ordersHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String ordersHeaderName2 = getHeaderName(ordersHeaderAfterReload);
        checkHeaderAfterReloadPage(ordersHeaderName, ordersHeaderName2);

        //navigating to "Каталог"
        clickCatalogTab();
        WebElement catalogHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String catalogHeaderName = getHeaderName(catalogHeader);
        printHeaderName(catalogHeaderName);
        reloadPage();
        WebElement catalogHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String catalogHeaderName2 = getHeaderName(catalogHeaderAfterReload);
        checkHeaderAfterReloadPage(catalogHeaderName, catalogHeaderName2);

        //navigating to "Клиенты"
        clickClientsTab();
        WebElement clientsHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String clientsHeaderName = getHeaderName(clientsHeader);
        printHeaderName(clientsHeaderName); // printing header to console
        reloadPage();
        WebElement clientsHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String clientsHeaderName2 = getHeaderName(clientsHeaderAfterReload);
        checkHeaderAfterReloadPage(clientsHeaderName, clientsHeaderName2);

        //navigating to "Служба поддержки"
        clickSupportTab();
        WebElement supportHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String supportHeaderName = getHeaderName(supportHeader);
        printHeaderName(supportHeaderName); // printing header to console
        reloadPage();
        WebElement supportHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String supportHeaderName2 = getHeaderName(supportHeaderAfterReload);
        checkHeaderAfterReloadPage(supportHeaderName, supportHeaderName2);

        //navigating to "Статистика"
        clickStatsTab();
        WebElement statsHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String statsHeaderName = getHeaderName(statsHeader);
        printHeaderName(statsHeaderName);
        reloadPage();
        WebElement statsHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String statsHeaderName2 = getHeaderName(statsHeaderAfterReload);
        checkHeaderAfterReloadPage(statsHeaderName, statsHeaderName2);

        //navigating to "Modules"
        clickModulesTab();
        WebElement modulesHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String modulesHeaderName = getHeaderName(modulesHeader);
        printHeaderName(modulesHeaderName);
        reloadPage();
        WebElement modulesHeaderAfterReload  = driver.findElement(sectionHeader); //finding header of the opened section
        String modulesHeaderName2 = getHeaderName(modulesHeaderAfterReload);
        checkHeaderAfterReloadPage(modulesHeaderName, modulesHeaderName2);

        //navigating to "Design"
        clickDesignTab();
        WebElement designHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String designHeaderName = getHeaderName(designHeader);
        printHeaderName(designHeaderName);
        reloadPage();
        WebElement designHeaderAfterReload  = driver.findElement(sectionHeader); //finding header of the opened section
        String designHeaderName2 = getHeaderName(designHeaderAfterReload);
        checkHeaderAfterReloadPage(designHeaderName, designHeaderName2);

        //navigating to "Доставка"
        clickShippingTab();
        WebElement shippingHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String shippingHeaderName = getHeaderName(shippingHeader);
        printHeaderName(shippingHeaderName);
        reloadPage();
        WebElement shippingHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String shippingHeaderName2 = getHeaderName(shippingHeaderAfterReload);
        checkHeaderAfterReloadPage(shippingHeaderName, shippingHeaderName2);

        //navigating to "Способ оплаты"
        clickPaymentTab();
        WebElement paymentHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String paymentHeaderName = getHeaderName(paymentHeader);
        printHeaderName(paymentHeaderName);
        reloadPage();
        WebElement paymentHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String paymentHeaderName2 = getHeaderName(paymentHeaderAfterReload);
        checkHeaderAfterReloadPage(paymentHeaderName, paymentHeaderName2);

        //navigating to "International"
        clickInternationalTab();
        WebElement internationalHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String internationalHeaderName = getHeaderName(internationalHeader);
        printHeaderName(internationalHeaderName);
        reloadPage();
        WebElement internationalHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String internationalHeaderName2 = getHeaderName(internationalHeaderAfterReload);
        checkHeaderAfterReloadPage(internationalHeaderName, internationalHeaderName2);

        //navigating to "Shop Parameters"
        clickShopTab();
        WebElement shopHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String shopHeaderName = getHeaderName(shopHeader);
        printHeaderName(shopHeaderName);
        reloadPage();
        WebElement shopHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String shopHeaderName2 = getHeaderName(shopHeaderAfterReload);
        checkHeaderAfterReloadPage(shopHeaderName, shopHeaderName2);

        //navigating to "Конфигурация"
        clickConfigurationTab();
        WebElement configurationHeader = driver.findElement(sectionHeader); //finding header of the opened section
        String configurationHeaderName = getHeaderName(configurationHeader);
        printHeaderName(configurationHeaderName);
        reloadPage();
        WebElement configurationHeaderAfterReload = driver.findElement(sectionHeader); //finding header of the opened section
        String configurationHeaderName2 = getHeaderName(configurationHeaderAfterReload);;
        checkHeaderAfterReloadPage(configurationHeaderName, configurationHeaderName2);

        quitDriver(driver);
    }

}

