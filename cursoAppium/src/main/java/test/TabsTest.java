package test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;
import page.TabsPage;

public class TabsTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private TabsPage page = new TabsPage();
	
	@Test
	public void deveTestarAbas() {
		//Acessar menu abas
		menu.acessarAbas();
		//Conferir texto
		Assert.assertTrue(page.obterTextoAba1());
		//Acessar aba 2
		page.clicarAba2();
		//Conferir texto
		Assert.assertTrue(page.obterTextoAba2());
	}
}
