package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getReport() {

        if(extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "Reports/ExtentReport.html");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo("Tester", "Rajeev");
            extent.setSystemInfo("Environment", "QA Lead");
            extent.setSystemInfo("Tool", "Selenium POM");
        }

        return extent;
    }
}