package seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Trial {
	@Test
	public void windows() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Macbook/OneDrive/Desktop/popup.html");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
	}
}