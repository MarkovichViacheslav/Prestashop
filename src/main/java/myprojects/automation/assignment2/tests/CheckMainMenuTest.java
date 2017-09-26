package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to check Main Menu items

        WebDriver driver = getDriver();
        driver.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        //logging to AdminPanel
        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.name("submitLogin")).submit();
        Thread.sleep(5000);

        //navigating to "Dashboard"
        driver.findElement(By.id("tab-AdminDashboard")).click();
        WebElement dashboardHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String dashboardHeaderName = dashboardHeader.getText();
        System.out.println(dashboardHeaderName); // printing header to console*/
        driver.navigate().refresh(); //page reload
        WebElement dashboardHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String dashboardHeaderName2 = dashboardHeader2.getText();
        checkHeaderAfterReloadPage(dashboardHeaderName, dashboardHeaderName2);

        //navigating to "Заказы"
        driver.findElement(By.id("subtab-AdminParentOrders")).click();
        WebElement orderHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String orderHeaderName = orderHeader.getText();
        System.out.println(orderHeaderName); // printing header to console*/
        driver.navigate().refresh(); //page reload
        WebElement orderHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String orderHeaderName2 = orderHeader2.getText();
        checkHeaderAfterReloadPage(orderHeaderName, orderHeaderName2);

        //navigating to "Каталог"
        driver.findElement(By.id("subtab-AdminCatalog")).click();
        WebElement catalogHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String catalogHeaderName = catalogHeader.getText();
        System.out.println(catalogHeaderName); // printing header to console
        driver.navigate().refresh(); //page reload
        WebElement catalogHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String catalogHeaderName2 = catalogHeader2.getText();
        checkHeaderAfterReloadPage(catalogHeaderName, catalogHeaderName2);

        //navigating to "Клиенты"
        driver.findElement(By.cssSelector(".main-menu > li:nth-of-type(5)")).click();
        WebElement clientsHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String clientsHeaderName = clientsHeader.getText();
        System.out.println(clientsHeaderName); // printing header to console
        driver.navigate().refresh(); //page reload
        WebElement clientsHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String clientsHeaderName2 = clientsHeader2.getText();
        checkHeaderAfterReloadPage(clientsHeaderName, clientsHeaderName2);

        //navigating to "Служба поддержки"
        driver.findElement(By.id("subtab-AdminParentCustomerThreads")).click();
        WebElement supportHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String supportHeaderName = supportHeader.getText();
        System.out.println(supportHeaderName); // printing header to console
        driver.navigate().refresh(); //page reload
        WebElement supportHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String supportHeaderName2 = supportHeader2.getText();
        checkHeaderAfterReloadPage(supportHeaderName, supportHeaderName2);

        //navigating to "Статистика"
        driver.findElement(By.id("subtab-AdminStats")).click();
        WebElement statsHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String statsHeaderName = statsHeader.getText();
        System.out.println(statsHeaderName); // printing header to console*/
        driver.navigate().refresh(); //page reload
        WebElement statsHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String statsHeaderName2 = statsHeader2.getText();
        checkHeaderAfterReloadPage(statsHeaderName, statsHeaderName2);

        //navigating to "Modules"
        driver.findElement(By.id("subtab-AdminParentModulesSf")).click();
        WebElement modulesHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String modulesHeaderName = modulesHeader.getText();
        System.out.println(modulesHeaderName); // printing header to console*/
        driver.navigate().refresh(); //page reload
        WebElement modulesHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String modulesHeaderName2 = modulesHeader2.getText();
        checkHeaderAfterReloadPage(modulesHeaderName, modulesHeaderName2);

        //navigating to "Design"
        driver.findElement(By.cssSelector(".main-menu > li:nth-of-type(10)")).click();
        WebElement designHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String designHeaderName = designHeader.getText();
        System.out.println(designHeaderName); // printing header to console*/
        driver.navigate().refresh(); //page reload
        WebElement designHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String designHeaderName2 = designHeader2.getText();
        checkHeaderAfterReloadPage(designHeaderName, designHeaderName2);

        //navigating to "Доставка"
        driver.findElement(By.id("subtab-AdminParentShipping")).click();
        WebElement shippingHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String shippingHeaderName = shippingHeader.getText();
        System.out.println(shippingHeaderName); // printing header to console*/
        driver.navigate().refresh(); //page reload
        WebElement shippingHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String shippingHeaderName2 = shippingHeader2.getText();
        checkHeaderAfterReloadPage(shippingHeaderName, shippingHeaderName2);

        //navigating to "Способ оплаты"
        driver.findElement(By.id("subtab-AdminParentPayment")).click();
        WebElement paymentHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String paymentHeaderName = paymentHeader.getText();
        System.out.println(paymentHeaderName); // printing header to console*/
        driver.navigate().refresh(); //page reload
        WebElement paymentHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String paymentHeaderName2 = paymentHeader2.getText();
        checkHeaderAfterReloadPage(paymentHeaderName, paymentHeaderName2);

        //navigating to "International"
        driver.findElement(By.id("subtab-AdminInternational")).click();
        WebElement internationalHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String internationalHeaderName = internationalHeader.getText();
        System.out.println(internationalHeaderName); // printing header to console*/
        driver.navigate().refresh(); //page reload
        WebElement internationalHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String internationalHeaderName2 = internationalHeader2.getText();
        checkHeaderAfterReloadPage(internationalHeaderName, internationalHeaderName2);

        //navigating to "Shop Parameters"
        driver.findElement(By.id("subtab-ShopParameters")).click();
        WebElement shopHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String shopHeaderName = shopHeader.getText();
        System.out.println(shopHeaderName); // printing header to console*/
        driver.navigate().refresh(); //page reload
        WebElement shopHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String shopHeaderName2 = shopHeader2.getText();
        checkHeaderAfterReloadPage(shopHeaderName, shopHeaderName2);

        //navigating to "Конфигурация"
        driver.findElement(By.id("subtab-AdminAdvancedParameters")).click();
        WebElement configurationHeader = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String configurationHeaderName = configurationHeader.getText();
        System.out.println(configurationHeaderName); // printing header to console*/
        driver.navigate().refresh(); //page reload
        WebElement configurationHeader2 = driver.findElement(By.tagName("h2")); //finding header of the opened section
        String configurationHeaderName2 = configurationHeader2.getText();
        checkHeaderAfterReloadPage(configurationHeaderName, configurationHeaderName2);

        driver.close();
    }

        // checking that user is on the the same section after page reload
        private static void checkHeaderAfterReloadPage(String header, String headerAfterRefresh){

        if(header.equals(headerAfterRefresh)) {
            System.out.println("User is on the the same section after page reload");
        }
        else{
            System.out.println("Not the same section after page reload");
        }
        }
}

