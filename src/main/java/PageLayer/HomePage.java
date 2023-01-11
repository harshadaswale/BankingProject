package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(xpath="//strong[text()='XYZ Bank']")
	private WebElement homeLogo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String captureHomePageTitle() {
		return driver.getTitle();
	}
	public String captureHomePageLogo() {
		return homeLogo.getText();
	}

}
