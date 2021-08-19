package assignmentweek2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("yes").click();
		WebElement x=driver.findElementByXPath("(//input[@name=\"news\"])[2]");
		if (x.isSelected()) {
			System.out.println("Default button selected is Checked");	
		}
		WebElement y = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]");
		if (y.isSelected() == false) {
			y.click();
		}
		else {
			System.out.println("Age group is selected");
		}

	}

}