package test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import page.AccordionPage;
import page.MenuPage;

public class AccordionTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void deveInteragirComAccordion() {
		
		//Clicar menu accordion		
		menu.acessarAccordion();
		//Acessar accordion op1
		page.clicarOpcao1();
		//Conferir texto do resultado 1
		Assert.assertTrue(page.obterTextoAccordion1());
		//Acessar accordion op2
		page.clicarOpcao2();
		//Conferir texto do resultado 2		
		Assert.assertTrue(page.obterTextoAccordion2());
		//Acessar accordion op3
		page.clicarOpcao3();
		//Conferir texto do resultado 3
		Assert.assertTrue(page.obterTextoAccordion3());
		//Acessar accordion op4
		page.clicarOpcao4();
		//Conferir texto do resultado 4
		Assert.assertTrue(page.obterTextoAccordion4());
		//Acessar accordion op5
		page.clicarOpcao5();
		//Conferir texto do resultado 5
		Assert.assertTrue(page.obterTextoAccordion5());
	}
}
