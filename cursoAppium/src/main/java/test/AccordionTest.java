package test;

import appium.core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import com.sun.media.sound.MidiUtils.TempoCache;

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
		page.clicarAccordion1();
		//Conferir texto do resultado 1
		Assert.assertTrue(page.obterTextoAccordion1());		
		//Acessar accordion op2
		page.clicarAccordion2();
		//Conferir texto do resultado 2		
		Assert.assertTrue(page.obterTextoAccordion2());
		//Acessar accordion op3
		page.clicarAccordion3();
		//Conferir texto do resultado 3
		Assert.assertTrue(page.obterTextoAccordion3());
		//Acessar accordion op4
		page.clicarAccordion4();
		//Conferir texto do resultado 4
		Assert.assertTrue(page.obterTextoAccordion4());
		//Acessar accordion op5
		page.clicarAccordion5();
		//Conferir texto do resultado 5
		Assert.assertTrue(page.obterTextoAccordion5());
	}
}
