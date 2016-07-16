package test;

import java.lang.reflect.Method;

public class AmazonExecution {

	public static void main(String[] args) throws Exception {
	
	//	AmazonAutomationScripts.TestID001();
	//	AmazonAutomationScripts.TestID002();
	//	AmazonAutomationScripts.TestID003();
	//	AmazonAutomationScripts.TestID004();
	//	AmazonAutomationScripts.TestID005();
	//	AmazonAutomationScripts.TestID006();
	//	AmazonAutomationScripts.TestID007();
	//	AmazonAutomationScripts.TestID008();
	//	AmazonAutomationScripts.TestID009();
	//	AmazonAutomationScripts.TestID0010();
	//	AmazonAutomationScripts.TestID0011();
	//	AmazonAutomationScripts.TestID0012();
		
	
		
		
		
		
		String [][] recData =AmazonAutomationScripts.readExcel("C:/Users/vani/Desktop/EXE_Files/AmazonSuit_Copy.xls", "Sheet1");

		String automationScript ;
		
		for(int i=1;i<recData.length;i++){
			
			automationScript = recData[i][1];

				Method ts = AmazonAutomationScripts.class.getMethod(automationScript);
				ts.invoke(ts);

				}
		
		
	
	}
		
		
	
	}

