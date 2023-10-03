package stepDefinition;

import common.AbstracClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class stepHomePageHeader extends AbstracClass {
    HomePage home=new HomePage();
   @Given("Navigate HomePage")
    public void navigateHomePage() {
        home.gotoHomePage();
    }

    @When("click vehicleFleet")
    public void clickVehicleFleet() {
        home.gotoVehicleFleet();
    }

    @Then("assert go to VehicleFleet")
    public void assertGoToVehicleFleet() {
        home.AssertgotoVehicleFleet();
    }

    @When("click ServiceStorage")
    public void clickServiceStorage() {
        home.gotoServiceStorage();
    }

    @Then("assert ServiceStorage")
    public void assertServiceStorage() {
        home.AssertgotoServiceStorage();
    }

    @When("click ServiceLogistic")
    public void clickServiceLogistic() {
        home.gotoServiceLogistic();
    }

    @Then("assert go to ServiceLogistic")
    public void assertGoToServiceLogistic() {
        home.AssertgotoServiceLogistic();
    }

    @When("click ServiceTransport")
    public void clickServiceTransport() {
        home.gotoServiceTransport();
    }

    @Then("assert go to ServiceTransport")
    public void assertGoToServiceTransport() {
        home.AssertgotoserviceTransport();
    }

    @When("click AboutUs")
    public void clickAboutUs() {
        home.gotoAboutUs();
    }

    @Then("assert go to AboutUs")
    public void assertGoToAboutUs() {
        home.AssertgotoAboutUs();
    }

    @When("click ContactUs")
    public void clickContactUs() {
        home.gotoContactUs();
    }

    @Then("assert go to ContactUs")
    public void assertGoToContactUs() {
        home.AssertgotoContactUs();
    }

    @And("click Search")
    public void clickSearch() {
       home.searchButton();
    }


    @When("send keys")
    public void send_keys() {
       home.sendKeys();
    }
    @Then("assert go to Search")
    public void assertGoToSearch() {
        home.assertSearch();
    }


}
