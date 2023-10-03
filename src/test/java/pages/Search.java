package pages;

import common.AbstracClass;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class Search extends AbstracClass {
    public Search(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[1]/a")
    private WebElement homePage;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[2]/a")
    private WebElement vehicleFleet;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/a")
    private WebElement services;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/ul/li[1]/a")
    private WebElement serviceStorage;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/ul/li[2]/a")
    private WebElement serviceLogistic;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/ul/li[3]/a")
    private WebElement serviceTransport;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[4]/a")
    private WebElement AboutUs;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[5]/a")
    private WebElement ContactUs;
    @FindBy(xpath = "//button[@class='fa fa-search site-search-toggle']")
    private WebElement search;
    @FindBy(xpath = "//input[@name='s']")
    private WebElement searchTextBox;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div/h1")
    private WebElement searchResult;

}
