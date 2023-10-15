package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\chrome116Drivers\\chromedriver-win64\\chromedriver.exe");
            ChromeOptions cop = new ChromeOptions();
            cop.setBinary("C:\\chrome116Drivers\\chrome-win64\\chrome.exe");

            driver = new ChromeDriver(cop);
            WebDriverManager.chromedriver().setup();
            //driver=new FirefoxDriver();


        }
        //WebDriverManager.firefoxdriver().setup();
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
