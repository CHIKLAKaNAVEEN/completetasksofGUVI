package Seleniumcomponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Durationofseconds, 10)
		driver.manage().window().maximize();
		
		 try {
	            // Navigate to the Droppable page
	            driver.get("https://jqueryui.com/droppable/");
	            driver.manage().window().maximize();

	            // Switch to the iframe that contains the droppable elements
	            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

	            // Create WebDriverWait instance
	           // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	            // Find the source and target elements
	            WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
	            WebElement target = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));

	            // Perform the drag and drop operation
	            Actions actions = new Actions(driver);
	            actions.dragAndDrop(source, target).perform();

	            // Verify the drag and drop operation by checking the color property of the target element
	            String targetColor = target.getCssValue("background-color");
	            System.out.println("Target color after drop: " + targetColor);
	            if (targetColor.equals("rgba(0, 128, 0, 1)")) { // Check for green background
	                System.out.println("Drag and drop operation was successful.");
	            } else {
	                System.out.println("Drag and drop operation failed.");
	            }

	            // Verify that the text of the target element has changed to "Dropped!"
	            String targetText = target.getText();
	            if (targetText.equals("Dropped!")) {
	                System.out.println("Target text is correct: " + targetText);
	            } else {
	                System.out.println("Target text is incorrect: " + targetText);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser and quit the WebDriver instance
	            driver.quit();
	        }
	    

	}

}
