package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		strict = true
		,monochrome = true
		,stepNotifications = true
		,features = "src/test/resources/features/login/CadastroUsuario.feature"
		,glue = "stepDefinitions"
		,plugin = {"pretty","html:target/report-html/login/CadastroUsuario", "json:target/cucumber-reports/login/CadastroUsuario/CadastroUsuario.json"}
		,snippets = SnippetType.CAMELCASE
)

public class CadastroUsuarioRunner {

}
