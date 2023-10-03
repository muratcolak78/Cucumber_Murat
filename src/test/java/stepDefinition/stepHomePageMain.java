package stepDefinition;

import common.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class stepHomePageMain {
    HomePage home=new HomePage();
    @When("click readMoreFirst")
    public void clickReadMoreFirst() {
        home.clickReadMoreFirst();
    }

    @Then("assert readMoreFirst")
    public void assertReadMoreFirst() {
        home.assertReadMoreFirst();
    }

    @When("click readMoreSecond")
    public void clickReadMoreSecond() {
        home.clickReadMoreSecond();
    }

    @Then("assert readMoreSecond")
    public void assertReadMoreSecond() {
        home.assertReadMoreSecond();
    }

    @When("click readMoreThird")
    public void clickReadMoreThird() {
        home.clickReadMoreThird();
    }

    @Then("assert readMoreThird")
    public void assertReadMoreThird() {
        home.assertReadMoreThird();
    }

    @When("click contactUsButton")
    public void clickContactUsButton() {
        home.clickContactUsButton();
    }

    @Then("assert contactUsButton")
    public void assertContactUsButton() {
        home.assertContactUsButton();
    }

    @When("click readMorefourth")
    public void clickReadMorefourth() {
        home.clickReadMorefourth();
    }

    @Then("assert readMorefourth")
    public void assertReadMorefourth() {
        home.assertReadMorefourth();
    }

    @When("click readMorefifth")
    public void clickReadMorefifth() {
        home.clickReadMorefifth();
    }

    @Then("assert readMorefifth")
    public void assertReadMorefifth() {
        home.assertReadMorefifth();
    }

    @When("click readMoreSixth")
    public void clickReadMoreSixth() {
        home.clickReadMoreSixth();
    }

    @Then("assert readMoreSixth")
    public void assertReadMoreSixth() {
      home.assertReadMoreSixth();
    }

    @When("click viewAllServices")
    public void clickViewAllServices() {
        home.clickViewAllServices();
    }

    @Then("assert viewAllServices")
    public void assertViewAllServices() {
        home.assertViewAllServices();
    }

    @When("click contactUsButtonSecond")
    public void clickContactUsButtonSecond() {
        home.clickContactUsButtonSecond();
    }

    @Then("assert contactUsButtonSecond")
    public void assertContactUsButtonSecond() {
        home.assertContactUsButtonSecond();
    }

    @When("click requestFreeQuote")
    public void clickRequestFreeQuote() {
        home.clickRequestFreeQuote();
    }

    @Then("assert requestFreeQuote")
    public void assertRequestFreeQuote() {
        home.assertRequestFreeQuote();
    }

    @Then("close Driver")
    public void closeDriver() {
        Driver.closeDriver();
    }

    @When("click HomePage")
    public void clickHomePage() {
        home.gotoHomePage();
    }
}
