package assignmentweek2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("srisuji@yahoo.com");
		WebElement chng=driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input"));
		chng.sendKeys("Suji");
		chng.sendKeys(Keys.TAB);
		WebElement two=driver.findElement(By.name("username"));
		System.out.println(two.getAttribute("value"));	
	    driver.findElement(By.xpath("(//div[@class='row'])[4]//input")).clear();
	    WebElement three=driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input"));
	  if (three.isEnabled()) {
		  System.out.println("Field is editable");
	  }
		  else {
			System.out.println("Non editable");
		}
	} 	   
		
	}


