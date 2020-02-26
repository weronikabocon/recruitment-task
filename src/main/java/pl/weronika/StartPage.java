package pl.weronika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {
    @FindBy(css = ".js-cookie-policy-main-accept-button")
    private WebElement cookieModalAcceptButton;

    @FindBy(css = ".login_button")
    private WebElement loginButton;

    @FindBy(css = "#login > p:nth-child(2) > a:nth-child(1)")
    private WebElement invoiceLoginPageButton;

    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCookieModalAcceptButton() {
        cookieModalAcceptButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickInvoiceLoginPageButton() {
        invoiceLoginPageButton.click();
    }

}
