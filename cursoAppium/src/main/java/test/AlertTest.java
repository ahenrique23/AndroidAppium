package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import appium.core.BaseTest;
import page.AlertPage;
import page.MenuPage;

public class AlertTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AlertPage page = new AlertPage();
	
	@Before
	public void inicializarMenu() {
		//acessar menu alerta
		menu.acessarAlerta();
	}
	
	@Test
	public void deveConfirmarAlerta() {
		
	//clicar em alerta confirm
	page.clicarAlertaConfirm();
	
	//Verificar os textos
	Assert.assertEquals("Info", page.obterTituloAlerta());
	Assert.assertEquals("Confirma a opera��o?", page.obterMensagemAlerta());
	
	//Confirmar alerta
	page.confirmar();
	
	//verificar nova mensagem
	Assert.assertEquals("Confirmado", page.obterMensagemAlerta());
	
	//Sair
	page.sair();	
	}

	@Test
	public void clicarFora() {
		//Clicar alerta simples
		page.selecionarPorTexto("ALERTA SIMPLES");
		//Clicar fora da caixa
		page.clicarForaDaCaixa();
		//Confirmar texto
		Assert.assertFalse(page.existeElentoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
	}
}
