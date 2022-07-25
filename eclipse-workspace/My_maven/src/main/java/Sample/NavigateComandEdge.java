package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateComandEdge {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "D:\\Automation drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*driver.get("http://www.yahoo.com");
		Thread.sleep(5000);*/
		driver.close();
		

	}

}
