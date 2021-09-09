package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\muthu\\eclipse-workspace\\Google\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Greens");
	
	List<WebElement> list=driver.findElements(By.xpath("//input[@class= 'gLFyf gsfi']//ancestor::div//following-sibling::div[@class='UUbT9']"));

	Thread.sleep(5000);

	for(int i=0; i<list.size(); i++) {
		String text =list.get(i).getText();
		System.out.println(text);
	}

}
}
