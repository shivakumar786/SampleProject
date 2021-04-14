package sample;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NewSample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\NewSelenium\\SampleProject\\driver\\geckodriver.exe");
		

		WebDriver driver = new  FirefoxDriver();
		driver.get("https://www.youtube.com/");
		

	}

}
