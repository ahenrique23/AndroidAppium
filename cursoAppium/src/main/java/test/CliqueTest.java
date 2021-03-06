package test;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import appium.core.BaseTest;
import appium.core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import page.CliquePage;
import page.MenuPage;

public class CliqueTest extends BaseTest {

	private AndroidDriver<MobileElement> driver;
	private CliquePage page = new CliquePage();
	private MenuPage menu = new MenuPage();
	
	@Before
	public void inicializarAppium() throws MalformedURLException {
		driver = DriverFactory.getDrive();
		
		menu.acessarCliques();
	}
	
	@Test 
	public void devInteragirComCliqueLongo() {
		 
		//Realizar o clique longo
		page.cliqueLongo("Clique Longo");
		//Verificar o resultado
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());
	}
	
	@Test 
	public void devInteragirComCliqueDuplo() {
		 
		//Realizar o clique Duplo		
		page.clicar("Clique duplo");
		page.clicar("Clique duplo");
		//Verificar o resultado
		Assert.assertEquals("Duplo Clique", page.obterTextoCampo());
		
	}
	
	@Test 
	public void devInteragirComCliqueDuploLento() throws InterruptedException {
		 
		//Realizar o clique Duplo Lento
		page.clicar("Clique duplo lento");
		Thread.sleep(1000);
		page.clicar("Clique duplo lento");
		//Verificar o resultado
		Assert.assertEquals("Duplo Clique lento", page.obterTextoCampo());
	}	
}
