package UtilsLayer;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass {
	public static void clickOnOK() {
		driver.switchTo().alert().accept();
	}
	public static void clickOnCancle() {
		driver.switchTo().alert().dismiss();
	}
	public static void enterText(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public static String captureText() {
		return driver.switchTo().alert().getText();
	}

}
