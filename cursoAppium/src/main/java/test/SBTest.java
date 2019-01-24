package test;

import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;
import page.SBLoginPage;

public class SBTest extends BaseTest {

	MenuPage menu = new MenuPage();	
	SBLoginPage page = new SBLoginPage();
	
	
	@Test
	public void deveInteragirNativo() {
		
		//Acessar Menu 
		menu.acessaracessarSBNativo();
		
		//Preencher nome
		page.setEmail("ailton@a");
		
		//Preencher Senha
		page.setSenha("123");
		
		//Entrar
		page.entar();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
