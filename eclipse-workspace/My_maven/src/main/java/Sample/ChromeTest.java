package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		String a=driver.getTitle();
		System.out.println(a);
		if(a.equals("Google"))
				{
			System.out.println("correct tiltle");
			
				}
		else
		{
			System.out.println("wroung title");
		}
		String s=driver.getCurrentUrl();
		System.out.println(s);
		if(s.equals("https://www.google.com/"))
		{
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");
		}
		String b=driver.getPageSource();
		System.out.println(b);
		
		driver.close();
	}

}
