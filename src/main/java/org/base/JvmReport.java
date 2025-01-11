package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJVMreport(String json) {
		//where to store the file
				
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
				
		//configuration----> Additional details of test case
				
				Configuration con=new Configuration(loc,"Magneto");
				con.addClassifications("browsername", "Chrome");
				con.addClassifications("OS", "Windows 10");
				con.addClassifications("Environment", "QA");
				con.addClassifications("Sprint", "20");
				con.addClassifications("Tester", "Ramaneeyan");
				
		//ReportBuilder------------>Generate Report		
				List<String> jsonfiles=new LinkedList<String>();
				jsonfiles.add(json);
				ReportBuilder r = new ReportBuilder(jsonfiles,con);
				r.generateReports();
				
				
				
				

			}

}
