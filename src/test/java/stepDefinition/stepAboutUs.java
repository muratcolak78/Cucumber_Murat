package stepDefinition;

import common.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AboutUs;

public class stepAboutUs {
    AboutUs about = new AboutUs();

    @Given(": Navigate AboutUs")
    public void navigate_about_us() {
        about.navigate();
    }

    @Given("click OurMission")
    public void click_our_mission() {
        about.clickMission();
    }

    @Given("assert Mission")
    public void assert_mission() {
        about.assertMission();
    }

    @Given("close OurVision")
    public void close_our_vision() {
        about.clickVision();
    }

    @Given("assert Vision")
    public void assert_vision() {
        about.assertVision();
    }

    @When("click getQuote2")
    public void click_get_quote2() {
        about.clickGetQuete();
    }


    @Then("assert ispageContactUs")
    public void assertIspageContactUs() {
        about.assertisPageContacUs();
    }
}
