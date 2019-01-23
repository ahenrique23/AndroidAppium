package page;

import static appium.core.DriverFactory.getDrive;

import org.openqa.selenium.By;

import appium.core.BasePage;
import appium.core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class SwipeListPage extends BasePage {

	public void swipeElementLeft(String opcao) {
		
		swipeElement(DriverFactory.getDrive().findElement(By.xpath("//*[@text='+opcao+']/..")), 0.1, 0.9);
	}
	
	public void swipeElementRight(String opcao) {
		
		swipeElement(getDrive().findElement(By.xpath("//*[@text='+opcao+']/..")), 0.9, 0.1);
	}
	
	public void clicarBotaoMais() {
		
		MobileElement botao = getDrive().findElement(By.xpath("//*[@text='(+)']/.."));
		new TouchAction(getDrive())
			.tap(botao, -50, 0)
			.perform();
	}
}
