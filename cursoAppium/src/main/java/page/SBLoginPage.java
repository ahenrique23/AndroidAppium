package page;

import org.openqa.selenium.By;

import appium.core.BasePage;
import io.appium.java_client.MobileBy;

public class SBLoginPage extends BasePage {
	
	
	public void setEmail(String login) {
		
		escrever(By.className("android.widget.EditText"), login);
	}
	
	public void setSenha(String senha) {
		
		escrever(By.xpath("android.widget.EditText[2]"), senha);
	}
	
	public void entar() {
		
		selecionarPorTexto("ENTRAR");
	}
	
}
