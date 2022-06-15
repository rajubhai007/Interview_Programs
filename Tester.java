import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Driver_Browsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
			      String url = "https://www.tutorialspoint.com/index.htm";
			      driver.get(url);
			      driver.manage().window().maximize();
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			      //getting color attribute with getCssValue()
			      String colr = driver.findElement(By.xpath("//*[text()=’GATE Exams’]"))
			      .getCssValue("color");
			      //getting background color attribute with getCssValue()
			      String bckgclr = driver.findElement(By.xpath("//*[text()=’ ’GATE Exams’]"))
			      .getCssValue("background-color");
			      System.out.println(colr);
			      System.out.println(bckgclr);
			      driver.close();
}
}
