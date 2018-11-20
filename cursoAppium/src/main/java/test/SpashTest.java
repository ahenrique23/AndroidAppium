package test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;
import page.SplashPage;

public class SpashTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
	@Test
	public void deveAguardarSplashSumir() {
		
		//acessar menu splash
		menu.acessarSplash();
		//verificar que o splash esta sendo exibido
		page.isTelaSplashVisivel();
		//aguardar saida do splash
		page.aguardarSplashSumir();
		//verificar que o formulario esta sendo exibido
		Assert.assertTrue(page.existeElentoPorTexto("Formulário"));
	}
}
