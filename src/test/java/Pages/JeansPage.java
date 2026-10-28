package Pages;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class JeansPage {

	@FindBy(xpath="/html/body/main/div/section/div[3]/div[1]/div[4]/ol/li/div[2]/h5/a")
	List<WebElement> produits;
	
	@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[5]/div[2]/div/div/h1")
	WebElement produitVerif;
	
	public JeansPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickOnProduct(String productName) {
		try {
			for (WebElement produit: produits) {
				if(produit.getText().contains(productName)) {
					System.out.println("produit choisi : " + produit.getText());
					Actions action = new Actions(Config.driver);
					action.moveToElement(produit);
					produit.click();
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void verifier(String productName) {
		Config.attente(10);
		Assert.assertEquals(productName, produitVerif.getText());
		System.out.println("utilisateur est sur la page du produit ");
	}
}
