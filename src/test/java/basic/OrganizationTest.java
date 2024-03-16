package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationTest {
	@Test
	public void CreateorganizationnsTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
	}

}
