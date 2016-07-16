package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Wellsfargo {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
	
		driver = new FirefoxDriver();
		driver.get("http://www.WellsFargo.com");
		driver.manage().window().maximize();
		
	    	 WebElement PersonalObj = driver.findElement(By.xpath(".//*[@id='tabNav']/ul/li[1]"));
		    String actualObj = PersonalObj.getText();
		    String expPersonalObj = "Personal";
			if(expPersonalObj.equals(actualObj)) {
		      	System.out.println("Pass : Atual error message ' " + actualObj+ "'  match with expected error message : '"+expPersonalObj+"'.");
		    }  else {
		       	System.out.println("Fail : Atual error message ' " + actualObj+ "' is not  matching with expected error message : '"+expPersonalObj+"'.");
		    }
		
			driver.findElement(By.xpath(".//*[@id='headerTools']/nav/ul/li[2]/a")).click();
			
			WebElement AboutWF = driver.findElement(By.xpath(".//*[@id='shell']/div[1]/h1"));
		    String actualObj1 = AboutWF.getText();
		    String expPersonalObj1 = "About Wells Fargo";
			if(expPersonalObj.equals(actualObj1)) {
		      	System.out.println("Pass : Atual error message ' " + actualObj1+ "'  match with expected error message : '"+expPersonalObj1+"'.");
		    }  else {
		       	System.out.println("Fail : Atual error message ' " + actualObj1+ "' is not  matching with expected error message : '"+expPersonalObj1+"'.");
		    }
			
			driver.navigate().to("http://www.WellsFargo.com");	
			
			 WebElement PersonalObj2 = driver.findElement(By.xpath(".//*[@id='tabNav']/ul/li[1]"));
			    String actualObj2 = PersonalObj2.getText();
			    String expPersonalObj2 = "Personal";
				if(expPersonalObj.equals(actualObj2)) {
			      	System.out.println("Pass : Atual error message ' " + actualObj2+ "'  match with expected error message : '"+expPersonalObj2+"'.");
			    }  else {
			       	System.out.println("Fail : Atual error message ' " + actualObj2+ "' is not  matching with expected error message : '"+expPersonalObj2+"'.");
			    }
				
			   WebElement insurance = driver.findElement(By.xpath(".//*[@id='insuranceTab']/a"));
				Actions action = new Actions(driver);
				action.moveToElement(insurance).build().perform();
				Thread.sleep(4000);
				
				
				driver.findElement(By.xpath(".//*[@id='insurance']/div[1]/div[2]/ul/li[1]/a")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.id("zipCode")).sendKeys("95138");
				driver.findElement(By.id("c28lastFocusable")).click();
				
				File scrFile = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("C:/Users/vani/Desktop/ScreenShots/WellsFargo.jpg"));				
				
				driver.quit();
							
			   
			   
	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
