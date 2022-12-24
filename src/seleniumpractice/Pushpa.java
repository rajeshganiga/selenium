package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pushpa {
	@Test
	public void testing() {
		System.setProperty("webdriver.chrome.driver",
				"D://selenium files//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		String name1 = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[4]/td")).
		getText();
		driver.get("https://www.imdb.com/title/tt9389998/");
		String name2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[4]/ul/li[2]/div/ul/li[1]/a")).
		getText();
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("both are same");
		}
	}
}
