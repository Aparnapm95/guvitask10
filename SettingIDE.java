package taskselenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SettingIDE {

	private static String current;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title=driver.getTitle();
			String expectedtitle="STORE";
		System.out.println("Title is:"+title);
		
		String current = driver.getCurrentUrl();
		System.out.println(current);
		
		if (title.equals(expectedtitle)) {
            System.out.println("Title matches: " + title);
        } else {
            System.out.println("Title does not match. Found: " + title);
        }
		
		driver.quit();
		

	}

}
