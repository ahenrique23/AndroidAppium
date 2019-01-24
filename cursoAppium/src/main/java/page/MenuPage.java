package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static appium.core.DriverFactory.getDrive;
import appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
	
public class MenuPage extends BasePage{
	private AndroidDriver<MobileElement> driver;	
		
	public void acessarFormulario() {
		clicar(By.xpath("//android.widget.TextView[@text='Formulário']"));
	}
	
	public void acessarSplash() {
		selecionarPorTexto("Splash");
	}
	
	public void acessarAlerta() {
		selecionarPorTexto("Alertas");
	}
	
	public void acessarAbas() {
		selecionarPorTexto("Abas");
	}
	
	public void acessarAccordion() {
		selecionarPorTexto("Accordion");
	}
	
	public void acessarCliques() {
		selecionarPorTexto("Cliques");
	}
	
	public void opcaoEscondida() {
		WebDriverWait wait = new WebDriverWait(getDrive(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Abas']")));
		scrollDown();
		selecionarPorTexto("Opção bem escondida");
	}
	
	public void acesssarSwipe() {
		scrollDown();
		selecionarPorTexto("Swipe");
	}
	
	public void acesssarSwipeList() {		
		WebDriverWait wait = new WebDriverWait(getDrive(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		scrollDown();		
		selecionarPorTexto("Swipe List");		
		}
	public void acesssarDragNDrop() {		
		WebDriverWait wait = new WebDriverWait(getDrive(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		scrollDown();		
		selecionarPorTexto("Drag and drop");		
		}
	
	public void acessaracessarSBHibrido() {
		selecionarPorTexto("SeuBarriga Híbrido");
	}
	
	public void acessaracessarSBNativo() {
		selecionarPorTexto("SeuBarriga Nativo");
	}
}

