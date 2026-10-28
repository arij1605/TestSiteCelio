package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class CelioHomePage {
	
	@FindBy(xpath="/html/body/main/div/header/div[2]/div/div/div/div[1]/div/div[1]/nav/ul/li/a")
	List <WebElement> menus;

	@FindBy(xpath="/html/body/main/div/header/div[2]/div/div/div/div[1]/div/div[1]/nav/ul/li[4]/ul/li/div/div/div[1]/ul/li[2]/a")
	List <WebElement> submenus;
	
	@FindBy(xpath="/html/body/main/div/div[2]/div/ul/li[3]/strong")
	WebElement verif;
	
	public CelioHomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHoverAndClick(String menuTitle, String subMenuTitle) {
		try {
			for(WebElement menu:menus) {
				System.out.println(menu.getText());
				if(menu.getText().contains(menuTitle)) {
					System.out.println("menu choisi: "+ menu.getText());
					Actions action = new Actions(Config.driver);
					action.moveToElement(menu).perform();
					for(WebElement subMenu : submenus) {
						if(subMenu.getText().contains(subMenuTitle)) {
							System.out.println("sous menu choisi: "+ subMenu.getText());
							subMenu.click();
						}
					}
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void verif(String subMenuTitle) {
		Assert.assertEquals(subMenuTitle, verif.getText());
		System.out.println("utilisateur est sur la page: " +  verif.getText());
	}
}

