package SeleniumLocators;

//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class naviagtionsandsearchtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();

		  WebElement searchInput = driver.findElement(By.name("search"));
          searchInput.sendKeys("Artificial intelligence");
          searchInput.submit();

          // Wait for the results to load and click on the "History" section
         // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
          WebElement historyLink =driver.findElement(By.linkText("History"));
          historyLink.click();

          // Print the title of the section
          String sectionTitle = driver.getTitle();
          System.out.println("Section Title: " + sectionTitle);
	}

}
