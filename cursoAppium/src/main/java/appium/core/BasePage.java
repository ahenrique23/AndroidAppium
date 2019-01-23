package appium.core;

import static appium.core.DriverFactory.getDrive;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

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
		//Clicar fora da caixa
		public void tap(int x, int y) {
			new TouchAction(getDrive()).tap(x, y).perform();
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
		
		/**************		Scroll		***********/
		public void scroll(double inicio, double fim) {
			Dimension size = getDrive().manage().window().getSize();			
			
			int x = size.width / 2;
			
			int start_y = (int) (size.height * inicio);
			int end_y = (int) (size.height * fim);
			
			new TouchAction(getDrive())
				.press(x, start_y)
				.waitAction(Duration.ofMillis(500))
				.moveTo(x, end_y)
				.release()
				.perform();
		}
}
