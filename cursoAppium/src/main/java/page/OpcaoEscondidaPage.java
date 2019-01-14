package page;

import org.openqa.selenium.By;

import appium.core.BasePage;

public class OpcaoEscondidaPage extends BasePage {
	
	public String obterTexto() {
		return obterTexto(By.id("android:id/message"));
	}
	
	public void clicar() {
		selecionarPorTexto("OK");
	}
	
}
