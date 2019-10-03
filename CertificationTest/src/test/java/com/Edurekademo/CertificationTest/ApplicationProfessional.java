package com.Edurekademo.CertificationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import Utils.ReadExcel;

public class ApplicationProfessional {
	
	@Test
	public void applicaitonTestFunctionality() throws IOException, InterruptedException{
		String[][] data = ReadExcel.getData("KeywordFramework.xlsx", "Sheet4");
		
		for(int i=1; i<data.length; i++){
			
			switch(data[i][3]){
			
			case "openBrowser" :
				MethodProfessional.openBrowser();
				break;
				
			case "maximizeBrowser":
				MethodProfessional.maximizeBrowser();
				break;
				
			case "navigate":
				MethodProfessional.gotoAppl(data[i][6]);
				break;
				
			case "clickLogin":
				MethodProfessional.clickLogin(data[i][5]);
				break;
				
			case "userName":
				MethodProfessional.loginName(data[i][5], data[i][6]);
				break;
				
			case "userPassword":
				MethodProfessional.loginPassword(data[i][5], data[i][6]);
				break;
				
			case "ClickLoginButton":
				MethodProfessional.loginButton(data[i][5]);
				break;
				
			case "userNameImage":
				MethodProfessional.clickUserImage(data[i][5]);
				break;

			case "clickProfile":
				MethodProfessional.clickOnProfile(data[i][5]);
				break;
				
			case "editProfessional":
				MethodProfessional.editForProfessional(data[i][5]);
				break;
				
			case "enterName":
				MethodProfessional.enterCompanyName(data[i][5], data[i][6]);
				break;
				
			case "selectIndustry":
				MethodProfessional.selectIndustryName(data[i][5], data[i][6]);
				break;
				
			case "enterSkills":
				MethodProfessional.enterRequiredSkills(data[i][5], data[i][6]);
				break;
			
			case "jobLevel":
				MethodProfessional.enterJobLevel(data[i][5], data[i][6]);
				break;
				
			case "captureScreen":
				MethodProfessional.screenProfessionalEntered(data[i][6]);
				break;
				
			case "clickNext":
				MethodProfessional.professionalNext(data[i][5]);
				break;
				
			case "careerNext":
				MethodProfessional.careerNext(data[i][5]);
				break;
				
			case "saveOther":
				MethodProfessional.otherNext(data[i][5]);
				break;
				
			case "updProfile":
				MethodProfessional.verifyProfile(data[i][5]);
				break;
				
			case "clickProfDetails":
				MethodProfessional.checkProfDetails(data[i][5]);
				break;
				
			case "checkUpdProf":
				MethodProfessional.verifyUpdProf(data[i][6]);
				break;
			}		
		}
	}
}