package StepDefination;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageTest extends BaseClass {

@BeforeTest
@Given("user is on Home Page")
public void user_is_on_home_page() {
   super.initialization("chrome");
}
@Test
@Then("User validate the Home page Title")
public void user_validate_the_home_page_title() {
	 Assert.assertTrue(driver.getTitle().contains("XYZ Bank"));
}
@Test
@Then("User Validate the Home Page URL")
public void user_validate_the_home_page_url() {
	 Assert.assertTrue(driver.getCurrentUrl().contains("https://www.globalsqa.com"));
}



}
