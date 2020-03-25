package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varshinik\\Documents\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
	    driver.get("https://www.selenium.dev/");
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.quit();
	}

}
