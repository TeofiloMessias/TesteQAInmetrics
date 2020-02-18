package br.com.inmetrics.pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.inmetrics.util.DriverFactory;

public class BasePage extends DriverFactory {

	public static WebDriver getDriver() {
		return DriverFactory.getChromeDriver();
	}
	
	/**Metodo para esperar um elemento.
	 * @param by
	 * @return
	 */
	public WebElement getElementAndWait(By by) {
		return DriverFactory.getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
}
