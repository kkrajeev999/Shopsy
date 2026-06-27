package utilities;

import baseclass.BaseClassTest;
import com.aventstack.extentreports.*;
import org.testng.*;

import java.io.IOException;

public class ExtentListener implements ITestListener {

    ExtentReports extent = ExtentManager.getReport();

    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("Test Started");

        test = extent.createTest(
                result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        try {

            BaseClassTest base = (BaseClassTest) result.getInstance();

            if (base != null && base.driver != null) {

                String screenshotPath =
                        base.captureScreenshot(result.getMethod().getMethodName());

                if (screenshotPath != null) {
                    test.addScreenCaptureFromPath(screenshotPath);
                }

            } else {

                System.out.println("Driver is null. Screenshot not captured.");

            }

        } catch (Exception e) {

            test.warning("Screenshot could not be captured: " + e.getMessage());
            e.printStackTrace();

        }

    }

    @Override
    public void onFinish(ITestContext context) {

        System.out.println("Extent Report Generated");

        extent.flush();
    }
}