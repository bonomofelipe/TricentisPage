package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;

public class AutoVehicleDataSteps extends Base_PO{

    @Given("that I access the webdriver form")
    public void that_i_access_the_webdriver_form() {
        navigateTo_URL("http://sampleapp.tricentis.com/101/app.php");
    }

    @And("I select Automotive")
    public void i_select_automotive() {
        clickId("nav_automobile");
    }

    @Then("the Automotive screen is displayed")
    public void the_automotive_screen_is_displayed() {
    }

    @When("the page loads")
    public void the_page_loads() {
    }

    @Then("the form page is shown")
    public void the_form_page_is_shown() {
    }

    @And("that I select a Make")
    public void that_i_select_a_make() {
        selectCombo("make", "Audi");
    }

    @And("I select a Engine Performance")
    public void i_select_a_engine_performance() {
        write("engineperformance", "213");
    }

    @And("I select a Date of Manufacture")
    public void i_select_a_date_of_manufacture() {
        write("dateofmanufacture", "05/15/2018");
    }

    @And("I select the Number of Seats")
    public void i_select_the_number_of_seats() {
        selectCombo("numberofseats", "4");
    }

    @And("I select the Fuel Type")
    public void i_select_the_fuel_type() {
        selectCombo("fuel", "Diesel");
    }

    @And("I type a List Price [$]")
    public void i_type_a_list_price_$() {
        write("listprice", "27990");
    }

    @And("I type a License Plate Number")
    public void i_type_a_license_plate_number() {
        write("licenseplatenumber", "5A02395");
    }

    @And("I type a Annual Mileage [mi]")
    public void i_type_a_annual_mileage_mi() {
        write("annualmileage", "10000");
    }

    @And("I click on Next")
    public void i_click_on_next() {
        clickId("nextenterinsurantdata");
    }

    @Then("the VehicleData Tab is complete")
    public void the_vehicle_data_tab_is_complete() {
    }

}
