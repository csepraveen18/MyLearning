package homework.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		/*
		 * FirefoxDriver ff =new FirefoxDriver(); EdgeDriver Ed = new EdgeDriver();
		 */
		driver.get("http://leaftaps.com/opentaps/control/main"); 
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		 WebElement crmlink=driver.findElement(By.linkText("CRM/SFA"));
		 crmlink.click();
		String pagetitle= driver.getTitle();
		System.out.println(pagetitle);
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//a[@class='selected']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("NaveenRa");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		//driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		Select industryname =new Select(driver.findElement(By.xpath("//select[@name='industryEnumId']")));
		industryname.selectByValue("IND_SOFTWARE");  
		Select owner =new Select(driver.findElement(By.xpath("//select[@name='ownershipEnumId']")));
		owner.selectByVisibleText("S-Corporation"); 
		
		Select source =new Select(driver.findElement(By.xpath("//select[@id='dataSourceId']")));
		source.selectByVisibleText("Conference");
		Select mp =new Select(driver.findElement(By.xpath("//select[@id='marketingCampaignId']")));
		mp.selectByIndex(5);  
		//
		String a = driver.getCurrentUrl();
		System.out.println(a);
		
		
}
}