package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.HandleAlert;
import UtilsLayer.HandleDropDown;
import UtilsLayer.UtilsClass;

public class BankManagerPage extends BaseClass {
	@FindBy(xpath="//button[contains(text(),'Bank')]")
	private WebElement manager;
	@FindBy(xpath="//button[@ng-class='btnClass1']")
	private WebElement addcust;
	@FindBy(xpath="//input[@ng-model='fName']")
	private WebElement fname ;
	@FindBy(xpath="//input[@ng-model='lName']")
	private WebElement lname ;
	@FindBy(xpath="//input[@ng-model='postCd']")
	private WebElement postcode ;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit ;
	@FindBy(xpath="//button[@ng-class='btnClass2']")
	private WebElement openAccount ;
	@FindBy(name="userSelect")
	private WebElement selectcust ;
	@FindBy(name="currency")
	private WebElement currency ;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement process ;
	
	
	
	
	
	public BankManagerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnManagerPage() {
		manager.click();
	}
	public String validateManagerPage() {
		return addcust.getText();
	}
	
	public void clickaddcustomer() {
		UtilsClass.clickButton(addcust);
	}
	public void enterfirstname(String fstname) {
		UtilsClass.enterValue(fname, fstname);
	}
	public void enterlastname(String lstname) {
		UtilsClass.enterValue(lname, lstname);
	}
	public void enterPostCode(String code) {
		UtilsClass.enterValue(postcode, code);
	}
	public void submitDetails() {
		UtilsClass.clickButton(submit);
	//	HandleAlert.clickOnOK();
	}
	
	public void clickOpenAcc() {
		UtilsClass.clickButton(openAccount);
	}
	public void selectCustomer(String name) {
		HandleDropDown.SelectDDOption(selectcust, name);
	}
	public void selectCurrency(String curr) {
		HandleDropDown.SelectDDOption(currency, curr);
	}
	
	public void ClickOnProcess() {
		UtilsClass.clickButton(process);
	}
	

}
