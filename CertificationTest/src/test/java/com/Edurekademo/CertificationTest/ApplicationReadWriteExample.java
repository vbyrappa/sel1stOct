package com.Edurekademo.CertificationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import Utils.ReadExcel;

public class ApplicationReadWriteExample {
	
	@Test
	public void applicaitonTestFunctionality() throws IOException, InterruptedException{
		String[][] data2 = ReadExcel.getData("HybridFramework.xlsx", "Sheet2");
		String[][] data1 = ReadExcel.getData("HybridFramework.xlsx", "Sheet1");

		for (int k = 1; k < data1.length; k++) {
			for (int i = 1; i < data2.length; i++) {

				switch (data2[i][3]) {
				
			case "openBrowser" :
				MethodReadWriteExample.openBrowser();
				break;
				
			case "maximizeBrowser":
				MethodReadWriteExample.maximizeBrowser();
				break;
			
			case "navigate":
				MethodReadWriteExample.gotoAppl(data2[i][6]);
				break;
			
			case "clickLogin":
				MethodReadWriteExample.clickOnLogin(data2[i][5]);
			break;
			
			case "userName":
				MethodReadWriteExample.loginName(data2[i][5], data1[k][1]);
				break;
				
			case "userPassword":
				MethodReadWriteExample.loginPassword(data2[i][5], data1[k][2]);
				break;
				
			case "ClickLoginButton":
				MethodReadWriteExample.loginButton(data2[i][5]);
				break;
				
			case "searchCourse":
				MethodReadWriteExample.searchForCourse(data2[i][5], data2[i][6]);
				break;
				
			case "viewDetails":
				MethodReadWriteExample.clickOnViewButton(data2[i][5]);
				break;
				
			case "captureScreen":
				MethodReadWriteExample.captureCourseScreen(data2[i][6]);
				break;
				
			case "enrollCourse":
				MethodReadWriteExample.clickOnEnrollCourse(data2[i][5]);
				break;
				
			case "enrollScreenCapture":
				MethodReadWriteExample.screen(data2[i][6]);
				break;
				
			case "clickLogo":
				MethodReadWriteExample.cancelPayButton(data2[i][5]);
				break;
				
			case "clickUserImage":
				MethodReadWriteExample.clickUserButton(data2[i][5]);
				break;
				
			case "clickLogOut":
				MethodReadWriteExample.clickSignOut(data2[i][5]);
				break;
				
			case "closeBrowser":
				MethodReadWriteExample.closeOpenBrowser();
				break;
				}
			}
		}
	}
}