package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Service;

public class stepService {
    Service service =new Service();

    @Given("Navigate Service Storage")
    public void navigate_service_storage() {
       service.navigateServiceStorage();
    }

    @Then("assert isPageServiceStorage")
    public void assertIsPageServiceStorage() {
        service.asserStorage();
    }

    @Then("assert isPageServiceLogistik")
    public void assertIsPageServiceLogistik() {
        service.asserlogistik();
    }

    @When("click Storage")
    public void clickStorage() {
        service.gotoStorage();
    }

    @When("click Logistic")
    public void clickLogistic() throws InterruptedException {
        service.gotoLogistik();
    }

    @When("click LogistikContactUst")
    public void clickLogistikContactUst() {
        service.clickLogistikContactUs();
    }


    @Then("assertLogistikContactUs")
    public void assertlogistikcontactus() {
        service.assertLogistikContacUs();
    }

    @When("click Transport")
    public void clickTransport() {
        service.clickTransport();

    }

    @Then("assert isPageTransport")
    public void assertIsPageTransport() {
        service.assertThisPageTransport();
    }

    @When("click transportContactUs")
    public void clickTransportContactUs() {
        service.clickttransportContact();

    }

    @Then("assert isPageContactUs")
    public void assertIsPageContactUs() {
        service.asserThisPageContactUs();

    }
}
