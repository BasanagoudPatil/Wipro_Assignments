package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.wipro.com/");
        String title=driver.getTitle();
        System.out.println(title);
        Thread.sleep(4000);
        driver.quit();
	}

}
