package stepDefinitions;

import org.openqa.selenium.By;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.AcessarSite;
import pageObjects.CadastroUsuarioPage;
import pageObjects.CadastroVericlePage;

public class VericleDataSteps extends BasePage{
	
	AcessarSite acessoURL = new AcessarSite(); // Instanciando a classe genérica para acesso a url 
	CadastroVericlePage cadastroVericle = new CadastroVericlePage();
	
	@Dado("que acesse o site tricentis")
	public void queAcesseOSiteTricentis() {
			acessoURL.acessarAutomationPractice();
	}

	@Dado("clique em vericle data")
	public void cliqueEmVericleData() {
	    cadastroVericle.acessarDados();
	}
	
	@Dado("selecione Make")
	public void selecioneMake() {
	 cadastroVericle.selecionarMake();
	}
	
	@Dado("selecione Model")
	public void selecioneModel() {
	   cadastroVericle.selecionarModel();
	}

	@Dado("digite Cylinder Capacity")
	public void digiteCylinderCapacity() {
	  cadastroVericle.digitarCylinderCapacity();
	}

	@Dado("digite Engine Performance")
	public void digiteEnginePerformance() {
	   cadastroVericle.digiteEnginePerformance();
	}

	@Dado("informe Date of Manufacture")
	public void informeDateOfManufacture() {
	    cadastroVericle.informeDate();
	}

	@Dado("selecione Number of Seats")
	public void selecioneNumberOfSeats() {
	   cadastroVericle.selecioneNumberSeats();
	}

	@Dado("escolha Right Hand Drive")
	public void escolhaRightHandDrive() {
	   cadastroVericle.escolhaRightHandDrive();
	}





}
