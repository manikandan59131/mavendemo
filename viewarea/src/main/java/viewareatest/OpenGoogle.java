package viewareatest;

import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenGoogle {
	
	public static void main(String[] args) {
		ExtentReports extentReports= new ExtentReports();
		ExtentTest test=extentReports.createTest("hello");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("hello!");
		driver.findElement(By.name("q")).submit();
		test.pass("Test passed");
		driver.quit();
		extentReports.flush();
		
	}
}
