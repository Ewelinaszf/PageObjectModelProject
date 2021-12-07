package listeners;

import base.Page;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import utilities.Utilities;


import java.io.IOException;
import java.util.Locale;

public class CustomListeners extends Page implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(LogStatus.PASS, result.getName().toUpperCase(Locale.ROOT)+" PASS");
        rep.endTest(test);
        rep.flush();
    }
    @Override
    public void onTestStart(ITestResult result) {
        test = rep.startTest(result.getName().toUpperCase(Locale.ROOT));

    }


    @Override
    public void onTestFailure(ITestResult result) {
        System.setProperty("org.uncommons.reportng.escape-output","false");
        try {
            Utilities.captureScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }

        test.log(LogStatus.FAIL, result.getName().toUpperCase(Locale.ROOT)+" FAILED with exception: "+ result.getThrowable());
        test.log(LogStatus.FAIL, test.addScreenCapture(Utilities.screenshotName));

        Reporter.log("<a target=\"_blank\" href="+ Utilities.screenshotName+">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<a target=\"_blank\" href="+ Utilities.screenshotName+"><img src="+ Utilities.screenshotName+" height=200 width=200></img></a>");
        rep.endTest(test);
        rep.flush();

    }



    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(LogStatus.SKIP, result.getName().toUpperCase(Locale.ROOT)+" Skipped with exception: "+ result.getThrowable());
        rep.endTest(test);
        rep.flush();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
      
    }
}
