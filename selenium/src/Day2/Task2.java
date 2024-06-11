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
        
        String input="Wipro";
    	search.sendKeys(input);
    	search.click();
    	boolean Displayed=search.isDisplayed();
    	boolean Enabled=search.isEnabled();
    	if(Displayed && Enabled)
        {
        	System.out.println("Search box is enabled.");
  
        }
    	Thread.sleep(4000);
    	search.clear();
    	boolean empty=((CharSequence) search).isEmpty();
    	if(empty)
    	{
    		System.out.println("Empty");
    	}
        

	}

}
