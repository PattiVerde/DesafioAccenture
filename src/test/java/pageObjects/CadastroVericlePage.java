package pageObjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;


public class CadastroVericlePage extends BasePage {

	public void acessarDados() {
		// Criei um método clicar que está em BasePage, ele servirá para todas as funções de .click(); 
		// Dentro desse método também tem o parâmetro by do selenium, usado para id, xpath, name...
		// Ele vai aguardar também até que o elemento esteja disponível para clicar
		clicar(By.xpath("//*[@id=\"entervehicledata\"]"));	
	}

	public void selecionarMake() {	
		selecionarComboBoxIndice(By.id("make"), 2 );	
		
	}

	public void selecionarModel() {
		selecionarComboBoxIndice(By.id("model"), 2 );	
	}
	
	
	public void digitarCylinderCapacity() {
		escrever(By.id("cylindercapacity"), "233");
		
	}

	public void digiteEnginePerformance() {
		escrever(By.id("engineperformance"), "999");
		
	}

	public void informeDate() {
		escrever(By.id("dateofmanufacture"), "03/03/2023");
		
	}

	public void selecioneNumberSeats() {
		selecionarComboBoxIndice(By.id("numberofseats"), 2 );
		
	}

	public void escolhaRightHandDrive() {
		clicar(By.xpath("//label[text()='Yes']//span"));	
		
	}
	


	
	
	
	
	
}
