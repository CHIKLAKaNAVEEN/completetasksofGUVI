package SeleniumLocators;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyingpagetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
//		driver.findElement(By.id("nava")).getAttribute("Product Store");
		String title=driver.getTitle();
		System.out.println("This is  page title:" + title);
		//String expectedtitle="store";
	    if ("STORE".equals(title)) {
            System.out.println("Page landed on the correct website.");
        } else {
            System.out.println("Page not landed on the correct website.");
        }
			
	
	}
	

}
