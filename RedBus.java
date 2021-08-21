package assignmentweek2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

//Type Chennai in From textBox and ENTER
		WebElement A = driver.findElement(By.id("src"));
		A.sendKeys("Chennai");
		driver.findElement(By.xpath("//section[@id='search']/div/div[1]/div/ul/li[1]")).click();
		
//Type Bengaluru in Destination textBox and ENTER 
		WebElement B = driver.findElement(By.id("dest"));
		B.sendKeys("Bengaluru");
		driver.findElement(By.xpath("//section[@id='search']/div/div[2]/div/ul/li[1]")).click();
		
//Choose any date in JULY
		driver.findElementById("onward_cal").click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//tbody/tr[7]/td[5]")).click();
		
//Click Search Buses
		driver.findElement(By.id("search_btn")).click();

//Close the popup using the X button at the right corner
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@class='close']/i")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@class='close-primo']/i")).click();

		
//Print the number of search results
		WebElement C = driver.findElement(By.xpath("//div[@class='search']/div[2]/div[2]/div[2]/div/span[1]/span"));
		System.out.println("Number of results found are : " + C.getText());
		
//Choose only Sleeper Bus
		driver.findElement(By.xpath("//div[@id='filter-block']/div/div[2]/ul[3]/li[2]/label")).click();
		
//Print the number of search results of sleeper
		WebElement D = driver.findElement(By.xpath("//div[@class='search']/div[2]/div[2]/div[3]/div/span[1]/span"));
		System.out.println("Number of search result for Sleeper is : " + D.getText());
		
//Deselect the sleeper Bus and select the AC bus alone
		driver.findElement(By.xpath("//div[@id='filter-block']/div/div[2]/ul[3]/li[2]/label[1]")).click();
		driver.findElement(By.xpath("//input[@id='bt_AC']/../label")).click();
		
//search resut of AC buses
		WebElement E = driver.findElement(By.xpath("//div[@id='filter-block']/following-sibling::div/div[3]/div/span[1]/span"));
		System.out.println("Number of Search result for AC is : " + E.getText());
		
//Choose also Non AC buses
		WebElement G=driver.findElement(By.xpath("//input[@id='bt_NONAC']/../label[1]"));
		Thread.sleep(40000);
		G.click();

//Print the number of search results		
		WebElement F=driver.findElement(By.xpath("//div[@id='filter-block']/following-sibling::div/div[3]/div/span[1]/span"));
		System.out.println("Number search results for Ac and NON-AC is : "+F.getText());
	}

}

