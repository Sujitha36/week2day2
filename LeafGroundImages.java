package assignmentweek2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//label[text()='Click on this image to go home page']/following-sibling::img").click();
		driver.navigate().back();
		WebElement one = driver.findElementByXPath("//label[text()='Am I Broken Image?']/following-sibling::img");
		
		  if (one.getAttribute("href")==null) 
		  {
			  System.out.println("Image is broken"); 
			  }
		  else
		  {
		  System.out.println("Image is not broken");
		  
		  }
		 
	}

}