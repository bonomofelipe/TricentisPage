package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;

public class AutoSendQuoteSteps extends Base_PO {
    private WebDriver driver = getDriver();

    @Given("that Im in the Send Quote tab")
    public void that_im_in_the_send_quote_tab() {
    }

    @And("I type an E-mail")
    public void i_type_an_e_mail() {
        write("email", "felipebonomo@live.com");
    }

    @And("I type a Phone")
    public void i_type_a_phone() {
        write("phone", "5561981656023");
    }

    @And("I type an User Name")
    public void i_type_an_user_name() {
        write("username", "FelipeBonomo");
    }

    @And("I type a Password")
    public void i_type_a_password() {
        write("password", "Test1995");
    }

    @And("I confirm the Password")
    public void i_confirm_the_password() {
        write("confirmpassword", "Test1995");
    }

    @And("I type my Comments")
    public void i_type_my_comments() {
        write("Comments", "Testing the commenting section");
    }

    @And("I click on Send")
    public void i_click_on_send() {
        clickId("sendemail");
    }

    @Then("I check the confirmation message")
    public void i_check_the_confirmation_message() throws InterruptedException {
        waitPresent("/html/body/div[4]/h2", 13);
        compare("/html/body/div[4]/h2", "Sending e-mail success!");
        wait(3000);
        quitDriver();

    }

}
