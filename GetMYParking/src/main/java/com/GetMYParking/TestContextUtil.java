package com.GetMYParking;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.reporters.util.*;
import org.testng.xml.XmlSuite;

public class TestContextUtil extends DriverFactory implements ITestListener, IReporter {

	private static Logger log = LogManager.getLogger(TestContextUtil.class);
	private static String timeZone = "IST";
	private static SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
	private static SimpleDateFormat sdftime = new SimpleDateFormat("HH:mm:ss a");
	private static NumberFormat integerFormat = NumberFormat.getIntegerInstance();
	private static NumberFormat decimalFormat = NumberFormat.getNumberInstance();

	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1, String arg2) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			File file = new File("");
			Date date = new Date();
			Reporter.setCurrentTestResult(result);
			log.info(file.getAbsolutePath());
			Reporter.log(file.getAbsolutePath());
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File(
						file.getAbsolutePath() + "/reports/" + date.toString() + "/" + result.getName() + ".jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			Reporter.setCurrentTestResult(result);
			Reporter.log("<a href='" + file.getAbsolutePath() + "/reports/" + System.getProperty(Constant.DEVICE_NAME)
					+ "/" + result.getName() + ".jpg'> <img src='" + file.getAbsolutePath() + "/reports/"
					+ System.getProperty(Constant.DEVICE_NAME) + "/" + result.getName()
					+ ".jpg' height='100' width='100'>click to open the link</a>");

		}

	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
