package homework.week2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewFBAccount {
	public static void main(String[] args) {
		/*
		 * ChromeDriver driver=new ChromeDriver();
		 * 
		 * FirefoxDriver ff =new FirefoxDriver(); EdgeDriver Ed = new EdgeDriver();
		 * 
		 * driver.get("https://www.facebook.com/"); driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 * driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("praveen"
		 * ); driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rao");
		 * Select Day= new
		 * Select(driver.findElement(By.xpath("//select[@aria-label='Day']")));
		 * Day.selectByValue("19"); Select Month= new
		 * Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));
		 * Month.selectByValue("1"); Select Year= new
		 * Select(driver.findElement(By.xpath("//select[@aria-label='Year']")));
		 * Year.selectByValue("1990");
		 * driver.findElement(By.xpath("//label[text()='Male']")).click();
		 * driver.findElement(By.
		 * xpath("//input[@aria-label='Mobile number or email address']")).sendKeys(
		 * "9884080877");
		 * driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys(
		 * "pass");
		 */
		List<String> add = new ArrayList<String>();
		add.add("praveen");
		add.add("vamika");
		add.add("vamika");
		add.add("loveall");
		System.out.println(add);
		
	}
}
