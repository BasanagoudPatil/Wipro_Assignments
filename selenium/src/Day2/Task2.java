package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        String title=driver.getTitle();
        
        if(title.contains("Google"))
        {
        	System.out.println("Title matches successful.");
        }
        else
        {
        	System.out.println("Title Not not matches to excepted result");
        }
        WebElement search=driver.findElement(By.id("APjFqb"));
        boolean Displayed=search.isDisplayed();
    	boolean Enabled=search.isEnabled();

        if(Displayed && Enabled)
        {
        	System.out.println("Search box is enabled.");
        }
        else 
        {
        	System.out.println("Text box is not enabled.");
        }
        String input="Wipro";
    	search.sendKeys(input);
    	String Text = search.getAttribute("value");

    	if (Text.equals(input)) 
    	{
            System.out.println("Text verification successful.");
        } 
    	else 
    	{
            System.out.println("Text verification failed.");
        }
    	search.click();
    	Thread.sleep(4000);
    	search.clear();
    	Text=search.getAttribute("value");
        if (Text.isEmpty()) {
            System.out.println("Text clear successful.");
        } 
        else 
        {
            System.out.println("Text clear failed");
        } 
        driver.quit();
	}
}
