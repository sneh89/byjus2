package byjus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testhome {
	WebDriver driver;
	home w;
	@BeforeClass
	public void beforeclass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
		 driver.manage().window().maximize();
		 driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=Cj0KCQjwy5maBhDdARIsAMxrkw30p2qYMoe8xOHblLDi_uHpY-rPiZwNcjD2aSjj0kksaMtQvK4RH9EaAthoEALw_wcB");
	
	}
	   
	@BeforeMethod
	public void beforemethod(){
		JavascriptExecutor a= (JavascriptExecutor )driver;
		a.executeScript("window.scrollBy(0,4500)");
	}
		@Test
		public void test() throws InterruptedException {
	 w = new home(driver);
	                    
	w.class4();
	Thread.sleep(2000);
	w.class5();
	Thread.sleep(2000);
	w.class6();
	Thread.sleep(2000);
	w.class7();
	Thread.sleep(2000);
	w.class8();
	Thread.sleep(2000);
	w.class9();
	Thread.sleep(2000);
	w.class10();
	Thread.sleep(2000);
	
		}
	
	//@AfterMethod
	//public void aftermethod() {
		//null
	//}
	
	@AfterClass
	public void afterclass() {
		driver.close();
	}
	
	
	
	
	
	
	
	
		
	

}
