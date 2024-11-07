package seleniumwindowsandframework;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Durationofseconds, 10)
		driver.manage().window().maximize();

        try {
            // 1. Open the browser and navigate to the URL
            driver.get("https://the-internet.herokuapp.com/windows");
  

            // 2. Click the "Click Here" button to open a new window
            WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
            clickHereButton.click();

            // 3. Switch to the newly opened Window
            ArrayList<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(windowHandles.get(1)); // Switch to the new window

            // 4. Verify that the text "New Window" is present on the page
            WebElement newWindowText = driver.findElement(By.tagName("h3"));
            if (newWindowText.getText().equals("New Window")) {
                System.out.println("Text 'New Window' is present on the page.");
            } else {
                System.out.println("Text 'New Window' is NOT present on the page.");
            }

            // 5. Close the new Window
            driver.close();

            // 6. Switch back to the original window
            driver.switchTo().window(windowHandles.get(0)); // Switch back to the original window

            // 7. Verify that the Original window is active
            String originalWindowTitle = driver.getTitle();
            if (originalWindowTitle.equals("The Internet")) {
                System.out.println("Switched back to the original window successfully.");
            } else {
                System.out.println("Failed to switch back to the original window.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 8. Close the Browser instance
        
        //    driver.quit();
        }
    }

}
