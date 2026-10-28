package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.JeansPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JeansPageStepDef {

		
		@Given("utilisateur est sur la page Jeans")
		public void utilisateur_est_sur_la_page_jeans() throws Exception {
		   Config.driver = new ChromeDriver();
		   Config.MaximizeWindow();
		   Config.driver.get(Utils.getProperty("jeansPage"));
		}
		@When("utilisateur click sur le produit {string}")
		public void utilisateur_click_sur_le_produit(String productName) {
		  JeansPage page = new  JeansPage();
		  page.clickOnProduct(productName);
		}
		@Then("utilisateur derige vers la page du produit {string}")
		public void utilisateur_derige_vers_la_page_du_produit(String productName) {
			JeansPage page = new  JeansPage();
			page.verifier(productName);
			Config.driver.quit();
			
		}
}
