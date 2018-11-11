package page;

import org.openqa.selenium.By;

import appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
	

public class MenuPage extends BasePage{
	private AndroidDriver<MobileElement> driver;	
	
	public void acessarFormulario() {
		clicar(By.xpath("//android.widget.TextView[@text='Formulário']"));
	}
}
