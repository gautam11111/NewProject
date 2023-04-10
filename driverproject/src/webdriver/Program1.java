package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.get("https://www.facebook.com");
String text = driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();
System.out.println(text);
= driver.findElement(By.xpath("//input[ @name='jazoest']").sendKeys("password");



	}

}
