package test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;
import page.SwipeListPage;

public class SwipeListTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();
	
	@Test
	public void deveRealizarTesteSwipeList() {
		
		//Clicar Swipe List		
		menu.acesssarSwipeList();
		
		//Op 1 para a direita
		page.swipeElementRight("Opção 1");
		
		//Clicar botão  +
		page.clicarBotaoMais();
		
		//Verificar Op1 +
		Assert.assertTrue(page.existeElentoPorTexto("Opção 1 (+)"));
		
		//Op 4 para direita
		page.swipeElementRight("Opção 4");
		
		//Op4 -
		page.clicarBotaoMais();
		
		//Verificar Op4
		Assert.assertTrue(page.existeElentoPorTexto("Opção 4 (+)"));		
		
		
		
	}
}
