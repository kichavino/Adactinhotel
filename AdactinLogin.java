package adactin.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinLogin {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIYYAPPAN.K.M\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://adactinhotelapp.com/");
			WebElement word = a.findElement(By.xpath("//p[contains(text(),'Launches')]"));
			String data = word.getText();
			System.out.println(data);
			
		
	}

}
