package StepDefination;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageLayer.BankManagerPage;
import UtilsLayer.HandleAlert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankManagerPageTest {
	static BankManagerPage manager;
	@Test(priority=1)
@When("user click on managerPage link")
public void user_click_on_manager_page_link() {
    manager=new BankManagerPage();
   manager.clickOnManagerPage();
}
	@Test(priority=2)
@Then("user validate the user is on manager page")
public void user_validate_the_user_is_on_manager_page() {
   Assert.assertEquals(manager.validateManagerPage(), "Add Customer");
}
	@Test(priority=3)
@When("user click Add customer link")
public void user_click_add_customer_link() {
   manager.clickaddcustomer();
}

	@Test(priority=4)
@When("user enters the first name as {string} and last name as {string}")
public void user_enters_the_first_name_as_and_last_name_as(String fname, String lname) {
    manager.enterfirstname("Anil");
    manager.enterlastname("Kapoor");
}
	@Test(priority=5)
@When("user enters the postal code as {string}")
public void user_enters_the_postal_code_as(String code) {
   manager.enterPostCode("654123");
}
	@Test(priority=6)
@When("user Click on Submit button")
public void user_click_on_submit_button() {
    manager.submitDetails();
}
	@Test(priority=7)
@Then("new customer popup generated")
public void new_customer_popup_generated() {
   System.out.println(HandleAlert.captureText());
   HandleAlert.clickOnOK();
}

	@Test(priority=8)
@When("user click on open Account")
public void user_click_on_open_account() {
   manager.clickOpenAcc();
}
	@Test(priority=9)
@Then("user select the customer name")
public void user_select_the_customer_name() {
   manager.selectCustomer("Anil Kapoor");
}
	@Test(priority=10)
@Then("select a currency as {string}")
public void select_a_currency_as(String currency) {
   manager.selectCurrency("Rupee");
}
	@Test(priority=11)
@Then("user click on process button")
public void user_click_on_process_button() {
    manager.ClickOnProcess();
}
	@Test(priority=12)
@Then("success pop generated")
public void success_pop_generated() {
	 System.out.println(HandleAlert.captureText());
	   HandleAlert.clickOnOK();
}






}
