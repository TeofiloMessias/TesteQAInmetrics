import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TesteValidandoCampos {

	@Test
	public void preencherFormulario() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\drives\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.juliodelima.com.br/taskit");
		driver.manage().window().maximize();
		// acessar menu contatos
		driver.findElement(By.id("signup")).click();
		
		//preencher o formulario
		driver.findElement(By.name("name")).sendKeys("Teofilo");
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Teomefi5");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("teo123");
		driver.findElement(By.xpath("//a[@class='modal-action waves-effect waves-green btn-flat']")).click();
		
		String validarUsuario = driver.findElement(By.xpath("//a[@class='Hi, Teofilo']")).getText();

		Assert.assertEquals("Mensagem enviada com sucesso!", validarUsuario);

	}

}
