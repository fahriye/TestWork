package TestSignPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.crome.driver", "C:\\Users\\sinem\\Desktop\\chrome");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.trendyol.com/");
		
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement SearchBox = driver.findElement(By.className("search-box"));
		SearchBox.sendKeys("bilgisayar");
		WebElement SearchIcon = driver.findElement(By.className("search-icon"));
		SearchIcon.click();
		WebElement CheckBox = driver.findElement(By.className("fltr-item-text chckd"));
		CheckBox.click();
		
		/*WebElement element = driver.findElement(By.className("fancybox-item fancy-close"));

		if (element.isEnabled()) {
		  element.click();
		} else {
		  System.out.println("Disable");
		}*/
		js.executeScript("window.scrollBy(0,4000)");
		driver.quit();
	}

}
