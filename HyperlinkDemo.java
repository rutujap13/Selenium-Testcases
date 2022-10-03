package rutuja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkDemo {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		String baseURL = ("F:\\HTML Pages\\HTML Pages");
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td[1]/a")).click();
		Thread.sleep(8000);
		
		//Using linkText locator
		driver.findElement(By.linkText("CLICK HERE!")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		//Using partialLinkText locator
		driver.findElement(By.partialLinkText("ME")).click();

		System.out.println("The page title is : " + driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}

	}


