package tests;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;

public class TestListener implements ITestListener {
WebDriver driver;

    public void onTestStart(ITestResult iTestResult) {
        System.out.println((String.format("======================================== STARTING TEST %s ========================================", iTestResult.getName())));

    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(String.format("======================================== FINISHED TEST %s Duration: %ss ========================================", iTestResult.getName(),
                getExecutionTime(iTestResult)));

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(String.format("======================================== FAILED TEST %s Duration: %ss ========================================", iTestResult.getName(),
                getExecutionTime(iTestResult)));

    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println(String.format("======================================== SKIPPING TEST %s ========================================", iTestResult.getName()));

    }
    @Attachment(value = "Page screenshot", type = "image/png")

    public byte[] takeScreenshot(WebDriver driver) {
        Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }



    private long getExecutionTime(ITestResult iTestResult) {
        return TimeUnit.MILLISECONDS.toSeconds(iTestResult.getEndMillis() - iTestResult.getStartMillis());
    }
}
