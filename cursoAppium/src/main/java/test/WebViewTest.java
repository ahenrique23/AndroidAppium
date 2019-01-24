package test;

import org.junit.Test;

import appium.core.BaseTest;
import page.MenuPage;
import page.WebViewPage;

public class WebViewTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();
	
	@Test
	public void deveFazerLogin() throws InterruptedException {
		/*Não esta funcionando: Pesquisar soluções para esse caso*/
		
		//Acessar menu
		menu.acessaracessarSBHibrido();
		page.espera(3000);
				
		//page.entrarContextoWeb();
		page.entrarContextoWeb();
		//Preencher email
		page.preencherEmail();
		
//		//Preencher senha
//		page.preencherSenha();
//		
//		//Entar
//		page.clicarEntrar();
//		
//		//Verificar mensagem de sucesso
	
	
	}
	
	
}
