package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTeste {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    
	    
	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    
	    MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
	    
	    driver.quit();
	}
}