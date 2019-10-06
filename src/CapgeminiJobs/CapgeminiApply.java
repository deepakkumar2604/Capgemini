package CapgeminiJobs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapgeminiApply {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Driver\\New folder (2)\\New folder\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.capgemini.com/in-en/careers/");
		driver.findElement(By.id("search-5d99f6f6f2c735.30512212")).sendKeys("Selenium 2");
		driver.findElement(By.className("single-input__submit")).click();
		//single-input__submit
		driver.findElement(By.className("single-input__submit")).click();
		
		List<String> ls = new ArrayList<String>();
		
		
	web	driver.findElements(By.tagName("a"));
		
		
		for()
		
		ls.add(null)
		
		
	}

}
