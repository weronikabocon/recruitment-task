package pl.weronika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Login {
    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.ingksiegowosc.pl/");
    }

    @Test
    public void test() throws InterruptedException {
        StartPage startPage = new StartPage(driver);
        startPage.clickCookieModalAcceptButton();
        startPage.clickLoginButton();
        startPage.clickInvoiceLoginPageButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickCookieModalAcceptButton();
        loginPage.clickDemoLoginPageButton();

        DemoLoginPage demoLoginPage = new DemoLoginPage(driver);
        demoLoginPage.clickLoginButton();

        PortalMainPage portalMainPage = new PortalMainPage(driver);
        portalMainPage.clickAddInvoiceButton();

        PortalInvoicePage portalInvoicePage = new PortalInvoicePage(driver);
        portalInvoicePage.clickShowMore();
        portalInvoicePage.clickRadioButton();
        portalInvoicePage.enterProductName("abc");
        portalInvoicePage.clickAddProductButton();
        portalInvoicePage.clickServiceRadioButton();
        portalInvoicePage.clickSaveProductButton();
        portalInvoicePage.clickSendInvoice();

    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }

}
