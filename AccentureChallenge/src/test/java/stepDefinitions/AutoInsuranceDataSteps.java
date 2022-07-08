package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Base_PO;

public class AutoInsuranceDataSteps extends Base_PO {


    @Given("that Im in the Insurance Data tab")
    public void that_im_in_the_insurance_data_tab() {
    }

    @And("I type a First Name")
    public void i_type_a_first_name() {
        write("firstname", "Felipe");
    }

    @And("I type a Last Name")
    public void i_type_a_last_name() {
         write("lastname", "Silva");
    }

    @And("I select a Date of Birth")
    public void i_select_a_date_of_birth() {
          write("birthdate", "05/04/1995");
    }

    @And("I select a Gender")
    public void i_select_a_gender() {
         clickXpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
    }

    @And("I type an Address")
    public void i_type_an_address() {
         write("streetaddress", "SQN 312, Bloco C, apt 508");
    }

    @And("I select a Country")
    public void i_select_a_country() {
        selectCombo("country", "Brazil");
    }

    @And("I type a Zip Code")
    public void i_type_a_zip_code() {
         write("zipcode", "70654123");
    }

    @And("I type a City")
    public void i_type_a_city() {
         write("city", "Brasília");
    }

    @And("I select an Occupation")
    public void i_select_an_occupation() {
         selectCombo("occupation", "Employee");
    }

    @And("I select a Hobbie")
    public void i_select_a_hobbie() {
         clickXpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
    }

    @And("I type a Website")
    public void i_type_a_website() {
         write("website", "www.google.com");
    }

    @Given("I click Next")
    public void i_click_next() {
         clickId("nextenterproductdata");
    }

    @Then("the Insurance Data Tab is complete")
    public void the_insurance_data_tab_is_complete() {
    }

}



