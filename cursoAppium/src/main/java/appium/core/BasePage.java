package appium.core;

import static appium.core.DriverFactory.getDrive;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class BasePage {
	
	//Escrever Texto
		public void escrever(By by, String texto) {
			getDrive().findElement(by).sendKeys(texto);
		}
		
		//ObterTexto
		public String obterTexto(By by) {
			return getDrive().findElement(by).getText();
		}

		/**************		Click		***********/
		//Simples
		public void clicar(By by) {
			getDrive().findElement(by).click();
		}
		//Por Texto
		public void selecionarPorTexto(String texto) {
			clicar(By.xpath("//*[@text='"+texto+"']"));
		}	
		//Selecionar Combo
		public void selecionarCombo(By by, String valor) {
			getDrive().findElement(by).click();
			selecionarPorTexto(valor);
		}
		
		/*************	Checar valores *************/
		//Conferir Check
		public boolean isCheckMarcado(By by) {
			return getDrive().findElement(by).getAttribute("checked").equals("false");
		}
		//Conferir existencia de texto na tela
		public boolean existeElentoPorTexto(String texto) {
			List<MobileElement> elementos = getDrive().findElements(By.xpath("//*[@text='"+texto+"']"));
			return elementos.size() > 0;
		}

}
