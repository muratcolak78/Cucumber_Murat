package pages;

import common.AbstracClass;
import common.Driver;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class VehicleFleet extends AbstracClass {
    private WebDriver driver;

    public VehicleFleet() {
        driver = Driver.getDriver();
        driver.get("https://viaporttrans.com/");
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[2]/a")
    private WebElement vehicleFleet;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[1]/a")
    private WebElement homePage;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div")
    private WebElement firstPictureContanier;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/4-new-360x267-1.jpg']")
    private WebElement firstPic;

    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/4-new-360x267-2.jpg']")
    private WebElement secondPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/2-new-360x267-1.jpg']")
    private WebElement thirdPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/7-1-new-360x267-1.jpg']")
    private WebElement fourthPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/10-1-new-360x267-1.jpg']")
    private WebElement fifthPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/featured-img-3.jpg']")
    private WebElement sixthPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/intro-img-3-1024x474.jpg']")
    private WebElement seventhPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/9-2-new-360x267-1.jpg']")
    private WebElement eighthPic;
    @FindBy(xpath = "//a[@id='custom-id-0']")
    private WebElement getQueth;
    @FindBy(xpath = "//div[@id='lightboxOverlay']")
    private WebElement display;
    @FindBy(xpath = "//a[@class='lb-close']")
    private WebElement close;
    @FindBy(xpath = "/html/body/div[1]/section/div/div[1]/div/div/div/div/div/div/ul")
    private WebElement closeCOntainer;

    @FindBy(xpath = "//a[@class='lb-prev']")
    private WebElement leftArrow;
    @FindBy(xpath = "//a[@class='lb-next']")
    private WebElement rightArrow;

    @FindBy(xpath = "//*[@id=\"lightbox\"]/div[1]/div/div[2]")
    private WebElement slideMenu;
    @FindBy(xpath = "//iframe[@src='https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2500.8156305904486!2d4.360146915968931!3d51.18562097958352!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c3f6aa69800e05%3A0x26ba4a7f8b5d5a17!2sMeetjeslandstraat%2061%2C%202660%20Antwerpen%2C%20Bel%C3%A7ika!5e0!3m2!1str!2str!4v1674420753522!5m2!1str!2str']")
    private WebElement googleMaps;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[1]/a")
    private WebElement thuis;
    @FindBy(xpath = "//*[@id=\"lightbox\"]")
    private WebElement lightBox;
    public void navigate() {
        clicFunction(vehicleFleet);
    }

    public void firstPicture() throws InterruptedException {
        clicFunction(firstPic);
        moveToElement(firstPictureContanier);
        Thread.sleep(1000);
    }

    public void clickRightArrow() {
       moveToElement(rightArrow);
        clicFunction(rightArrow);
    }

    public void clickLeftArrow() {
        moveToElement(leftArrow);
        clicFunction(leftArrow);
    }

    public void closePictures() {
        moveToElement(lightBox);
        clicFunction(lightBox);
    }

    public void assertVehicleFleetLink() throws InterruptedException {
        assertLinks(driver, "https://viaporttrans.com/vehicle-fleet/");
    }

    public void getQuote() {
        moveToElement(getQueth);
        clicFunction(getQueth);
    }

    public void AssertgotoContactUs() {
        assertLinks(driver, "https://viaporttrans.com/contact-us/");
    }
}
