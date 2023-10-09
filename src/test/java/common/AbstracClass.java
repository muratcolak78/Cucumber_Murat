package common;

import lombok.Getter;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
@Getter
public abstract class AbstracClass {
    protected WebDriverWait webDriverWait;
    protected Actions action;
    private String homeLinks = "https://viaporttrans.com/";
    private String vehicleFleetLinks = "https://viaporttrans.com/vehicle-fleet/";
    private String serviceStorageLinks = "https://viaporttrans.com/storage-2/";
    private String serviceLogisticLinks = "https://viaporttrans.com/logistic-2/";
    private String serviceTransportLinks = "https://viaporttrans.com/transport/";
    private String aboutUsLinks = "https://viaporttrans.com/about-us/";
    private String contactUsLinks = "https://viaporttrans.com/contact-us/";


    public AbstracClass() {

        this.webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        this.action = new Actions(Driver.getDriver());

    }

    public void clicFunction(WebElement clickElement) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunktions(WebElement sendKeysElement, String value) {
        webDriverWait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value,Keys.ENTER);

    }

    public void selecElemenetFromDropDown(WebElement dropDown, String element) {
        webDriverWait.until(ExpectedConditions.visibilityOf(dropDown));
        Select slc = new Select(dropDown);
        slc.selectByVisibleText(element);
    }

    public void assertLinks(WebDriver driver, String links) {
        webDriverWait.until(ExpectedConditions.urlContains(links));
        Assert.assertTrue(driver.getCurrentUrl().equals(links));
    }
    public void assertIsDisplay(WebElement element,WebElement element2) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed());
    }
    public void moveToElement(WebElement element){
        action.moveToElement(element).build().perform();
    }
    public void assertLinksFalse(WebDriver driver, String links) {
        webDriverWait.until(ExpectedConditions.urlContains(links));
        Assert.assertFalse(driver.getCurrentUrl().equals(links));
    }
    public void assertMessage(WebElement element, String text){
        Assert.assertTrue(element.getText().contains(text));
    }
}
