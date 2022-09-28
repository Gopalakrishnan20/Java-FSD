package selenium;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewTestDemo {
	public String baseUrl = "http://localhost:8080/AP1";
	//public String baseUrl = "https://login.yahoo.com/";
	String driverPath = "C:\\Users\\USER\\Downloads\\chromedriver.exe";
	public WebDriver driver;

	@Test
	public void test() {
		// set the system property for Chrome driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		// Create driver object for CHROME browser
		driver = new ChromeDriver();
		
		driver.get(baseUrl);
		System.out.println("Title of my page="+driver.getTitle());
		//Ftech all input Elements from current web page 
		List<WebElement> allInputElements=driver.findElements(By.tagName("input"));
		for(WebElement e : allInputElements)
			System.out.println("Input box id="+e.getAttribute("id"));// <input type="" id="">
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
		System.out.println("after test");
	}

}