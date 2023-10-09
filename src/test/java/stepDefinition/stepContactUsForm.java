package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUs;

public class stepContactUsForm {
    ContactUs contact=new ContactUs();

    @And("typeName{string}")
    public void typename(String arg0) {
        contact.sendName(arg0);
    }

    @And("typeSubject {string}")
    public void typesubject(String arg0) {
        contact.sendSubject(arg0);
    }

    @And("typeEmail{string}")
    public void typeemail(String arg0) {
        contact.sendEmail(arg0);
    }

    @And("typeMessage{string}")
    public void typemessage(String arg0) {
        contact.sendSMessage(arg0);
    }

    @Given("Navigate ContactUs")
    public void navigateContactUs() {
        contact.navigateContact();
    }

    @When("clickSubmit")
    public void clicksubmit() {
        contact.clickSenmessage();
    }

    @Then("assertion")
    public void assertion() {
        contact.assertContactSended();
    }
}
