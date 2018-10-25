package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

public class CalculadoraTeste2 {
	
	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    //desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
	    //desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "E:\\Dev\\AutomacaoAppium\\cursoAppium\\src\\main\\resources\\CTAppium-1-1.apk");
	    
	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    List<MobileElement> elementosEncontrados = driver.findElements(By.className("android.widget.TextView"));
	    
	    elementosEncontrados.get(1).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    MobileElement campoNome = driver.findElement(MobileBy.AccessibilityId("nome"));
	    campoNome.sendKeys("Ailton");
	    
	    
	    String Text =campoNome.getText();
	    org.junit.Assert.assertEquals("Ailton", Text);
	    
	    driver.quit();
	}
	
}
