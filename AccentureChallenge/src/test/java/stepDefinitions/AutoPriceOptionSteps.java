package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Base_PO;

public class AutoPriceOptionSteps extends Base_PO {


	@Given("that Im in the Price Option tab")
	public void that_im_in_the_price_option_tab() {
	}

	@Then("I select a Price Option")
	public void i_select_a_price_option() {
		clickXpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	}

	@And("click on Next")
	public void click_on_next() throws InterruptedException {
		wait(3000);
		clickXpath("//*[@id=\"nextsendquote\"]");
	}

}
