package Seleniumcomponents;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class datepicker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://jqueryui.com/datepicker/");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


          try {
              // Navigate to the Datepicker page
              driver.get("https://jqueryui.com/datepicker/");
              driver.manage().window().maximize();

              // Switch to the iframe that contains the datepicker
              driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

              // Create a WebDriverWait instance
             // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
              

              // Create a WebDriverWait instance with a 10-second timeout
              WebDriverWait wait = new WebDriverWait(driver, 10); // Using seconds instead of Duration


              // Wait until the datepicker element is visible and click on it
              WebElement datepicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
              datepicker.click();

              // Select the next month
              WebElement nextMonthButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class, 'ui-datepicker-next')]")));
              nextMonthButton.click();

              // Select the date "22"
              WebElement dateToSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='22']")));
              dateToSelect.click();

              // Print the selected date on the console
              System.out.println("Selected date: " + dateToSelect.getText());
          } catch (Exception e) {
              e.printStackTrace();
          } finally {
              // Close the browser and quit the WebDriver instance
              driver.quit();
          }
	}

}
