package stepDefinition;

import common.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.VehicleFleet;

public class stepVehicleFleet {
    VehicleFleet vehicle=new VehicleFleet();

    @Given("Navigate VehicleFleet")
    public void navigate_vehicle_fleet() {
       vehicle.navigate();
    }
    @Given("click firstPicture")
    public void click_first_picture() throws InterruptedException {
        vehicle.firstPicture();
    }
    @Given("click rightArrow")
    public void click_right_arrow() {
       vehicle.clickRightArrow();
    }
    @Given("click rigthArrow")
    public void click_rigth_arrow() {
        vehicle.clickRightArrow();
    }
    @Given("click leftArrrow")
    public void click_left_arrrow() {
       vehicle.clickLeftArrow();
    }
    @When("click close")
    public void click_close() {
       vehicle.closePictures();
    }
    @Then("assert VehicleFleePage")
    public void assert_vehicle_flee_page() throws InterruptedException {
       vehicle.assertVehicleFleetLink();
    }

    @When("click getQuote")
    public void clickGetQuote() {
        vehicle.getQuote();
    }


    @Then("assert go to VehicleContactUs")
    public void assertGoToVehicleContactUs() {
        vehicle.AssertgotoContactUs();
    }

    @Then("close VehicleDriver")
    public void closeVehicleDriver() {
        Driver.closeDriver();
    }
}
