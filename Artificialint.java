package taskselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Artificialint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement((By.name("q")));
		searchBox.sendKeys("Artificial Intelligence");
		searchBox.sendKeys(Keys.RETURN);
		driver.close();
	}

}
