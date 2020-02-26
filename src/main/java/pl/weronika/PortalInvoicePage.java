package pl.weronika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalInvoicePage {
    @FindBy(css = "div.toggle-button:nth-child(4) > div:nth-child(1) > span:nth-child(1)")
    private WebElement showMoreButton;

    @FindBy(css = ".options--left > div:nth-child(3) > label:nth-child(2)")
    private WebElement radioButton;

    @FindBy(css = ".text-wrapper > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    private WebElement productNameField;

    @FindBy(css = "button.btn-block")
    private WebElement sendInvoiceButton;

    @FindBy(css = ".margin-left-0-9-rem > a:nth-child(1) > span:nth-child(2)")
    private WebElement addProductButton;

    @FindBy(css = "button.btn:nth-child(2)")
    private WebElement saveProductButton;

    @FindBy(css = ".group--inline > div:nth-child(2) > label:nth-child(2) > span:nth-child(1)")
    private WebElement serviceRadioButton;

    private WebDriver driver;

    public PortalInvoicePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickShowMore() {
        showMoreButton.click();
    }

    public void clickRadioButton() {
        radioButton.click();
    }

    public void enterProductName(String name) {
        productNameField.sendKeys(name);
    }

    public void clickSendInvoice() {
        sendInvoiceButton.click();
    }

    public void clickAddProductButton() {
        addProductButton.click();
    }

    public void clickSaveProductButton() {
        saveProductButton.click();
    }

    public void clickServiceRadioButton() {
        serviceRadioButton.click();
    }


}

