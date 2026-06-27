package baseclass;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseClassTest {

    public WebDriver driver;

    @BeforeMethod (alwaysRun = true)
    public void setUp() {
        System.out.println("Inside SearchTest BeforeMethod");


        // Initialize Chrome Browser
        //driver = new ChromeDriver();

        //initialize the browser in headless mode
        ChromeOptions options = new ChromeOptions();

        //for Headmode
        String headless = System.getProperty("headless");
        if ("true".equalsIgnoreCase(headless)){
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");

        }
        //for headlessmode
     /*   options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        System.out.println("HEADLESS MODE ENABLED");*/

        driver = new ChromeDriver(options);

        // Optional
        driver.manage().window().maximize();
        System.out.println("ChromeDriver initialized successfully");

        // Open URL
        //driver.get("https://www.google.com/");
        //driver.get("https://www.flipkart.com/");
        driver.get("https://www.shopsy.in/");
        System.out.println("Shopsy opened successfully");

    }

    @AfterMethod (alwaysRun = true)
    public void tearDown() {

        // Close browser
        if(driver != null) {
            driver.close();
        }
    }

    public String captureScreenshot(String testName) throws IOException {

        if (driver == null) {
            System.out.println("Driver is null. Screenshot cannot be captured.");
            return null;
        }

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        String destination =
                System.getProperty("user.dir") + "/Screenshots/" + testName + ".png";

        FileUtils.copyFile(source, new File(destination));

        return destination;
    }

}