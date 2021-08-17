package assignmentweek2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		WebElement x=driver.findElement(By.id("position"));
		System.out.println("Postion is : "+x.getLocation());
		WebElement y=driver.findElement(By.id("color"));
		System.out.println("Color is : "+y.getCssValue("background-color"));
		WebElement z=driver.findElementById("size");
		System.out.println("Size is : "+z.getSize());
	}

}
