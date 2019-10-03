package com.Edurekademo.CertificationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import Utils.ReadExcel;

	public class ApplicationBlog {
		
		@Test
		public void applicaitonTestFunctionality() throws IOException, InterruptedException{
			String[][] data = ReadExcel.getData("KeywordFramework.xlsx", "Sheet2");
			
			for(int i=1; i<data.length; i++){
				
				switch(data[i][3]){
				
				case "openBrowser" :
					MethodBlog.openBrowser();
					break;
					
				case "maximizeBrowser":
					MethodBlog.maximizeBrowser();
					break;
				
				case "navigate":
					MethodBlog.gotoAppl(data[i][6]);
					break;
				
				case "clickLogin":
					MethodBlog.clickLogin(data[i][5]);
				break;
				
				case "userName":
					MethodBlog.loginName(data[i][5], data[i][6]);
					break;
					
				case "userPassword":
					MethodBlog.loginPassword(data[i][5], data[i][6]);
					break;
					
				case "ClickLoginButton":
					MethodBlog.loginButton(data[i][5]);
					break;
					
				case "clickonCommunity":
					MethodBlog.clickToOpenBlog(data[i][5]);
					
				case "blog":
					MethodBlog.clickBlog(data[i][5]);
					break;
					
//				case "popUp":
//					MethodBlog.clickArticle(data[i][5]);
//					break;
//					
//				case "clickonCourse":
//					MethodBlog.courseSearchBlog(data[i][5]);
//					break;
//					
//				case "seleniumCourse":
//					MethodBlog.courseBlog(data[i][5]);
//					break;
					
				case "interviewQuestions":
					MethodBlog.questionsBlog(data[i][5]);
					break;
					
				case "selectCourse":
					MethodBlog.courseBlog(data[i][5]);
					break;
					
				case "topIntQuestions":
					MethodBlog.interviewQuestions(data[i][5]);
					break;
					
				case "TakeScreenshot":
					MethodBlog.screenQuestion(data[i][6]);
					break;
					
				case "quitBrowser":
					MethodBlog.closeOpenBrowser();
					break;
					
				}
			}
		}
	}
