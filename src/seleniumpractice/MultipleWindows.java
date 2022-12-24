package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows {
	@Test
	public void windows() {
		try {
			System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/div[4]/span/a")).click();
			Thread.sleep(2000);
			Set<String> win = driver.getWindowHandles();
			Object[] arr = win.toArray();
			driver.switchTo().window(arr[0].toString());
			Thread.sleep(2000);
			driver.switchTo().window(arr[1].toString());
			driver.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
	
	}
}
