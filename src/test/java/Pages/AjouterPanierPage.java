package Pages;



import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class AjouterPanierPage {

	/*@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[5]/div[2]/div/div/div[2]/form/div[2]/div/div/div[1]/div/div")
	List < WebElement> couleurs;
	
	@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[5]/div[2]/div/div/div[2]/form/div[2]/div/div/div[2]/div/div")
	List < WebElement> tailles;*/
	
	
	@FindBy(id="product-addtocart-button")
	WebElement ajouterbtn;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/button")
	WebElement voirpanierbtn;
	
	@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[3]/form/div[1]/table/tbody[1]/tr[1]/td[1]/div/strong/a")
	WebElement verifPanier;
	
	public AjouterPanierPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void ajouterPanier() throws Exception {
			Actions action = new Actions(Config.driver);
			action.moveToElement(ajouterbtn);
			ajouterbtn.click();
			WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(voirpanierbtn));
			voirpanierbtn.click();
	}
	public void verifPanier(String productTitle) {
		Assert.assertTrue(verifPanier.getText().contains(productTitle) );
		System.out.println("produit est dans le panier");
	}
}

