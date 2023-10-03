package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class stepHomePageFooter {
    HomePage home = new HomePage();

    @When("click Thuis")
    public void clickThuis() {
        home.clickThuis();
    }

    @Then("assert Thuis")
    public void assertThuis() {
        home.assertThuis();
    }

    @When("click wagenPark")
    public void clickWagenPark() {
        home.clickWagenPark();
    }

    @Then("assert wagenPark")
    public void assertWagenPark() {
        home.assertWagenPark();
    }

    @When("click diensten")
    public void clickDiensten() {
        home.clickDiensten();
    }

    @Then("assert diensten")
    public void assertDiensten() {
        home.assertDiensten();
    }

    @When("click overOns")
    public void clickOverOns() {
        home.clickOverOns();
    }

    @Then("assert overOns")
    public void assertOverOns() {
        home.assertOverOns();
    }

    @When("click neemContactOp")
    public void clickNeemContactOp() {
        home.clickNeemContactOp();
    }

    @Then("assert neemContactOp")
    public void assertNeemContactOp() {
        home.assertNeemContactOp();
    }

    @When("click opstag")
    public void clickOpstag() {
        home.clickOpstag();
    }

    @Then("assert opstag")
    public void assertOpstag() {
        home.assertOpstag();
    }

    @When("click logistiek")
    public void clickLogistiek() {
        home.clickLogistiek();
    }

    @Then("assert logistiek")
    public void assertLogistiek() {
        home.assertLogistiek();
    }

    @When("click vervoer")
    public void clickVervoer() {
        home.clickVervoer();
    }

    @Then("assert vervoer")
    public void assertVervoer() {
        home.assertVervoer();
    }

    @When("click number")
    public void clickNumber() {
        home.clickNumber();
    }

    @Then("assert number")
    public void assertNumber() {
        home.assertNumber();
    }

    @When("click BTW")
    public void clickBTW() {
        home.clickBTW();
    }

    @Then("assert BTW")
    public void assertBTW() {
        home.assertBTW();
    }

    @When("click language")
    public void clickLanguage() {
        home.clickLanguage();
    }

    @Then("assert language")
    public void assertLanguage() {
        home.assertLanguage();
    }


}
