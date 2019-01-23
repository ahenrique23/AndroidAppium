package test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;

public class SwipeTest extends BaseTest {
	
	private MenuPage menu = new MenuPage(); 
	
	@Test
	public void deveRealizarTesteSwipe() {
		
		//Acessar menu		
		menu.acesssarSwipe();
		
		//Verificar Texto "a esquerda"
		Assert.assertTrue(menu.existeElentoPorTexto("a esquerda"));
		
		//Swipe para Direita
		menu.swipeRight();
		
		//Verificar Texto
		Assert.assertTrue(menu.existeElentoPorTexto("E veja se"));
		
		//Clicar botao Direita
		menu.selecionarPorTexto("›");
		
		//Verificar Texto "Chegar ate o fim"
		Assert.assertTrue(menu.existeElentoPorTexto("Chegar até o fim!"));
		
		//Swipe Esquerda
		menu.swipeLeft();
		
		//Clicar botao esquerda
		menu.selecionarPorTexto("‹");
		
		//Veificar texto
		Assert.assertTrue(menu.existeElentoPorTexto("Mova a tela para"));
		
	}
}
