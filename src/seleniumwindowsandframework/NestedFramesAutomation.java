package seleniumwindowsandframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesAutomation {
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Durationofseconds, 10)
		driver.manage().window().maximize();

        try {
            // 1. Open the URL
            driver.get("https://the-internet.herokuapp.com/nested_frames");
            driver.manage().window().maximize();

            // 2. Switch to the top frame
            driver.switchTo().frame("frame-top");

            // 3. Verify that there are three frames on the page
            int frameCount = driver.findElements(By.tagName("frame")).size();
            if (frameCount == 3) {
                System.out.println("There are three frames on the page.");
            } else {
                System.out.println("Frame count is incorrect: " + frameCount);
            }

            // 4. Switch to the left frame
            driver.switchTo().frame("frame-left");

            // 5. Verify that the left frame has a text "LEFT"
            String leftFrameText = driver.getPageSource();
            if (leftFrameText.contains("LEFT")) {
                System.out.println("The left frame contains the text 'LEFT'.");
            } else {
                System.out.println("The left frame does not contain the text 'LEFT'.");
            }

            // 6. Switch back to the top frame
            driver.switchTo().parentFrame();

            // 7. Switch to the middle frame
            driver.switchTo().frame("frame-middle");

            // 8. Verify that the middle frame has a text "MIDDLE"
            String middleFrameText = driver.getPageSource();
            if (middleFrameText.contains("MIDDLE")) {
                System.out.println("The middle frame contains the text 'MIDDLE'.");
            } else {
                System.out.println("The middle frame does not contain the text 'MIDDLE'.");
            }

            // 9. Switch back to the top frame
            driver.switchTo().parentFrame();

            // 10. Switch to the right frame
            driver.switchTo().frame("frame-right");

            // 11. Verify that the right frame has a text "RIGHT"
            String rightFrameText = driver.getPageSource();
            if (rightFrameText.contains("RIGHT")) {
                System.out.println("The right frame contains the text 'RIGHT'.");
            } else {
                System.out.println("The right frame does not contain the text 'RIGHT'.");
            }

            // 12. Switch back to the top frame
            driver.switchTo().parentFrame();

            // 13. Switch to the bottom frame
            driver.switchTo().frame("frame-bottom");

            // 14. Verify that the bottom frame has a text "BOTTOM"
            String bottomFrameText = driver.getPageSource();
            if (bottomFrameText.contains("BOTTOM")) {
                System.out.println("The bottom frame contains the text 'BOTTOM'.");
            } else {
                System.out.println("The bottom frame does not contain the text 'BOTTOM'.");
            }

            // 15. Switch back to the top frame
            driver.switchTo().parentFrame();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the Browser instance
            driver.quit();
        }
    }
}
