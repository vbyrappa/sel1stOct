package com.Edurekademo.CertificationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import Utils.ReadExcel;

public class ApplicationBlogModule9 {
	
	@Test
	public void applicaitonTestFunctionality() throws IOException, InterruptedException{
		String[][] data = ReadExcel.getData("Module9.xlsx", "Sheet1");
		
		for(int i=1; i<data.length; i++){
			
			switch(data[i][3]){
			
			case "openBrowser" :
				MethodBlogModule9.openBrowser();
				break;
				
			case "maximizeBrowser":
				MethodBlogModule9.maximizeBrowser();
				break;
			
			case "navigate":
				MethodBlogModule9.gotoAppl(data[i][6]);
				break;
			
			case "clickLogin":
				MethodBlogModule9.clickLogin(data[i][5]);
			break;
			
			case "userName":
				MethodBlogModule9.loginName(data[i][5], data[i][6]);
				break;
				
			case "userPassword":
				MethodBlogModule9.loginPassword(data[i][5], data[i][6]);
				break;
				
			case "ClickLoginButton":
				MethodBlogModule9.loginButton(data[i][5]);
				break;
				
			case "clickonCommunity":
				MethodBlogModule9.clickToOpenBlog(data[i][5]);
				break;
				
			case "blog":
				MethodBlogModule9.clickBlog(data[i][5]);
				break;
				
			case "softTesting":
				MethodBlogModule9.learningTesting(data[i][5]);
				break;
				
			case "searchSel":
				MethodBlogModule9.qaSelenium(data[i][5]);
				break;
				
			case "captureScreen":
				MethodBlogModule9.captureTopSel(data[i][6]);
				break;			
				
			case "variousSelComp":
				MethodBlogModule9.qaVariousSel(data[i][5]);
				break;			
				
			case "captureSelComp":
				MethodBlogModule9.captureCompSel(data[i][6]);
				break;			
			
			case "setPropSel":
				MethodBlogModule9.setpropSel(data[i][5]);
				break;		
				
			case "quitBrowser":
				MethodBlog.closeOpenBrowser();
				break;
			}
		}
	}
}

