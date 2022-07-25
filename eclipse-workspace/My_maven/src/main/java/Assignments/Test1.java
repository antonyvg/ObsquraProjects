package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.opesmount.in/grocerystore1/");
		Thread.sleep(5000);
		String s=driver.getTitle();
		System.out.println(s);
		if(s.equals("Grocerystore"))
		{
				System.out.println("title matches");
		}
		else
		{
			System.out.println("wroung title");
		}
		String a=driver.getCurrentUrl();
		System.out.println(a);
		driver.close();
			

	}

}
