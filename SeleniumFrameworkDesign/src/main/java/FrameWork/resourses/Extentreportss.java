package FrameWork.resourses;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportss {

	public static ExtentReports getReportsObjects() {
		//ExtentReport  ExtentSparkReporter
				String path = System.getProperty("user.dir")+"\\reports\\index.html";
				ExtentSparkReporter report = new ExtentSparkReporter(path);
				report.config().setReportName("Web Automation Report(RMG classified)");
				report.config().setDocumentTitle("Royal Mail Group Report");
				
				ExtentReports extent = new ExtentReports();
				extent.attachReporter(report);
				extent.setSystemInfo("Tester","Shirish Mistari");
				return extent;
	}
}
