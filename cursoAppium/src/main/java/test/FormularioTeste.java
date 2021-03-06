package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import appium.core.BaseTest;
import appium.core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import page.FormularioPage;
import page.MenuPage;

public class FormularioTeste extends BaseTest{
	
	private AndroidDriver<MobileElement> driver;
	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();
	
	@Before
	public void inicializarAppium() throws MalformedURLException {
		driver = DriverFactory.getDrive();
		
		menu.acessarFormulario();
	}
			
	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		
		page.escreverNome("Ailton");
		
		page.obterNome("Ailton");		
	}
	
	@Test
	public void deveInteragirCombo() throws MalformedURLException {

		page.selecionarCombo("Nintendo Switch");

		Assert.assertEquals("Nintendo Switch", page.obterValorCombo());
	}
	
	@Test
	public void deveInteragirCheckSwitch () throws MalformedURLException {
	    
	    assertTrue(page.isCheckMarcado());
	    assertFalse(page.isSwitchMarcado());
	    	    
	    page.clicarCheckBox();
	    page.clicarSwitch();
	    
	    assertFalse(page.isCheckMarcado());
	    assertTrue(page.isSwitchMarcado());
	}
	
	@Test
	public void deveRealizarCadastro() throws MalformedURLException{
		
		page.escreverNome("Ailton");
		page.selecionarCombo("PS4");
		page.clicarCheckBox();
		page.clicarSwitch();
	    
	    page.clicarSalvar();
	    
	    page.obterNomeCadastro();
	    Assert.assertEquals("Nome: Ailton", page.obterNomeCadastro());
	    Assert.assertEquals("Console: ps4", page.obterNomeConsole());
	    assertTrue(page.obterCheckCadastrado().endsWith("Off"));
	    assertTrue(page.obterSwitchCadastrado().endsWith("Marcado"));
	}	
	
	@Test
	public void deveInteragirComSeekbar() {
		
		//Clicar SeeBar
		page.clicarSeekbar(0.67);
		
		//Clicar Salvar
		page.clicarSalvar();
		
		//Conferir Resultado
		Assert.assertTrue(page.existeElentoPorTexto("Slider: 67"));
		
	}
	
	@Test
	public void deveIneragirComDatePicker() {
		
		//Selecionar o date
		page.selecionarPorTexto("01/01/2000");
		//Alterar a data 
		page.selecionarPorTexto("20");
		//Confirmar a altera��o
		page.selecionarPorTexto("OK");
		//Verificar a data
		Assert.assertTrue(page.obterTextoData());
	}
	
	@Test
	public void deveIntragirComTimePicker() {
		
		//Deve clicar na data
		page.selecionarPorTexto("06:00");
		//Alterar hora
		page.clicarHora();
		//Alterar minuto
		page.clicarMinuto();
		//Confirmar
		page.selecionarPorTexto("OK");
		//Verificar hora
		Assert.assertTrue(page.obterHora());
	}	
}