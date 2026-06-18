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

        try {
            BaseClassTest base =
                    (BaseClassTest) result.getInstance();

            String screenshotPath =
                    base.captureScreenshot(
                            result.getMethod().getMethodName());

            test.fail(result.getThrowable());

            test.addScreenCaptureFromPath(screenshotPath);
        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

    }

    @Override
    public void onFinish(ITestContext context) {

        System.out.println("Extent Report Generated");

        extent.flush();
    }
}