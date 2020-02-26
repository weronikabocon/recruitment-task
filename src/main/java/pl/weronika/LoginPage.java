package pl.weronika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class LoginPage {
    @FindBy(css = ".col-mobile-offset-5 > button:nth-child(1)")
    private WebElement cookieModalAcceptButton;

    @FindBy(css = ".footer-list > li:nth-child(4) > a:nth-child(1)")
    private WebElement demoLoginPageButton;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCookieModalAcceptButton() {
        cookieModalAcceptButton.click();
    }

    public void clickDemoLoginPageButton() throws InterruptedException {
        Set<String> whBefore = driver.getWindowHandles();
        demoLoginPageButton.click();
        Thread.sleep(2000);
        Set<String> whAfter = driver.getWindowHandles();

        if (whAfter.size() > whBefore.size()) {
            whAfter.removeAll(whBefore);
        }

        driver.switchTo().window(whAfter.iterator().next());
    }

}
