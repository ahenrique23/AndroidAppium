package page;

import static appium.core.DriverFactory.getDrive;

import java.util.Set;

import org.openqa.selenium.By;

import appium.core.BasePage;


public class WebViewPage extends BasePage {

	BasePage page = new BasePage();
	
	public void entrarContextoWeb() {
		Set<String> contextHandles = getDrive().getContextHandles();
		
		for(String valor: contextHandles) {
			System.out.println(valor);
		}
		getDrive().context((String) contextHandles.toArray()[0]);
	}
	
	public void preencherEmail() {
		page.setEmail("ailton@a");
		
	}
	
	public void preencherSenha() {
		page.setSenha("123");
		
	}
	
	public void clicarEntrar() {
		
		selecionarPorTexto("Entar");
	}
	
	
}
