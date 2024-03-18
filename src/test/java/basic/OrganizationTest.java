package basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import commonUtils.ExcelUtil;
//import commonUtils.Javautil;


public class OrganizationTest {
	@Test
	public void CreateorganizationnsTest() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		PropertyFileUtil putil=new PropertyFileUtil();
		WebdriverUtil wutil=new WebdriverUtil();
		
		//ExcelUtil eutil=new ExcelUtil();
		//Javautil jutil=new Javautil();
		
		//public void organizationTest() throws InterruptedException, IOException {
			
			WebDriver d=new ChromeDriver();
			//String URL = putil.getDataFromPropertyFile("url");
			
			wutil.maximize(d);
			//d.manage().window().maximize();
			//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			wutil.implicitwait(d);
			
			//to read data from property file
			String URL = putil.getDataFromPropertyFile("url");
			String USERNAME = putil.getDataFromPropertyFile("username");
			String PASSWORD = putil.getDataFromPropertyFile("password");
			
			//to read data from exceel
			//String orgname = eutil.getDataFromExcel("Organizations", 0, 1);
			//String group = eutil.getDataFromExcel("Organizations", 1, 1);
			
			
			d.get(URL);
			d.findElement(By.name("user_name")).sendKeys(USERNAME);
			d.findElement(By.name("user_password")).sendKeys(PASSWORD);
			
			d.findElement(By.id("submitButton")).click();
		}
	}


