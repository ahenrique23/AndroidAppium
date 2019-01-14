package page;

import appium.core.BasePage;

public class AccordionPage extends BasePage {
		
	public void clicarOpcao1() {
		selecionarPorTexto("Opção 1");
	}
	
	public void clicarOpcao2() {
		selecionarPorTexto("Opção 2");
	}
	
	public void clicarOpcao3() {
		selecionarPorTexto("Opção 3");
	}
	
	public void clicarOpcao4() {
		selecionarPorTexto("Opção 4");
	}
	
	public void clicarOpcao5() {
		selecionarPorTexto("Opção 5");
	}
	
	public boolean obterTextoAccordion1() {
		return existeElentoPorTexto("Esta é a descrição da opção 1");
	}
	
	public boolean obterTextoAccordion2() {
		return existeElentoPorTexto("Esta é a descrição da opção 2");
	}
	
	public boolean obterTextoAccordion3() {
		return existeElentoPorTexto("Esta é a descrição da opção 3. Que pode, inclusive ter mais que uma linha");
	}
	
	public boolean obterTextoAccordion4() {
		return existeElentoPorTexto("Esta é a descrição da opção 4");
	}
	
	public boolean obterTextoAccordion5() {
		return existeElentoPorTexto("Esta é a descrição da opção 5");
	}	
}