package test;

import static appium.core.DriverFactory.getDrive;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appium.core.BaseTest;
import io.appium.java_client.functions.ExpectedCondition;
import page.MenuPage;
import page.OpcaoEscondidaPage;

public class OpcaoEscondidaTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private OpcaoEscondidaPage page = new OpcaoEscondidaPage();
	
	@Test
	public void deveEncontrarOpcaoEscondida() {
	
		//scroll down
		menu.scrollDown();
		//clicar menu
		menu.opcaoEscondida();
		//verificar mensagem
		Assert.assertEquals("Você achou essa opção", page.obterTexto());
		//sair
		page.clicar();
	}
}
