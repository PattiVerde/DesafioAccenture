package pageObjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;


public class CadastroVehiclePage extends BasePage {

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


	public void selecioneNumberSeatsDois() {
		selecionarComboBoxIndice(By.id("numberofseatsmotorcycle"), 3 );	
	}

	public void selecioneFuelTyoe() {
		selecionarComboBoxIndice(By.id("fuel"), 4 );
	}

	public void digitePayload() {
		escrever(By.id("payload"), "4");	
	}
	
	public void digiteTotal() {
		escrever(By.id("totalweight"), "5678");		
	}

	public void digiteListPrice() {
		escrever(By.id("listprice"), "543");	
	}

	public void digiteLicense() {
		escrever(By.id("licenseplatenumber"), "731");	
	}

	public void digiteAnnualMileage() {
		escrever(By.id("annualmileage"), "488");		
	}

	public void cliqueNext()  {	
		clicar (By.id("nextenterinsurantdata"));	
	}
//Parte 2 --> Insurant Data
	public void cliqueInsurantData() {
		clicar (By.id("enterinsurantdata"));	
		
	}
	public void digiteFirstName() {
		escrever(By.id("firstname"), "Bia");
		
	}
	public void digiteLastName() {
		escrever(By.id("lastname"), "Silva");	
	}

	public void digiteDateOfBirt() {
		escrever(By.id("birthdate"), "05/05/1980");	
	}


	public void selecionarGende() {
		clicar(By.xpath("(//span[contains(@class,'ideal-radio')])[3]"));
	}

	public void digiteStreetAddress() {
		escrever(By.id("streetaddress"), "Av. Princesa Isabel 254");
		
	}

	public void selecionarCountry() {
		selecionarComboBoxIndice(By.id("country"), 29 );	
		
	}

	public void digiteZipCode() {
		escrever(By.id("zipcode"), "22011010");
		
	}

	public void digiteCite() {
		escrever(By.id("city"), "Rio de Janeiro");
		
	}

	public void selecionarOccupation() {
		selecionarComboBoxIndice(By.id("occupation"), 1 );
		
	}

	public void escolhaHobbies() {
		clicar(By.xpath("(//span[@class='ideal-check'])[4]"));
		
	}

	public void digiteWebSite() {
		escrever(By.id("website"), "google.com.br");	
	}

	public void adicionePicture() throws InterruptedException {
		escrever(By.xpath("//input[@id='picture']"), "http://cbissn.ibict.br/images/phocagallery/galeria2/thumbs/phoca_thumb_l_image03_grd.png");
		Thread.sleep(30);
	}

	

	public void cliqueProductData() {
		clicar (By.id("enterproductdata"));	
	}

	public void informeStartDate() {
		escrever(By.id("startdate"), "04/15/2023");
		
	}

	public void selecioneInsuranceSum() {
		selecionarComboBoxIndice(By.id("insurancesum"), 1 );
		
	}

	public void selecioneMeritRating() {
		selecionarComboBoxIndice(By.id("meritrating"), 12 );
		
	}

	public void selecioneDamageInsurance() {
		selecionarComboBoxIndice(By.id("damageinsurance"), 2 );
		
	}

	public void escolhaOptionalProducts() {
		clicar(By.xpath("(//span[@class='ideal-check'])[6]"));
		
	}

	public void selecioneCourtesyCar() {
		selecionarComboBoxIndice(By.id("courtesycar"), 2 );
		
	}

	public void clicarNextI() {
		clicar (By.id("nextenterproductdata"));
		
	}

	public void clicarNextP() {
		clicar (By.id("nextselectpriceoption"));
		
	}

	public void clicarSelectPriceOption() {
		clicar (By.id("selectpriceoption"));		
	}

	public void escolhaSelectOption() {		
		clicar (By.xpath("//label//input[@id='selectplatinum']"));
		
	}

	public void clicarNextPO() throws Exception {
		
		clicar (By.id("nextselectpriceoption"));
		
	}

	public void clicarSendQuote() {
		clicar (By.id("sendquote"));	
		
	}

	public void digiteEmail() {
		escrever(By.id("email"), "teste@gmail.com");
	}

	public void digitePhone() {
		escrever(By.id("phone"), "257777778");
		
	}

	public void digiteUserName() {
		escrever(By.id("username"), "Teste");
		
	}

	public void digitePassword() {
		escrever(By.id("password"), "Saifora@1");
		
	}

	public void digiteConfirmPassword() {
		escrever(By.id("confirmpassword"), "Saifora@1");
		
	}

	public void digiteComments() {
		escrever(By.id("Comments"), "fakljlkjflksçfjlks lkjdfsalkjsf");
		
		
	}

	public void clicarSend() {
		clicar (By.id("sendemail"));
		
	}
	

	

	
}

	
	


