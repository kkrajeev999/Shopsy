package utilities;

import com.aventstack.extentreports.*;
import org.testng.*;

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
    }

    @Override
    public void onFinish(ITestContext context) {

        System.out.println("Extent Report Generated");

        extent.flush();
    }
}