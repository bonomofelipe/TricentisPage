package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;

public class AutoProductDataSteps extends Base_PO {

    private WebDriver driver = getDriver();

    @Given("that Im in the Product Data tab")
    public void that_im_in_the_product_data_tab() {
    }

    @And("I select a Start Date")
    public void i_select_a_start_date() {
         writexPath("//*[@id=\"startdate\"]", "08/11/2022");
    }

    @And("I select a Insurance Sum [$]")
    public void i_select_a_insurance_sum_$() {
         write("insurancesum", "10000000");
    }

    @And("I select a Merit Rating")
    public void i_select_a_merit_rating() {
         write("meritrating", "Malus 10");
    }

    @And("I select a Damage Insurance")
    public void i_select_a_damage_insurance() {
         write("damageinsurance", "Full Coverage");
    }

    @And("I select an Optional Product")
    public void i_select_an_optional_product() {
         clickXpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]");
    }

    @And("I select if I want a Courtesy Car")
    public void i_select_if_i_want_a_courtesy_car() {
         write("courtesycar", "Yes");
    }

    @And("I click on the Next Button")
    public void i_click_on_the_next_button() {
        clickId("nextselectpriceoption");
    }

    @Then("I the Product Data Tab is complete")
    public void i_the_product_data_tab_is_complete() {
    }

}
