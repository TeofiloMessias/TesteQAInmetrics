package br.com.inmetrics.pageobjects;

import org.openqa.selenium.By;

import junit.framework.Assert;
//Ultima versão 17/02/2020 as 19:32

public class LoginPage extends BasePage{
		private By task			 = By.id("signup");
		private By inputUsername = By.id("name");
		private By inputLogin 	 = By.id("login ");
		private By inputPassword = By.id("password ");
		private By saveUsuario   = By.xpath("//a[@class='modal-action waves-effect waves-green btn-flat']");
		

		public void toLogin() {
			getDriver().navigate().to("http://www.juliodelima.com.br/taskit/");
		}
		
		public void toRealizaLogin(String usuario, String senha, String confirmasenha, String validarUsuario  ) {
			getDriver().findElement(task).click();
			getDriver().findElement(inputUsername).sendKeys(usuario);
			getDriver().findElement(inputLogin).sendKeys(senha);
			getDriver().findElement(inputPassword).sendKeys(confirmasenha);		
			getDriver().findElement(saveUsuario).click();
		}
		public void toValidarUsuario() {
			
			
			String validarUsuario = getDriver().findElement(By.xpath("//a[@class='Hi, Teofilo']")).getText();

			Assert.assertEquals("Mensagem enviada com sucesso!", validarUsuario);
		}
}
