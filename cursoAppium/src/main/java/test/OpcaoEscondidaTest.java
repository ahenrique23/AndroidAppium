package test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BasePage;
import appium.core.BaseTest;
import page.MenuPage;
import page.OpcaoEscondidaPage;

public class OpcaoEscondidaTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private OpcaoEscondidaPage page = new OpcaoEscondidaPage();
	private BasePage base = new BasePage();
	
	@Test
	public void deveEncontrarOpcaoEscondida() {
	
		//scroll down		
		menu.opcaoEscondida();
		//clicar menu
		//menu.opcaoEscondida();
		//verificar mensagem
		Assert.assertEquals("Você achou essa opção", page.obterTexto());
		//sair
		page.clicar();
	}
}
