package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        WebElement selector=driver.findElement(By.cssSelector("#APjFqb"));
        selector.sendKeys("css selector");
        Thread.sleep(2000);
        System.out.println("Element found using css selector");
        selector.clear();
        Thread.sleep(2000);
        WebElement xpath=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        xpath.sendKeys("XPath");
        Thread.sleep(2000);
        System.out.println("Element found using xpath.");
        driver.quit();
        

	}

}
