package com.Edurekademo.CertificationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import Utils.ReadExcel;

public class ApplicationWishList {
	
	@Test
	public void applicaitonTestFunctionality() throws IOException, InterruptedException{
		String[][] data = ReadExcel.getData("KeywordFramework.xlsx", "Sheet3");
		
		for(int i=1; i<data.length; i++){
			
			switch(data[i][3]){
			
			case "openBrowser" :
				MethodWishList.openBrowser();
				break;
				
			case "maximizeBrowser":
				MethodWishList.maximizeBrowser();
				break;
			
			case "navigate":
				MethodWishList.gotoAppl(data[i][6]);
				break;
			
			case "clickLogin":
				MethodWishList.clickLogin(data[i][5]);
			break;
			
			case "userName":
				MethodWishList.loginName(data[i][5], data[i][6]);
				break;
				
			case "userPassword":
				MethodWishList.loginPassword(data[i][5], data[i][6]);
				break;
				
			case "ClickLoginButton":
				MethodWishList.loginButton(data[i][5]);
				break;
				
			case "searchCourse":
				MethodWishList.searchWishCourse(data[i][5], data[i][6]);
				break;
				
			case "wishClick":
				MethodWishList.clickOnWishCourse(data[i][5]);
				break;
				
			case "viewDetails":
				MethodWishList.viewWishCourseDetails(data[i][5]);
				break;
						
			case "captureScreen":
				MethodWishList.screenWishCourse(data[i][6]);
				break;
				
			case "enrollCourse":
				MethodWishList.enrollWishCourse(data[i][5]);
				break;
				
			case "enrollScreenCapture":
				MethodWishList.enrollWishCourseCapture(data[i][6]);
				break;
			
			case "closeBrowser":
				MethodWishList.applClose();
				break;
			}
		}
	}
}