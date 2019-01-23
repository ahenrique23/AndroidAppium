package page;

import static appium.core.DriverFactory.getDrive;

import java.util.List;

import org.openqa.selenium.By;

import appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class DragDropPage extends BasePage {
	
	public void arrastar(String origem, String destino) {
		
		MobileElement inicio = getDrive().findElement(By.xpath("//*[@text='"+origem+"']"));
		MobileElement fim = getDrive().findElement(By.xpath("//*[@text='"+destino+"']"));
		
		new TouchAction(getDrive())
			.longPress(inicio)
			.moveTo(fim)
			.release()
			.perform();
	}
	
	public String[] obterLista() {
		
		List<MobileElement> elements = getDrive().findElements(By.className("android.widget.TextView"));
		String[] retorno = new String[elements.size()];
		for(int i=0; i < elements.size(); i++) {
			retorno[i] = elements.get(i).getText();
		}
		
		return retorno;
	}
	
}