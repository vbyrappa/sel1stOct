package com.Edurekademo.CertificationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import Utils.ReadExcel;

public class ApplicationLaunch {
	
	@Test
	public void applicaitonTestFunctionality() throws IOException, InterruptedException{
		String[][] data = ReadExcel.getData("KeywordFramework.xlsx", "Sheet1");
		
		for(int i=1; i<data.length; i++){
			
			switch(data[i][3]){
			
			case "openBrowser" :
				MethodLaunch.openBrowser();
				break;
				
			case "maximizeBrowser":
				MethodLaunch.maximizeBrowser();
				break;
			
			case "navigate":
				MethodLaunch.gotoAppl(data[i][6]);
				break;
			
			case "clickLogin":
				MethodLaunch.clickLogin(data[i][5]);
			break;
			
			case "userName":
				MethodLaunch.loginName(data[i][5], data[i][6]);
				break;
				
			case "userPassword":
				MethodLaunch.loginPassword(data[i][5], data[i][6]);
				break;
				
			case "ClickLoginButton":
				MethodLaunch.loginButton(data[i][5]);
				break;
				
			case "myCourseScreen":
				MethodLaunch.screenImageLogOut(data[i][6]);
				break;
	
			case "userNameImage":
				MethodLaunch.userNameClick(data[i][5]);
				break;
				
			case "logOut":
				MethodLaunch.clickLogOut(data[i][5]);
				break;
					
			case "Browserclosed":
				MethodLaunch.closeOpenBrowser();
				break;
				}
			}
		}
	}	
