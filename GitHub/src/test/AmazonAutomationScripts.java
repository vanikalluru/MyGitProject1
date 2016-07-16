package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonAutomationScripts extends AmazonReusableMethods{
	static WebDriver driver;

	public static void TestID001() throws IOException, InterruptedException {
		System.out.println("TestID001");

		startReport("Test ID 001", "C:/Users/vani/Desktop/EXE_Files/Report/");
		AmazonModule.LaunchApplication("https://www.amazon.com/");	

		bw.close();
		driver.close();	
	}	


	public static void TestID002() throws IOException, InterruptedException {

		System.out.println("TestID002");
		
		startReport("Test ID 002", "C:/Users/vani/Desktop/EXE_Files/Report/");
		AmazonModule.LaunchApplication("https://www.amazon.com/");		

		WebElement IPhone = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(IPhone,"Iphone", "Iphone");

		WebElement AllDepts = driver.findElement(By.xpath(".//*[@id='issDiv0']"));
		String ExpItem = "iphone 6s case in All Departments";
		validateTextMessage(AllDepts,ExpItem,"IPhone");

		WebElement Electronics = driver.findElement(By.id("issDiv1"));
		String ExpItem1 = "iphone 6s case in Electronics";
		validateTextMessage(Electronics, ExpItem1, "Electronics");

		WebElement CellPhones = driver.findElement(By.id("issDiv2"));
		String ExpItem2 = "iphone 6s case in Cell Phones & Accessories";
		validateTextMessage(CellPhones, ExpItem2, "CellPhones and Accessories");	

		Thread.sleep(2000);			

		bw.close();
		driver.close();

	}


	public static void TestID003() throws IOException, InterruptedException {
		
		System.out.println("TestID003");
		
		startReport("Test ID 003", "C:/Users/vani/Desktop/EXE_Files/Report/");
		AmazonModule.LaunchApplication("https://www.amazon.com/");		

		WebElement IPhone = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(IPhone,"Iphone", "Iphone");

		WebElement SearchHover = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		MouseHover(SearchHover, driver, "SearchButton");


		WebElement SearchButton = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		clickElement(SearchButton, "Search Button");

		Thread.sleep(2000);			

		bw.close();
		driver.close();

	}	


	public static void TestID004() throws IOException, InterruptedException {
		
		System.out.println("TestID004");

		startReport("Test ID 004", "C:/Users/vani/Desktop/EXE_Files/Report/");
		AmazonModule.LaunchApplication("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");

		AmazonModule.CellPhoneAcessories("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");				

		bw.close();
		driver.close();

	}	


	public static void TestID005() throws IOException, InterruptedException {
		
		System.out.println("TestID005");

		startReport("Test ID 005", "C:/Users/vani/Desktop/EXE_Files/Report/");
		AmazonModule.LaunchApplication("https://www.amazon.com/s/ref=nb_sb_ss_i_1_15?url=search-alias%3Daps&field-keywords=computers+and+accessories&sprefix=undefined%2Caps%2C238&rh=i%3Aaps%2Ck%3Acomputers+and+accessories");		

		WebElement ComputerComponents = driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[1]/ul/li[2]/a/span"));
		MouseHover(ComputerComponents, driver, "ComputerComponents");

		Thread.sleep(2000);			

		bw.close();
		driver.close();

	}


	public static void TestID006() throws IOException, InterruptedException {

		System.out.println("TestID006");
		
		startReport("Test ID 006", "C:/Users/vani/Desktop/EXE_Files/Report/");
		AmazonModule.LaunchApplication("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");		

		WebElement Smartwatches = driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[8]/a/span[1]"));
		MouseHover(Smartwatches, driver, "Smart watches");

		WebElement PowerBanks = driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[7]/a/span[1]"));
		MouseHover(PowerBanks, driver, "PowerBanks ");

		WebElement CarCharger = driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[9]/a/span[1]"));
		MouseHover(CarCharger, driver, "CarCharger");

		WebElement seeMore = driver.findElement(By.xpath(".//*[@id='seeAllDepartmentClosed1']/li/span/a/span[2]"));
		MouseHover(seeMore, driver, "seeMore");

		Thread.sleep(2000);			

		bw.close();
		driver.close();

	}


	public static void TestID007() throws IOException, InterruptedException {
		
		System.out.println("TestID007");

		startReport("Test ID 007", "C:/Users/vani/Desktop/EXE_Files/Report/");

		AmazonModule.LaunchApplication("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");	

		AmazonModule.AmazonPrime("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");

		AmazonModule.Brand("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");

		AmazonModule.InternalMemory("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");

		AmazonModule.DisplaySize("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");	

		AmazonModule.Condition("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");

		AmazonModule.CellPhoneCompatibility("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");

		AmazonModule.CustomerReview("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");

		AmazonModule.shipping("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");

		Thread.sleep(4000);			
		bw.close();
		driver.close();

	}

	
	public static void TestID008() throws IOException, InterruptedException {
		System.out.println("TestID008");

		startReport("Test ID 008", "C:/Users/vani/Desktop/EXE_Files/Report/");
				
		AmazonModule.AllTabs("https://www.amazon.com/");
		
		bw.close();
		driver.close();	
	}


	public static void TestID009() throws Exception {
		
		System.out.println("TestID009");

		startReport("Test ID 009", "C:/Users/vani/Desktop/EXE_Files/Report/");
				
	  AmazonModule.Departments("https://www.amazon.com/");
	
		bw.close();
		//driver.close();	
	}

	public static void TestID0010() throws Exception {
		System.out.println("TestID0010");

		
		startReport("Test ID 0010", "C:/Users/vani/Desktop/EXE_Files/Report/");
				
	  AmazonModule.YourAccount("https://www.amazon.com/");
	
		bw.close();
		driver.close();	
	}
	
	public static void TestID0011() throws Exception {
	System.out.println("TestID0011");
		
	startReport("Test ID 0011", "C:/Users/vani/Desktop/EXE_Files/Report/");
				
	  AmazonModule.PrimeDropDown("https://www.amazon.com/");
	
		bw.close();
		driver.close();	
		
	}
	
	public static void TestID0012() throws Exception {
		System.out.println("TestID0012");

		
		startReport("Test ID 0012", "C:/Users/vani/Desktop/EXE_Files/Report/");
				
	  AmazonModule.ListDropDown("https://www.amazon.com/");
	
		bw.close();
		driver.close();	
	}
	



}


































