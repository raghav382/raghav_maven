package DemoPackLa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DemoMavenTest{
		
	public WebDriver driver;
	public Actions Act;
	public WebElement WE,vf,Mar;
	
	@Test
	public void Demo1Test() throws InterruptedException 
	{
		System.out.println("Thats the thing!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		driver=new ChromeDriver();
		driver.get("http://seleniumtrainingbangalore.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("First Method");
		driver.findElement(By.xpath("//button[@class='close']")).click();
		Thread.sleep(5000);
		try
		{
		WE=driver.findElement(By.xpath("//a[text()='Branches']"));
		vf=driver.findElement(By.xpath("//a[text()='Marathahalli']"));
		Mar=driver.findElement(By.xpath("//a[text()='Selenium-Training-in-Marathahalli']"));
		Act=new Actions(driver);
		Act.moveToElement(WE).perform();
		Thread.sleep(3000);
		Act.moveToElement(vf).perform();
		Thread.sleep(3000);
		Act.moveToElement(Mar).perform();
		Thread.sleep(5000);
		Act.contextClick(Mar).sendKeys(Keys.DOWN).sendKeys("T").build().perform();
		//Act.sendKeys(Keys.SHIFT).build();
		//Act.sendKeys(Keys.ARROW_DOWN).perform();
		//Act.sendKeys(Keys.ENTER).perform();
		//Act.sendKeys(Keys.ENTER).perform();
		//Act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_RIGHT).perform();
		//Thread.sleep(3000);
		//Act.moveToElement(Mar).perform();
		//Thread.sleep(5000);
		//Act.contextClick(Mar).sendKeys(Keys.ARROW_DOWN).perform();
        //Act.contextClick().keyDown(Keys.ARROW_DOWN).perform();
		//Thread.sleep(3000);
		//Act.keyDown(Keys.ARROW_DOWN).perform();
		//Act.sendKeys(Keys.SHIFT).build();
		//Act.sendKeys("T").perform();
		//Thread.sleep(5000);
	}
		catch(Exception e)
		{
		System.out.println("Something went wrong");
		}
	}
	
	@Test
	public void lookinghotTest1()
	{
System.out.println("Looking Hot");	
	}
	
	
	@Test
	public void lookinghotTest()
	{
System.out.println("Looking Hot");	
	}

	@Test
	public void addLocationTestCase() {
		System.out.println("Im in add location test case");
	}
	
	@Test
	public void addDepartmentTestCase() {
		System.out.println("Im in add department test case");
	}
	
	@Test
	public void addEmployeeTestCase() {
		System.out.println("Im in add employee test case");
	}
	@Test
	public void baseTest()
	{

	}
}
