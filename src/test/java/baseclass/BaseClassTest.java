package baseclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseClassTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Initialize Chrome Browser
        driver = new ChromeDriver();

        // Optional
        driver.manage().window().maximize();

        // Open URL
        //driver.get("https://www.google.com/");
        //driver.get("https://www.flipkart.com/");
        driver.get("https://www.shopsy.in/");
    }

    @AfterMethod
    public void tearDown() {

        // Close browser
        if(driver != null) {
            driver.close();
        }
    }

 /*   public String captureScreenshot(String testName) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        String destination =
                System.getProperty("C:\\Users\\Rajeev Kesharwani\\IdeaProjects\\Selenium_Practice\\Screenshots")
                        + "/Screenshots/" + testName + ".png";

        FileUtils.copyFile(source, new File(destination));

        return destination;
    }*/
}