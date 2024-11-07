package Seleniumcomponents;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signupandloginprocess {
	public static void main(String[] args) {
        // Set up the WebDriver
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Durationofseconds, 10)
		driver.manage().window().maximize();

        try {
            // 1. Launch the website
            driver.get("https://www.guvi.in/");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.manage().window().maximize();

            // 2. Locate the signup button and click on it
       
            WebElement signupButton = driver.findElement(By.xpath("//a[text()='Sign up']"));
            signupButton.click();

            // 3. Fill in the signup form
            driver.findElement(By.id("name")).sendKeys("Your Name");
            driver.findElement(By.id("email")).sendKeys("your_email@example.com");
            driver.findElement(By.id("password")).sendKeys("your_password@123");

            // 4. Click on the Signup button
            driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

            // 5. Wait for the page to load and verify registration
            driver.findElement(By.xpath("//h1[text()='Welcome']")); // Adjust as needed
            System.out.println("User registered successfully.");

            // 6. Locate the login button and click on it
            WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
            loginButton.click();

            // 7. Fill in the login form
            driver.findElement(By.name("email")).sendKeys("your_email@example.com");
            driver.findElement(By.name("password")).sendKeys("your_password");

            // 8. Click on the Login button
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            // 9. Wait for the page to load and verify login
           driver.findElement(By.xpath("//h1[text()='Dashboard']")); // Adjust as needed
            System.out.println("User logged in successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 10. Close the browser
            driver.quit();
        }
    }

}
