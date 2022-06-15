import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trident {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Driver_Browsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.programmableweb.com/category/open-data/api");
		Thread.sleep(2000);
		String search=driver.findElement(By.xpath("//input[@placeholder='Search over 24,109 APIs and much more']")).getText();
		System.out.println(search);
		

	}

}
