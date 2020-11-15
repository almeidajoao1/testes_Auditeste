package cenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;
import page.MenuPage;

public class Menu {

	WebDriver driver = new ChromeDriver();
	HomePage homepage;
	MenuPage menupage;

	@Before
	public void abrirJanela() {
		driver.manage().window().maximize();
		menupage = new MenuPage(driver);
		homepage = new HomePage(driver);
		menupage.abrirURL("https://auditeste.com.br/");

	}

	@Test
	public void abrirPage() throws InterruptedException {
		Thread.sleep(5000);
		homepage.clicaLogin();
		menupage.clickMenus();
	}

	@After
	public void fecharPagina() {
		driver.quit();
	}

}