package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.AjouterPanierPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjouterPanierPageStepDef {

	@Given("utilisateur est sur la page du produit")
	public void utilisateur_est_sur_la_page_du_produit() throws Exception {
	  Config.driver = new ChromeDriver();
	  Config.MaximizeWindow();
	  Config.driver.get(Utils.getProperty("productPage"));
	}
	@When("utilisateur click sur Ajouter au panier")
	public void utilisateur_click_sur_ajouter_au_panier() throws Exception {
	    AjouterPanierPage page = new AjouterPanierPage();
	    page.ajouterPanier();
	}
	@Then("le produit {string} est ajouté au panier")
	public void le_produit_est_ajouté_au_panier(String productName) {
		AjouterPanierPage page = new AjouterPanierPage();
		page.verifPanier(productName);
		Config.driver.quit();
	}



}
