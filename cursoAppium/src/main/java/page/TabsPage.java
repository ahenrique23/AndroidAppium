package page;

import appium.core.BasePage;

public class TabsPage extends BasePage {
	
	public boolean obterTextoAba1() {
		 return existeElentoPorTexto("Este é o conteúdo da Aba 1");
	}
	
	public boolean obterTextoAba2() {
		return existeElentoPorTexto("Este é o conteúdo da Aba 2");
	}
	
	public void clicarAba2() {
		selecionarPorTexto("ABA 2");
	}
}
