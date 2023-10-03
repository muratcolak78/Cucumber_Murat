package stepDefinition;

import io.cucumber.java.en.And;
import pages.ContactUs;

public class contactUsForm2 {
    ContactUs contact=new ContactUs();

    @And("typeName{string}")
    public void typename(String arg0) {
    }

    @And("typeSubject {string}")
    public void typesubject(String arg0) {
    }

    @And("typeEmail{string}")
    public void typeemail(String arg0) {
    }

    @And("typeMessage{string}")
    public void typemessage(String arg0) {
    }
}
