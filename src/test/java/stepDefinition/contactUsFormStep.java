package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ContactUs;


public class contactUsFormStep  {
    ContactUs contact = new ContactUs();

    @Given("goto contact")
    public void goto_contact() {
        contact.clickContactUs();
    }

    @Given("typeName")
    public void type_name(String name) {
        contact.sendName(name);
    }
    @Given("typeSubject")
    public void type_subject(String konu) {
        contact.sendSubject(konu);
    }
    @Given("typeEmail")
    public void type_email(String email) {
        contact.sendEmail(email);
    }

    @Given("typeMessage")
    public void type_message(String mesaj) {
        contact.sendSMessage(mesaj);
    }

    @When("clickSubmit")
    public void click_submit() {
        contact.submit();
    }

    @Then("assertion")
    public void assertion() {
       // Assert.assertTrue(contact.getLastMessage().getText().contains("Validation errors occurred. Please confirm the fields and submit it again."));

    }
}
