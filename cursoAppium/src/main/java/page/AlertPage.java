package page;

import org.junit.Assert;
import org.openqa.selenium.By;

import appium.core.BasePage;
import io.appium.java_client.MobileBy;

public class AlertPage extends BasePage {

	public void clicarAlertaConfirm() {
		selecionarPorTexto("ALERTA CONFIRM");
	}
	
	public void obterTituloAlerta(String confirm) {
		Assert.assertEquals(confirm, obterTexto(MobileBy.AccessibilityId("android:id/alertTitle")));
	}
	
	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}
	
	public String obterMensagemAlerta() {
		return obterTexto(By.id("android:id/message"));
	}
	
	public void confirmar() {
		selecionarPorTexto("CONFIRMAR");
	}
	
	public void sair() {
		selecionarPorTexto("SAIR");
	}
}

