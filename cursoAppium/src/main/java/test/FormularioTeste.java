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
}