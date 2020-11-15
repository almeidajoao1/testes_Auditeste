package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage extends BasePage {
	
	final String QUEM_SOMOS = "//header/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]";
	final String SERVICOS = "//header/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]";
	final String TESTES = "//header/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]";
	final String CASOS = "//header/div[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/a[1]";
	final String TRABALHE = "//*[@id=\"menu-item-135\"]/a";
	final String BLOG = "//header/div[1]/div[1]/div[2]/div[2]/ul[1]/li[6]/a[1]";
	final String CONTATO = "//header/div[1]/div[1]/div[2]/div[2]/ul[1]/li[7]/a[1]";


	public MenuPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Este método clica nos menus
	 * @throws InterruptedException 
	 */
	
	public void clickMenus() throws InterruptedException {
		driver.findElement(By.xpath(QUEM_SOMOS)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(SERVICOS)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(TESTES)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(CASOS)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(TRABALHE)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(BLOG)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(CONTATO)).click();
	}
}