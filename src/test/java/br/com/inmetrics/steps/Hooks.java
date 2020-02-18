package br.com.inmetrics.steps;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import br.com.inmetrics.util.DriverFactory;
import gherkin.ast.Scenario;
import io.cucumber.java.Before;



public class Hooks {

		@Before
		public void beforeScenario(Scenario scenario) {
			System.out.println(scenario.getStatus() + " - iniciando a execusão do teste:" + scenario.getName());
			
		
		}
		@Rule
		public TestName testName = new TestName();

		@After
		public void afterScenario(Scenario scenario)throws IOException {
			
			//Prints dos testes
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getChromeDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		File.copyFile(arquivo, new File("target" + File.separator +" screenshot/" + testName.getMethodName() + ".jpg"));
		
			
			
			System.out.println("Finalizando a execussao do teste:" + scenario.getName());
			DriverFactory.getChromeDriver();
		
		}


}
