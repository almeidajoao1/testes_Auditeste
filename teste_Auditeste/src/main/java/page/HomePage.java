package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
	final String CLICK = "//body/div[@id='sgpb-popup-dialog-main-div-wrapper']/div[1]/img[1]";
	

	public HomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Este método clica no poup-up
	 */
	public void clicaLogin() {
		driver.findElement(By.xpath(CLICK)).click();
	}
}