package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import org.testng.collections.Lists;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class epiasMobileProject {

//	public static void main(String[] args) throws MalformedURLException {
//		setUp();
//	}
	static AppiumDriver<MobileElement> driver;

	@BeforeClass
	public static void setUp() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "SM-N910C");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("udid", "41000e2ff259122d");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("appPackage", "com.foreks.android.epias");
		capabilities.setCapability("appActivity", "com.foreks.android.epias.view.splash.SplashActivity"); 

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, capabilities);
	}

	@Test
	public void testCal() throws Exception {
		Thread.sleep(7000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageButton\r\n"
						+ ""))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageButton[3]\r\n"
						+ ""))
				.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView[2]\r\n" + 
				"")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/com.android.internal.widget.ViewPager/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.ImageView\r\n" + 
				"")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText\r\n" + 
				"")).sendKeys("yyavuzkacann@gmail.com");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.EditText\r\n" + 
				"")).sendKeys("EPT Average Report");
		Thread.sleep(500);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.widget.EditText")).sendKeys("This report sended with mobile automation");
		Thread.sleep(500);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Gönder\"]")).click();
		//		MobileElement elementToClick = (MobileElement) driver
//				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
//						+ ".resourceId(\"com.foreks.android.epias:id/wheel_date_picker_day\")).scrollIntoView("
//						+ "new UiSelector().text(\"5\"));"));
		

//	    driver.findElement(MobileBy.AndroidUIAutomator(
//	    		   "new UiScrollable(new UiSelector().resourceIdMatches(\"com.foreks.android.epias:id/wheel_date_picker_day\")).flingBackward()"));

//	    AndroidElement dateList =(AndroidElement)driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[1]"));
//	    MobileElement listItem = (MobileElement)driver.findElement(
//	    		MobileBy.AndroidUIAutomator(
//	    				"new UiScrollable(new UiSelector()).scrollIntoView("
//	    				+"new UiSelector().description(\"5\"));"));
//	    System.out.println(listItem.getLocation());
//	    listItem.click();
//	   WebElement plus=driver.findElement(By.name("+"));
//	   plus.click();
//	   WebElement four=driver.findElement(By.name("4"));
//	   four.click();
//	   WebElement equalTo=driver.findElement(By.name("="));
//	   equalTo.click();
//	   //locate the edit box of the calculator by using By.tagName()
//	   WebElement results=driver.findElement(By.tagName("EditText"));
//		//Check the calculated value on the edit box
//	assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";

	}

//	@AfterClass
//	public void teardown(){
//		//close the app
//		driver.quit();
//	}
}
