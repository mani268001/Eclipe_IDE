package baseclass.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Baseclass {
	
	
		public static WebDriver driver;

		public static WebDriver browser_Launch(String w) {

			if (w.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();

			} else if (w.equalsIgnoreCase("firefox")) {

				FirefoxOptions option = new FirefoxOptions();
				option.addArguments("disabel-Notifications");

				driver = new FirefoxDriver(option);
				driver.manage().window().maximize();

			} else if (w.equalsIgnoreCase("Edge")) {

				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
			return driver;
		}

		public static void url(String s) { // url
			driver.get(s);
		}
		public static void navigate(String s) { // url
			driver.navigate().to(s);
		}

		public static void sendkeys(WebElement w, String s) { // sendkeys
			w.sendKeys(s);
		}

		public static void Click(WebElement w) { // click
			w.click();
		}

		public static void Screenshot(String s) throws IOException { // Screenshot
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\user\\eclipse-workspace\\Seleniam_Demo\\ScreenShot\\"+s+".png");
			Files.copy(screenshotAs, f);
		}

		public static void mousedclick() { // Actions
			Actions As = new Actions(driver);
			As.doubleClick();
		}

		public static void mousemove() {
			Actions As = new Actions(driver);
			As.moveToElement(null);
		}

		public static void mousecontext() {
			Actions As = new Actions(driver);
			As.contextClick();
		}

		public static void alertsimple(String s) { // Alert
			if (s.equalsIgnoreCase("Accept")) {
				driver.switchTo().alert().accept();
			} else {
				driver.switchTo().alert().dismiss();
			} // promtaple
		}

		public static void confomalert(String s) { // Alert
			if (s.equalsIgnoreCase("Accept")) {
				driver.switchTo().alert().accept();
			} else {
				driver.switchTo().alert().dismiss();
			}
		}

		public static void promtaplealert(String s, WebElement w) {
			if (s.equalsIgnoreCase("Accept")) {
				driver.switchTo().alert().accept();
				w.sendKeys(s);
			} else {
				driver.switchTo().alert().dismiss();
			}
		}

		public static void JavascriptExecuter(String s) { // java scriptExecuter
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeAsyncScript("window.scroll(" + s + ")");

		}

		public static void Expectedwait(int i) { // Wait
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
			wait.until(ExpectedConditions.alertIsPresent());
		}

		public static void implicitlywait(int i) {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
		}

		public static void multywebtabel(List<WebElement> w) {
			List<WebElement> data = w;
			for (WebElement webElement : data) {
				String text = webElement.getText();
			}
		}

		public static void Selectindex(WebElement w, int i) { // Drobdown

			Select s1 = new Select(w);
			s1.selectByIndex(i);
		}

		public static void Select_vt(WebElement w, String s) {

			Select s2 = new Select(w);
			s2.selectByValue(s);
		}

		public static void SelectvisibleText(WebElement w, String s) {

			Select s3 = new Select(w);
			s3.selectByVisibleText(s);
		}

		public static void framein(int index) { // //frame
			driver.switchTo().frame(index);
		}

		public static void frameout() {
			driver.switchTo().defaultContent();
		}

//		public void windowhandlesparent(WebElement W) { // WindowHandl
//			Set<String> windowHandles = driver.getWindowHandles();
//			System.out.println(windowHandles);
//			//Iterator<String> iterator = windowHandles.iterator();
//			String parent = iterator.next();
//			System.out.println(parent);
//			driver.switchTo().window(parent);
//		}
//
//		public void windowhandlesChild(WebElement w) {
//			Set<String> windowHandles = driver.getWindowHandles();
//			System.out.println(windowHandles);
//			Iterator<String> iterator = windowHandles.iterator();
//			String Chiled = iterator.next();
//			driver.switchTo().window(Chiled);
//		}

		public void windowhandle(WebDriver d) {
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
		}

		public static void robot() throws AWTException { // Robot
			Robot rt = new Robot();
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
			rt.keyPress(KeyEvent.VK_ENTER);
			rt.keyRelease(KeyEvent.VK_ENTER);
		}

		public static void Clear(WebElement w) { // Clear
			w.clear();
		}

		public static void Quit() { // Quit
			driver.quit();
		}

	}



