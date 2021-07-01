package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ConfigurationReader;
import utils.Driver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo extends testGoogleSearch {
    static ExtentTest test;
    static ExtentReports report;
    @BeforeClass
    public static void startTest()
    {
        report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
        test = report.startTest("ExtentDemo");
    }
    @Test
    public void extentReportsDemo() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:SubmittalExchange_TFSQAAutomation3rdpartychromechromedriver.exe");
        setUpMethod();

        if(testGoogleSearchBox() == true)
        {
            test.log(LogStatus.PASS, "Checking the given word in Google Search");
        }
        else
        {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }
    @AfterClass
    public static void endTest()
    {
        report.endTest(test);
        report.flush();
    }
}
