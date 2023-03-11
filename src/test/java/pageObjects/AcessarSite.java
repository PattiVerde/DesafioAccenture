package pageObjects;

import core.BasePage;
import core.DriverFactory;

public class AcessarSite extends BasePage {

	private static String SITE = "http://sampleapp.tricentis.com/101/app.php";
	

	public void acessarAutomationPractice() {
		DriverFactory.getDriver().get(SITE);
	}
	

}
