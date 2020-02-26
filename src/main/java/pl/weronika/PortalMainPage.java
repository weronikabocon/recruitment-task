package pl.weronika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalMainPage {
    @FindBy(css = "li.form-group:nth-child(8) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
    private WebElement addInvoiceButton;

    private WebDriver driver;

    public PortalMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddInvoiceButton() {
        addInvoiceButton.click();
    }

}
