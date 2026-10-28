package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.CelioHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CelioHomePageStepDef {

	
	@Given("utilisateur est sur la page d'acceuil")
	public void utilisateur_est_sur_la_page_d_acceuil() throws Exception {
	   Config.driver = new ChromeDriver();
	   Config.MaximizeWindow();
	   Config.driver.get(Utils.getProperty("homePage"));
	   
	}
	@When("utilisateur survole sur le menu {string} et click sur le sous-menu {string}")
	public void utilisateur_survole_sur_le_menu_et_click_sur_le_sous_menu(String menuTitle, String subMenuTitle) {
	  CelioHomePage page = new CelioHomePage();
	  page.mouseHoverAndClick(menuTitle, subMenuTitle);
	}
	@Then("utilisateur est sur la page {string}")
	public void utilisateur_est_sur_la_page(String subMenuTitle) {
		  CelioHomePage page = new CelioHomePage();
		  page.verif(subMenuTitle);
		  Config.driver.quit();
	}

}
