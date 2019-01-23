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
	private void deveRealizarTesteSwipeList() {
		
		//Clicar Swipe List
		
		menu.acesssarSwipeList();
		
		//Op 1 para a direita
		page.swipeElementRight("Op��o 1");
		
		//Clicar bot�o  +
		page.clicarBotaoMais();
		
		//Verificar Op1 +
		Assert.assertTrue(page.existeElentoPorTexto("Op��o 1 (+)"));
		
		//Op 4 para direita
		page.swipeElementRight("Op��o 4");
		
		//Op4 -
		page.clicarBotaoMais();
		
		//Verificar Op4
		Assert.assertTrue(page.existeElentoPorTexto("Op��o 4 (-)"));		
		
		//Op 5	para esquerda
		page.swipeElementLeft("Op��o 5 (-)");
		
		//Verificar Ops5
		Assert.assertTrue(page.existeElentoPorTexto("Op��o 5"));
		
	}
}
