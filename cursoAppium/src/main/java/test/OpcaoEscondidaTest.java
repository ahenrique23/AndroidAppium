package test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;
import page.OpcaoEscondidaPage;

public class OpcaoEscondidaTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private OpcaoEscondidaPage page = new OpcaoEscondidaPage();
	
	@Test
	public void deveEncontrarOpcaoEscondida() {
	//scroll down
	menu.scroll(0.9, 0.1);
	//clicar menu
	menu.opcaoEscondida();
	//verificar mensagem
	Assert.assertEquals("Voc� achou essa op��o", page.obterTexto());
	//sair
	page.clicar();
	}
}
