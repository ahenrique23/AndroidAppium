package page;

import static appium.core.DriverFactory.getDrive;

import org.openqa.selenium.By;

import appium.core.BasePage;
import io.appium.java_client.TouchAction;

public class CliquePage extends BasePage {

	public void  cliqueLongo(String texto) {
		
		new TouchAction(getDrive())
			.longPress(getDrive().findElement(By.xpath("//*[@text='Clique Longo']")))
			.perform();
	}
	
	public String obterTextoCampo() {
		return getDrive().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}
	
	public void clicar(String valor) {
		selecionarPorTexto(valor);
	}
}
