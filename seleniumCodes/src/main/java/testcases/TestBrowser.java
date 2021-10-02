package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowser {

	public static void main(String[] args) {
		
		System.out.println("Started Firefox");
		try {
		System.setProperty("webdriver.gecko.driver", "F:\\SOFTWARE\\Selenium Software's\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://way2automation.com");
		}
		catch(Exception IO)
		{
			System.out.println("Exception occured");
		}
		
		System.out.println("Starting with Chrome");
		
		try {
			System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE\\Selenium Software's\\chromedriver.exe");
			ChromeDriver driver1 = new ChromeDriver();
			driver1.get("https://www.qspiders.com/");
		}
		catch(Exception IO)
		{
			System.out.println("Let me find out the error");
		}

		System.out.println("Starting with Internet Explorer");
		
		try {
			System.setProperty("webdriver.ie.driver", "F:\\SOFTWARE\\Selenium Software's\\IEDriverServer.exe");
			InternetExplorerDriver driver2 = new InternetExplorerDriver();
			driver2.get("https://www.udemy.com/");
		}
		catch(Exception IO)
		{
			System.out.println("Let me find out the error");
		}
		
		System.out.println("Starting with Edgd Browser");
		
		try {
			System.setProperty("webdriver.edge.driver", "F:\\SOFTWARE\\Selenium Software's\\msedgedriver.exe");
			EdgeDriver driver3 = new EdgeDriver();
			driver3.get("https://www.google.com/");
		}
		catch(Exception IO)
		{
			System.out.println("Let me find out the error");
		}
	}

}
