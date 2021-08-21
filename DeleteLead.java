package assignmentweek2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("Phone")).click();
driver.findElement(By.name("phoneNumber")).sendKeys("453");
driver.findElementById("ext-gen334").click();
Thread.sleep(20000);
WebElement id=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
String val=id.getText(); 
id.click(); 
 //Thread.sleep(20000);
 driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
 driver.findElement(By.linkText("Find Leads")).click();
driver.findElementByXPath("//input[@name='id']").sendKeys(val);
driver.findElementById("ext-gen334").click();
WebElement rec=driver.findElement(By.xpath("//div[text()='No records to display']"));
if(rec.isDisplayed()==true) {
	System.out.println("Recored deleted");
}
driver.close();
	}

}