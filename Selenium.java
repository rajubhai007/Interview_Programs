import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Driver_Browsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.ebay.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		
		
				//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("cricket bat");
				//Thread.sleep(2000);
				//driver.findElement(By.xpath("//input[contains(@value,'Search')]")).click();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.xpath("//input[@id='btnLogin')]")).click();
Actions act=new Actions(driver);
act.sendKeys(Keys.CONTROL+"c");



		//driver.quit();
	}

}
