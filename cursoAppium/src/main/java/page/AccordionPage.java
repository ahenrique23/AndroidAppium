package page;

import appium.core.BasePage;

public class AccordionPage extends BasePage {
		
	public void clicarOpcao1() {
		selecionarPorTexto("Op��o 1");
	}
	
	public void clicarOpcao2() {
		selecionarPorTexto("Op��o 2");
	}
	
	public void clicarOpcao3() {
		selecionarPorTexto("Op��o 3");
	}
	
	public void clicarOpcao4() {
		selecionarPorTexto("Op��o 4");
	}
	
	public void clicarOpcao5() {
		selecionarPorTexto("Op��o 5");
	}
	
	public boolean obterTextoAccordion1() {
		return existeElentoPorTexto("Esta � a descri��o da op��o 1");
	}
	
	public boolean obterTextoAccordion2() {
		return existeElentoPorTexto("Esta � a descri��o da op��o 2");
	}
	
	public boolean obterTextoAccordion3() {
		return existeElentoPorTexto("Esta � a descri��o da op��o 3. Que pode, inclusive ter mais que uma linha");
	}
	
	public boolean obterTextoAccordion4() {
		return existeElentoPorTexto("Esta � a descri��o da op��o 4");
	}
	
	public boolean obterTextoAccordion5() {
		return existeElentoPorTexto("Esta � a descri��o da op��o 5");
	}	
}