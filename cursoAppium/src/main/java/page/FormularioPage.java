package page;

import org.junit.Assert;
import org.openqa.selenium.By;

import appium.core.BasePage;
import io.appium.java_client.MobileBy;

public class FormularioPage extends BasePage {
	

		
	public void escreverNome(String nome) {
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public void obterNome(String nome) {
		Assert.assertEquals(nome, obterTexto(MobileBy.AccessibilityId("nome")));
	}
	
	public void selecionarCombo(String combo) {
		selecionarCombo(MobileBy.AccessibilityId("console"), combo);
	}
	
	public String obterValorCombo() {
		return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));				
	}
	
	public void clicarCheckBox() {
		clicar(By.className("android.widget.CheckBox"));
	}
		
	public void clicarSwitch() {
		clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean isCheckMarcado() {
		return isCheckMarcado(By.className("android.widget.CheckBox"));
	}
	
	public boolean isSwitchMarcado() {
		return isCheckMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	public void clicarSalvar() {
		clicar(MobileBy.AccessibilityId("save"));
	}
	
	public String obterNomeCadastro() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
	}
	
	public String obterNomeConsole() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
	}
	 
	public String obterCheckCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
	}
    
	public String obterSwitchCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox')]"));
	}
	
	public boolean obterTextoData() {
		return existeElentoPorTexto("Data a comparar");
		
	}
}