package cenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;

public class Home {
	
	WebDriver driver = new ChromeDriver();
	HomePage homepage;

	@Before
	public void abrirJanela() {
		driver.manage().window().maximize();
		homepage = new HomePage(driver);
		homepage.abrirURL("https://auditeste.com.br/");
		
	}
		
	@Test
	public void abrirPage() throws InterruptedException {
		Thread.sleep(5000);
		homepage.clicaLogin();
	}

	@After
	public void fecharPagina() {
		driver.quit();
	}
		
}