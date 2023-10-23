import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFristTestCase {

	WebDriver driver = new EdgeDriver();

	Random rand = new Random();

	String URL = "https://www.saucedemo.com/";
	String UserName = "standard_user";

	String Password = "secret_sauce";
	
	@BeforeTest
	public void mySetup () {
		
		driver.get(URL);
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().window().maximize();
		


	}
	
	@Test()
	public void myFirstTest () {}
	
	@AfterTest
	public void myPostTesting () {}
}
