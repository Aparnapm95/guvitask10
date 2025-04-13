package taskselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);
		driver.close();		

	}

}
