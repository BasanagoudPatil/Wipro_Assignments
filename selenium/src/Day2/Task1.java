package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.wipro.com/");
        String title=driver.getTitle();
        if(title.contains("Wipro | Ambitions Realized"))
        {
        	System.out.println("Title matches successful.");
        }
        else
        {
        	System.out.println("Title Not not matches to excepted result");
        }
        Thread.sleep(4000);
        driver.quit();

	}

}
