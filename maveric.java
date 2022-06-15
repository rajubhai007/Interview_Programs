import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maveric {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Driver_Browsers\\geckodriver.exe");

		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		// TODO Auto-generated method stub
		
		
		
		//WebElement country=driver.findElement(By.xpath("//table[@id='countries']"));
		

		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='countries']/tbody/tr"));
		List<WebElement> colums=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr/td"));
		
		//List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='hasVisited']"));
		
		int rwsize=rows.size();
		int clmsize=colums.size();
		System.out.println(rwsize);
		System.out.println(clmsize);
		
		String Bxp="//*[@id='countries']/tbody/tr[";
		String Axp= "]/td[2]";
		
		for(int i=1;i<=rwsize;i++) {
			
			
			//System.out.print(driver.findElement(By.xpath("//*[@id='countries']/tbody/tr[" + i + "]/td[2]")).getText()+ " ");//*[@id="countries"]/tbody
				String Country=driver.findElement(By.xpath(Bxp+ i +Axp)).getText();
				//System.out.println(Country);
				if(Country.contains("India")) 
				{
					driver.findElement(By.xpath("//*[@id='countries']/tbody/tr["+i+"]/td[1]/input")).click();
				}
				}
		
			
			//if()
		}
		

	}

	


