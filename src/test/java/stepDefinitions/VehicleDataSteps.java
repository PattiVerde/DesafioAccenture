package stepDefinitions;



import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.AcessarSite;
import pageObjects.CadastroVehiclePage;

public class VehicleDataSteps extends BasePage{
	
	AcessarSite acessoURL = new AcessarSite(); // Instanciando a classe genérica para acesso a url 
	CadastroVehiclePage cadastroVehicle = new CadastroVehiclePage();
	
	@Dado("que acesse o site tricentis")
	public void queAcesseOSiteTricentis() {
			acessoURL.acessarAutomationPractice();
	}

	@Dado("clique em vehicle data")
	public void cliqueEmVehicleData() {
	    cadastroVehicle.acessarDados();
	}
	
	@Dado("selecione Make")
	public void selecioneMake() {
	 cadastroVehicle.selecionarMake();
	}
	
	@Dado("selecione Model")
	public void selecioneModel() {
	   cadastroVehicle.selecionarModel();
	}

	@Dado("digite Cylinder Capacity")
	public void digiteCylinderCapacity() {
	  cadastroVehicle.digitarCylinderCapacity();
	}

	@Dado("digite Engine Performance")
	public void digiteEnginePerformance() {
	   cadastroVehicle.digiteEnginePerformance();
	}

	@Dado("informe Date of Manufacture")
	public void informeDateOfManufacture() {
	    cadastroVehicle.informeDate();
	}

	@Dado("selecione Number of Seats")
	public void selecioneNumberOfSeats() {
	   cadastroVehicle.selecioneNumberSeats();
	}

	@Dado("escolha Right Hand Drive")
	public void escolhaRightHandDrive() {
	   cadastroVehicle.escolhaRightHandDrive();
	}


	@Dado("selecione Number of Seats Dois")
	public void selecioneNumberOfSeatsDois() {
    cadastroVehicle.selecioneNumberSeatsDois();
	}

	@Dado("selecione Fuel Type")
	public void selecioneFuelType() {
	   cadastroVehicle.selecioneFuelTyoe();
	}
	
	@Dado("digite Payload")
	public void digitePayload() {
	    cadastroVehicle.digitePayload();
	}

	@Dado("digite Total Weight")
	public void digiteTotalWeight() {
	  cadastroVehicle.digiteTotal();  
	}

	@Dado("digite List Price")
	public void digiteListPrice() {
	    cadastroVehicle.digiteListPrice();
	}

	@Dado("digite License Plate Number")
	public void digiteLicensePlateNumber() {
	   cadastroVehicle.digiteLicense();
	}

	@Dado("digite Annual Mileage")
	public void digiteAnnualMileage() {
	  cadastroVehicle.digiteAnnualMileage();
	}

	@Dado("clique Next")
	public void cliqueNext() {
		cadastroVehicle.cliqueNext();
	}

	
	//Parte 2 --> Insurant
	@Dado("clique em Insurant data")
	public void cliqueEmInsurantData() {
	    cadastroVehicle.cliqueInsurantData();
	}
	@Dado("digite First Name")
	public void digiteFirstName() {
	    cadastroVehicle.digiteFirstName();
	}
	
	@Dado("digite Last Name")
	public void digiteLastName() {
	   cadastroVehicle.digiteLastName();
	}

	@Dado("informe Date of Birth")
	public void informeDateOfBirth() {
	   cadastroVehicle.digiteDateOfBirt();
	}

	@Dado("selecione Gender")
	public void selecioneGender() {	 
		cadastroVehicle.selecionarGende();
	}
	
	@Dado("digite Street Address")
	public void digiteStreetAddress() {
	    cadastroVehicle.digiteStreetAddress();
	}

	@Dado("selecione Country")
	public void selecioneCountry() {
	   cadastroVehicle.selecionarCountry();
	}

	@Dado("digite Zip Code")
	public void digiteZipCode() {
	   cadastroVehicle.digiteZipCode();
	}

	@Dado("digite City")
	public void digiteCity() {
	    cadastroVehicle.digiteCite();
	}

	@Dado("selecione Occupation")
	public void selecioneOccupation() {
	    cadastroVehicle.selecionarOccupation();
	}

	@Dado("escolha Hobbies")
	public void escolhaHobbies() {
	    cadastroVehicle.escolhaHobbies();
	}

	@Dado("digite Website")
	public void digiteWebsite() {
	    cadastroVehicle.digiteWebSite();
	}

	@Dado("adicione Picture")
	public void adicionePicture() throws InterruptedException {
	    cadastroVehicle.adicionePicture();
	}
	

	@Dado("clique NextI")
	public void cliqueNextI() {
	    cadastroVehicle.clicarNextI();
	}

	//Parte 03 - informações do produto


	@Dado("clique em Product Data")
	public void cliqueEmProductData() {
    cadastroVehicle.cliqueProductData();
	}
	
	@Dado("informe Start Date")
	public void informeStartDate() {
	   cadastroVehicle.informeStartDate();
	}

	@Dado("selecione Insurance Sum")
	public void selecioneInsuranceSum() {
	 cadastroVehicle.selecioneInsuranceSum();
	}
	
	@Dado("selecione Merit Rating")
	public void selecioneMeritRating() {
	cadastroVehicle.selecioneMeritRating();
	}

	@Dado("selecione Damage Insurance")
	public void selecioneDamageInsurance() {
	    cadastroVehicle.selecioneDamageInsurance();
	}


	@Dado("escolha Optional Products")
	public void escolhaOptionalProducts() {
    cadastroVehicle.escolhaOptionalProducts();
}


	@Dado("selecione Courtesy Car")
	public void selecioneCourtesyCar() {
		cadastroVehicle.selecioneCourtesyCar();
	}
	
	@Dado("clique NextP")
	public void cliqueNextP() {
	   cadastroVehicle.clicarNextP();
	}
	
	//Parte 4 --> Opção de Preço
	@Dado("clique em Select Price Option")
	public void cliqueEmSelectPriceOption() {
	   cadastroVehicle.clicarSelectPriceOption();
	}

	@Dado("escolha Select Option")
	public void escolhaSelectOption() {		
	    cadastroVehicle.escolhaSelectOption();
	}
	
	@Dado("clique NextPO")
	public void cliqueNextPO()  {
		 try {
			cadastroVehicle.clicarNextPO();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Parte 5 --> Enviar Cotação
	
	@Dado("clique em Send Quote")
	public void cliqueEmSendQuote() {
	    cadastroVehicle.clicarSendQuote();
	}
	
	@Dado("digite EMail")
	public void digiteEMail() {
	   cadastroVehicle.digiteEmail();
	}

	@Dado("digite Phone")
	public void digitePhone() {
	    cadastroVehicle.digitePhone();
	}

	@Dado("digite Username")
	public void digiteUsername() {
	    cadastroVehicle.digiteUserName();
	}

	@Dado("digite Password")
	public void digitePassword() {
	    cadastroVehicle.digitePassword();
	}

	@Dado("digite Confirm Password")
	public void digiteConfirmPassword() {
	   cadastroVehicle.digiteConfirmPassword();
	}

	@Dado("digite Comments")
	public void digiteComments() {
	  cadastroVehicle.digiteComments();
	}

	@Quando("clicar em Send")
	public void clicarEmSend() {
		cadastroVehicle.clicarSend();
	}

	@Então("irá aparecer mensagem de sucesso de Sending e-mail success!")
	public void iráAparecerMensagemDeSucessoDeSendingEMailSuccess() {
		cadastroVehicle.validarMensagemSucesso();
		fecharBrowser();
	}

}
