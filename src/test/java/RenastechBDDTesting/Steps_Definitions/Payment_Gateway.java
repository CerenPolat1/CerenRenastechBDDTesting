package RenastechBDDTesting.Steps_Definitions;

import RenastechBDDTesting.Page.Home_Page;
import RenastechBDDTesting.Page.PaymentDone_Page;
import RenastechBDDTesting.Page.Payment_Page;
import RenastechBDDTesting.Utils.CommonUtils;
import RenastechBDDTesting.Utils.ConfigurationReaders;
import RenastechBDDTesting.Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.Map;


public class Payment_Gateway {

Home_Page home=new Home_Page();
Payment_Page payment=new Payment_Page();
PaymentDone_Page paymentdone=new PaymentDone_Page();
    @Given("The user wants to go to url.")
    public void the_user_wants_to_go_to_url() {

        Driver.getDriver().get(ConfigurationReaders.getProperty("url"));
        CommonUtils.waitForPageToLoad(2000);
    }

    @When("The user wants to see {string}")
    public void the_user_wants_to_see(String sentencee) {

       // Assert.assertEquals(sentencee,home.sentence.getText());
        Assert.assertTrue(home.sentence.getText().contains(sentencee));
        System.out.println("passed");
    }


    @Given("The user wants to see price as {string}")
    public void the_user_wants_to_see_price_as(String pricee) {

         //Assert.assertTrue(false); //retest icin
        Assert.assertEquals(home.getPrice().getText(),pricee);

        System.out.println("price is 20$");
    }



    @Given("The user wants to see that thee url contains {string}")
    public void the_user_wants_to_see_that_thee_url_contains(String part) {

      Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(part));
        System.out.println("url contains payment gateaway");
    }



    @Given("The user want to see quantity is {string}")
    public void the_user_want_to_see_quantity_is(String q) {
      payment.setQuantityButton(q);

    }

    @When("The user wants to click buy now button")
    public void the_user_wants_to_click_buy_now_button() {

        payment.clickbutton.click();

    }

    @Then("The user wants to fill out some information")
    public void the_user_wants_to_fill_out_some_information(Map<String,String> dataTable) {

        paymentdone.cardNumber.sendKeys(dataTable.get("Card Number"));
        paymentdone.expiryMonth.sendKeys(dataTable.get("Expriation Month"));
        paymentdone.expiryYear.sendKeys(dataTable.get("Expiration Year"));
        paymentdone.cvvCode.sendKeys(dataTable.get("CVV Code"));
    }
    @Then("The user wants to click pay button")
    public void the_user_wants_to_click_pay_button() {

        paymentdone.paybutton.click();
    }
    @Then("The user wants to see the sentence {string}")
    public void the_user_wants_to_see_the_sentence(String ps) {
        Assert.assertTrue(paymentdone.sentence.getText().contains(ps));
       System.out.println("payment registered successfully");
    }


    @Given("The user wants to select {string}")
    public void the_user_wants_to_select(String quantity) {
        payment.setQuantityButton(quantity);
        CommonUtils.waitForPageToLoad(2000);

    }
    @Then("The user wants to click pay buttonn")
    public void the_user_wants_to_click_pay_buttonn() {
        CommonUtils.waitForPageToLoad(2000);
      payment.clickbutton.click();
    }

    @When("The user wants to enter payment information:")
    public void the_user_wants_to_enter_payment_information(Map<String,String> dataTable) {
        CommonUtils.waitForPageToLoad(2000);
        paymentdone.cardNumber.sendKeys(dataTable.get("Card Number"));
        paymentdone.expiryMonth.sendKeys(dataTable.get("Expriation Month"));
        paymentdone.expiryYear.sendKeys(dataTable.get("Expiration Year"));
        paymentdone.cvvCode.sendKeys(dataTable.get("CVV Code"));
    }
    @Then("The user wants to verify {string}")
    public void the_user_wants_to_verify(String verify) {
        Assert.assertTrue(paymentdone.sentence.getText().contains(verify));
        System.out.println("payment registered successfully");
    }



    @Given("The user wants to see some {string}")
    public void the_user_wants_to_see_some(String qty) {
        payment.setQuantityButton(qty);
        CommonUtils.waitForPageToLoad(2000);

    }

    @When("The user wants to click buy button")
    public void the_user_wants_to_click_buy_button() {
        payment.clickbutton.click();
    }

    @Then("The user wants to enter card info")
    public void the_user_wants_to_enter_card_info() {
        CommonUtils.waitForPageToLoad(2000);
        paymentdone.cardNumber.sendKeys("1234567890123456");
        paymentdone.expiryMonth.sendKeys("12");
        paymentdone.expiryYear.sendKeys("2028");
        paymentdone.cvvCode.sendKeys("123");
    }

    @Then("The user wants to click last button")
    public void the_user_wants_to_click_last_button() {

        paymentdone.paybutton.click();

    }

    @Then("The user wants {string}")
    public void the_user_wants(String sc) {
        Assert.assertTrue(paymentdone.sentence.getText().contains(sc));
        System.out.println("payment registered successfully");
    }










}








