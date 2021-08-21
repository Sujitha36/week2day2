package assignmentweek2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicteLead {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("gmail");
		driver.findElementById("ext-gen336").click();
		String n1=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).getText();;
		System.out.println("First Lead Name is : "+n1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click(); 
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		System.out.println("Title is : "+driver.getTitle());
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String Cname=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if(n1.equals(Cname)) {
			System.out.println("Bot are same");
		}
		driver.close();
}}
