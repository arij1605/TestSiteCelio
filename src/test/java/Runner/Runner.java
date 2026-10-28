package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\Features\\TC3_AjouterPanier.feature",
				"src\\\\test\\\\resources\\\\Features\\TC1_CelioHomePage.feature",
				"src\\\\test\\\\resources\\\\Features\\TC2_JeansPage.feature"
				},
		glue = "StepDef",
		plugin= {"pretty","html:target/cucumber-report.html"}		
		)
public class Runner {


}
