/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.framework.listeners;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import org.testng.ISuite;
import org.testng.ISuiteListener;


public class CucumberReport implements ISuiteListener {
	
//	public final Logger oLog = LoggerHelper.getLogger(CucumberReport.class);
	
	@Override
	public void onStart(ISuite suite) {
		
	}

	@Override
	public void onFinish(ISuite suite) {
		try {
			
			File jsonfile = new File("target/");
			File reportOutputDirectory = new File("target/cucumber-reports-merged/");
			
			String[] fileNames = jsonfile.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					if(name.endsWith(".json"))
						return true;
					return false;
				}
			});
			
			for (int i = 0; i < fileNames.length; i++) {
				System.out.println("Absolute path: " + jsonfile.getAbsolutePath());
				System.out.println("fileNames[i]: " + fileNames[i]);
				fileNames[i] = jsonfile.getAbsolutePath() + "/" + fileNames[i];
			}
			
			List<String> jsonFiles = Arrays.asList(fileNames);
			
			Configuration configuration = new Configuration(reportOutputDirectory, suite.getName());
			System.out.println("reportOutputDirectory: " + reportOutputDirectory);
//			configuration.setStatusFlags(true, true, true,true);

			ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
			reportBuilder.generateReports();
			System.out.println("Report Generated : " + configuration.getReportDirectory());

		} catch (Exception e) {
			System.out.println("Exception e : " + e);
		}
	}

}
