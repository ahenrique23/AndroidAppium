package page;

import static appium.core.DriverFactory.getDrive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appium.core.BasePage;

public class SplashPage extends BasePage {

	public boolean isTelaSplashVisivel() {
		return existeElentoPorTexto("Splash!");
	}
	
	public void aguardarSplashSumir() {
		getDrive().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(getDrive(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Spash!']")));
	}
}
