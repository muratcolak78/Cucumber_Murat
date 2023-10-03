package pages;

import common.AbstracClass;
import common.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class HomePage extends AbstracClass {
    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
        //WebDriverManager.chromedriver().setup();
        driver.get("https://viaporttrans.com/");
        PageFactory.initElements(driver, this);
    }


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
    @FindBy(xpath = "/html/body/div[1]/header/div/div/div[2]/div/button[1]")
    private WebElement search;
    @FindBy(xpath = "//*[@id=\"rev_slider_2_1_forcefullwidth\"]")
    private WebElement slider;
    @FindBy(xpath = "//*[@id=\"rev_slider_2_1\"]/rs-arrow[2]")
    private WebElement rigthArrow;
    @FindBy(xpath = "//*[@id=\"rev_slider_2_1\"]/rs-arrow[1]")
    private WebElement leftArrow;
    @FindBy(xpath = "(//a[@href='https://viaporttrans.com/'])[1]")
    private WebElement logo;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[1]/a")
    private WebElement homePage;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/form/input")
    private WebElement searchTextBox;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/ul")
    private WebElement subMenu;
    @FindBy(xpath = "//*[@id=\"custom-id-0\"]")
    private WebElement readmore1;
    @FindBy(xpath = "//*[@id=\"custom-id-1\"]")
    private WebElement readmore2;
    @FindBy(xpath = "//*[@id=\"custom-id-2\"]")
    private WebElement readmore3;
    @FindBy(xpath = "//*[@id=\"custom-id-3\"]")
    private WebElement ContactUs2;
    @FindBy(xpath = "//*[@id=\"custom-id-4\"]")
    private WebElement readmore4;
    @FindBy(xpath = "//*[@id=\"custom-id-5\"]")
    private WebElement readmore5;
    @FindBy(xpath = "//*[@id=\"custom-id-6\"]")
    private WebElement readmore6;
    @FindBy(xpath = "(//a[@href=\"https://viaporttrans.com/transport/\"])[4]")
    private WebElement viewAllServices;
    @FindBy(xpath = "//*[@id=\"custom-id-7\"]")
    private WebElement ContactUs3;
    @FindBy(xpath = "//*[@id=\"custom-id-8\"]")
    private WebElement requestFreeQuote;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[1]/a")
    private WebElement thuis;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[2]/a")
    private WebElement wagenPark;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[3]/a")
    private WebElement diensten;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[4]/a")
    private WebElement OverOns;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[5]/a")
    private WebElement NeemContactOp;
    @FindBy(xpath = "//*[@id=\"text-3\"]/div/ul/li[1]/a")
    private WebElement Opslag;
    @FindBy(xpath = "//*[@id=\"text-3\"]/div/ul/li[2]/a")
    private WebElement Logistiek;
    @FindBy(xpath = "//*[@id=\"text-3\"]/div/ul/li[3]/a")
    private WebElement Vervoer;
    @FindBy(xpath = "//*[@id=\"text-5\"]/div/ul/li[2]/a")
    private WebElement telefon;
    @FindBy(xpath = "//*[@id=\"text-5\"]/div/ul/li[3]/a")
    private WebElement BTW;
    @FindBy(xpath = "//*[@id=\"slider-2-slide-2-layer-5\"]")
    private WebElement GetAQuote;
    @FindBy(xpath = "//*[@id=\"slider-2-slide-4-layer-5\"]")
    private WebElement GetAQuote2;
    @FindBy(xpath = "//*[@id=\"slider-2-slide-3-layer-5\"]")
    private WebElement GetAQuote3;
    @FindBy(xpath = "//*[@id=\"gtranslate_wrapper\"]/div[1]/div[1]/a")
    private WebElement translateOptions;
    @FindBy(xpath = "//*[@id=\"gtranslate_wrapper\"]/div[1]/div[2]")
    private WebElement translateDisplay;
    @FindBy(xpath = "//*[@id=\"gtranslate_wrapper\"]/div[1]/div[2]/a[11]")
    private WebElement turkish;
    String homeLinks = "https://viaporttrans.com/";
    String vehicleFleetLinks = "https://viaporttrans.com/vehicle-fleet/";
    String serviceStorageLinks = "https://viaporttrans.com/storage-2/";
    String serviceLogisticLinks = "https://viaporttrans.com/logistic-2/";
    String serviceTransportLinks = "https://viaporttrans.com/transport/";
    String aboutUsLinks = "https://viaporttrans.com/about-us/";
    String contactUsLinks = "https://viaporttrans.com/contact-us/";


    public void gotoHomePage() {
        clicFunction(homePage);
    }

    public void AssertgotoHomePage() {
        assertLinks(driver, homeLinks);
    }

    public void gotoVehicleFleet() {
        clicFunction(vehicleFleet);
    }

    public void AssertgotoVehicleFleet() {
        assertLinks(driver, vehicleFleetLinks);
    }

    public void gotoServiceStorage() {
        action.moveToElement(services).build().perform();
        clicFunction(services);
        clicFunction(serviceStorage);
    }

    public void AssertgotoServiceStorage() {
        assertLinks(driver, serviceStorageLinks);
    }

    public void gotoServiceLogistic() {
        action.moveToElement(services).build().perform();
        clicFunction(serviceLogistic);
    }

    public void AssertgotoServiceLogistic() {
        assertLinks(driver, serviceLogisticLinks);
    }

    public void gotoServiceTransport() {
        action.moveToElement(services).build().perform();
        clicFunction(serviceTransport);
    }

    public void AssertgotoserviceTransport() {
        assertLinks(driver, serviceTransportLinks);
    }

    public void gotoAboutUs() {
        clicFunction(AboutUs);
    }

    public void AssertgotoAboutUs() {
        assertLinks(driver, aboutUsLinks);
    }

    public void gotoContactUs() {
        clicFunction(ContactUs);
    }

    public void AssertgotoContactUs() {
        assertLinks(driver, contactUsLinks);
    }

    public void searcButton() {
        clicFunction(search);

    }

    public void clickReadMoreFirst() {
        clicFunction(readmore1);
    }


    public void assertReadMoreFirst() {
        assertLinks(driver, serviceStorageLinks);
    }


    public void clickReadMoreSecond() {
        clicFunction(readmore2);
    }


    public void assertReadMoreSecond() {
        assertLinks(driver, serviceLogisticLinks);
    }


    public void clickReadMoreThird() {
        clicFunction(readmore3);
    }


    public void assertReadMoreThird() {
        assertLinks(driver, serviceTransportLinks);
    }


    public void clickContactUsButton() {
        action.moveToElement(readmore4).build().perform();
        clicFunction(ContactUs2);
    }


    public void assertContactUsButton() {
        assertLinks(driver, contactUsLinks);
    }


    public void clickReadMorefourth() {
        clicFunction(readmore4);
    }


    public void assertReadMorefourth() {
        assertLinks(driver, serviceStorageLinks);
    }


    public void clickReadMorefifth() {
        clicFunction(readmore5);
    }


    public void assertReadMorefifth() {
        assertLinks(driver, serviceLogisticLinks);
    }


    public void clickReadMoreSixth() {
        clicFunction(readmore6);
    }


    public void assertReadMoreSixth() {
        assertLinks(driver, serviceTransportLinks);
    }


    public void clickViewAllServices() {
        clicFunction(viewAllServices);
    }


    public void assertViewAllServices() {
        assertLinks(driver, serviceTransportLinks);
    }


    public void clickContactUsButtonSecond() {
        clicFunction(ContactUs3);

    }

    public void assertContactUsButtonSecond() {
        assertLinks(driver, contactUsLinks);
    }


    public void clickRequestFreeQuote() {
        clicFunction(requestFreeQuote);
    }


    public void assertRequestFreeQuote() {
        assertLinks(driver, contactUsLinks);
    }

    public void clickThuis() {
        clicFunction(thuis);
    }

    public void assertThuis() {
        assertLinks(driver, homeLinks);

    }

    public void clickWagenPark() {
        clicFunction(wagenPark);
    }


    public void assertWagenPark() {
        assertLinks(driver, vehicleFleetLinks);

    }


    public void clickDiensten() {
        clicFunction(diensten);
    }


    public void assertDiensten() {
        assertLinks(driver, serviceStorageLinks);
    }


    public void clickOverOns() {
        clicFunction(OverOns);
    }


    public void assertOverOns() {
        assertLinks(driver, aboutUsLinks);
    }


    public void clickNeemContactOp() {
        clicFunction(NeemContactOp);
    }


    public void assertNeemContactOp() {
        assertLinks(driver, contactUsLinks);
    }


    public void clickOpstag() {
        clicFunction(Opslag);
    }


    public void assertOpstag() {
        assertLinks(driver, serviceStorageLinks);
    }


    public void clickLogistiek() {
        clicFunction(Logistiek);
    }


    public void assertLogistiek() {
        assertLinks(driver, serviceLogisticLinks);
    }


    public void clickVervoer() {
        clicFunction(Vervoer);
    }


    public void assertVervoer() {
        assertLinks(driver, serviceTransportLinks);
    }


    public void clickNumber() {
        clicFunction(telefon);
    }


    public void assertNumber() {
        assertLinks(driver, "http://+320467745898/");
    }


    public void clickBTW() {
        clicFunction(BTW);
    }


    public void assertBTW() {
        assertLinks(driver, "about:blank#blocked");
    }


    public void clickLanguage() {
        clicFunction(translateOptions);
    }


    public void assertLanguage() {
        assertIsDisplay(translateOptions, translateDisplay);
    }

    public void searchButton() {
        clicFunction(search);
    }
    public void sendKeys() {
        sendKeysFunktions(searchTextBox,"deneme");

    }
    public void assertSearch() {
        assertLinks(driver,"https://viaporttrans.com/?s=deneme");
    }
}
