package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

     public class AmazonModule extends AmazonAutomationScripts {

	public static void LaunchApplication(String URL) throws IOException, InterruptedException{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		


	}

	
	public static void AmazonPrime(String URL) throws IOException, InterruptedException{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		WebElement AmazonPrime = driver.findElement(By.xpath(".//*[@id='refinements']/h2[1]"));
		MouseHover(AmazonPrime, driver, "AmazonPrime");
		Thread.sleep(8000);

		WebElement FreeShipping = driver.findElement(By.xpath(".//*[@id='ref_2491144011']/li/a/span"));
		String expectedMsg1 = "Free Shipping by Amazon";
		validateTextMessage(FreeShipping, expectedMsg1, "FreeShipping");
		MouseHover(FreeShipping, driver, "Free Shipping by Amazon");
		Thread.sleep(4000);

		WebElement Freeshipping = driver.findElement(By.xpath(".//*[@id='ref_2491144011']/li/a/img"));
		deSelectChKBox(Freeshipping, "Free shipping");
		Thread.sleep(4000);
		
	}
	

	public static void Brand(String URL) throws IOException, InterruptedException{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");

		driver.manage().window().maximize();

		WebElement Brand = driver.findElement(By.xpath(".//*[@id='refinements']/h2[4]"));
		String expectedMsg2 = "Brand";
		validateTextMessage(Brand, expectedMsg2, "Brand");

		WebElement Apple = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[1]/a/span"));
		MouseHover(Apple, driver, "Apple");
		Thread.sleep(4000);

		WebElement AppleChkBx = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[1]/a/img"));
		deSelectChKBox(AppleChkBx, "Apple");
		Thread.sleep(6000);


		WebElement Rhimbers = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[3]/a/span"));
		MouseHover( Rhimbers, driver, "Rhimbers");
		Thread.sleep(4000);

		WebElement RimbersChkBx = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[3]/a/img"));
		deSelectChKBox(RimbersChkBx, "Rhimbers");
		Thread.sleep(4000);

		WebElement Buyee = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[4]/a/span"));
		MouseHover(Buyee, driver, "Buyee");
		Thread.sleep(4000);		

		WebElement BuyeeChkBx = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[4]/a/img"));
		deSelectChKBox(BuyeeChkBx, "Buyee");
		Thread.sleep(4000);

		WebElement GrantwoodTch = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[5]/a/span"));
		MouseHover(GrantwoodTch, driver, "GrantWoodTech");
		Thread.sleep(4000);

		WebElement GrantWoodChkBx = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[5]/a/img"));
		deSelectChKBox(GrantWoodChkBx, "GrantWoodTech");
		Thread.sleep(4000);

		WebElement Energen = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[6]/a/span"));
		MouseHover(Energen, driver, "Energen");
		Thread.sleep(4000);

		WebElement EnergenChkBx = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[6]/a/img"));
		deSelectChKBox(EnergenChkBx, "Energen");
		Thread.sleep(4000);

		WebElement RCO = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[7]/a/span"));
		MouseHover(RCO, driver, "RCO");
		Thread.sleep(4000);

		WebElement RCOChkBx = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[7]/a/img"));
		deSelectChKBox(RCOChkBx, "RCO");
		Thread.sleep(4000);

		WebElement KINGLAKE = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[8]/a/span"));
		MouseHover(KINGLAKE, driver, "KINGLAKE");
		Thread.sleep(4000);

		WebElement KINGLAKEChkBx = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[8]/a/img"));
		deSelectChKBox(KINGLAKEChkBx, "KINGLAKE");
		Thread.sleep(4000);

		WebElement UNU = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[9]/a/span"));
		MouseHover(UNU, driver, "UNU");
		Thread.sleep(4000);

		WebElement UNUChkBx = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[9]/a/img"));
		deSelectChKBox(UNUChkBx, "UNU");
		Thread.sleep(4000);

		WebElement cellArmor = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[10]/a/span"));
		MouseHover(cellArmor, driver, "cellArmor");
		Thread.sleep(4000);

		WebElement cellArmorChkBx = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[10]/a/img"));
		deSelectChKBox(cellArmorChkBx, "cellArmor");
		Thread.sleep(4000);

		WebElement MaxBoost = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[11]/a/span"));
		MouseHover(MaxBoost, driver, "MaxBoost");
		Thread.sleep(4000);

		WebElement MaxBoostChkBx = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[11]/a/img"));
		deSelectChKBox(MaxBoostChkBx, "MaxBoost");
		Thread.sleep(4000);

		WebElement SeeMore = driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[12]/a/span"));
		MouseHover(SeeMore, driver, "SeeMore");
		Thread.sleep(4000);
		


	}
	

	public static void InternalMemory(String URL) throws IOException, InterruptedException{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");

		driver.manage().window().maximize();

		WebElement InternalMemory = driver.findElement(By.xpath(".//*[@id='refinements']/h2[5]"));
		String expectedMsg3 = "International Shipping";
		validateTextMessage(InternalMemory, expectedMsg3, "Internal Memory");
		Thread.sleep(4000);

		WebElement GB4 = driver.findElement(By.xpath(".//*[@id='ref_7805160011']/li[1]/span/span"));
		MouseHover(GB4, driver, "4GB");

		Thread.sleep(4000);
		WebElement GB8 = driver.findElement(By.xpath(".//*[@id='ref_7805160011']/li[2]/a/span"));
		MouseHover(GB8, driver, "8GB");

		Thread.sleep(4000);
		WebElement GB8ChkBox = driver.findElement(By.xpath(".//*[@id='ref_7805160011']/li[2]/a/img"));
		MouseHover(GB8ChkBox, driver, "8GB");

		Thread.sleep(4000);
		WebElement GB16 = driver.findElement(By.xpath(".//*[@id='ref_7805160011']/li[3]/a/span"));
		MouseHover(GB16, driver, "16GB");

		Thread.sleep(4000);
		WebElement GB16ChkBox = driver.findElement(By.xpath(".//*[@id='ref_7805160011']/li[3]/a/img"));
		MouseHover(GB16ChkBox, driver, "16GB");

		Thread.sleep(4000);
		WebElement GB32 = driver.findElement(By.xpath(".//*[@id='ref_7805160011']/li[4]/a/span"));
		MouseHover(GB32, driver, "32GB");

		Thread.sleep(4000);
		WebElement GB32ChkBox = driver.findElement(By.xpath(".//*[@id='ref_7805160011']/li[2]/a/img"));
		MouseHover(GB32ChkBox, driver, "32GB");

		Thread.sleep(4000);
		WebElement GB64 = driver.findElement(By.xpath(".//*[@id='ref_7805160011']/li[5]/a/span"));
		MouseHover(GB64, driver, "64GB");

		Thread.sleep(4000);
		WebElement GB64ChkBox = driver.findElement(By.xpath(".//*[@id='ref_7805160011']/li[5]/a/img"));
		MouseHover(GB64ChkBox, driver, "64GB");

		Thread.sleep(5000);
		


	}

	
	public static void DisplaySize(String URL) throws IOException, InterruptedException{
	  		
	        driver = new FirefoxDriver(); 
	  		driver.get(URL); 

	  		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");

	  		driver.manage().window().maximize();
	  		
	  		WebElement DisplaySize = driver.findElement(By.xpath(".//*[@id='refinements']/h2[9]"));
	  		String expectedTextMsg = "Accessory Kit Compatibility";
			validateTextMessage(DisplaySize, expectedTextMsg, "Cell Phone Display Size");
			
			WebElement Option1 = driver.findElement(By.xpath(".//*[@id='ref_6215726011']/li[1]/a/span"));
			MouseHover(Option1, driver, "3.9 and Under");
			Thread.sleep(4000);
			
			WebElement Option1ChkBox = driver.findElement(By.xpath(".//*[@id='ref_6215726011']/li[1]/a/img"));
			deSelectChKBox(Option1ChkBox, "3.0 and under");
			Thread.sleep(4000);
			
			WebElement Option2 = driver.findElement(By.xpath(".//*[@id='ref_6215726011']/li[2]/a/span"));
			MouseHover(Option2, driver, "4.0 to 4.4");
			Thread.sleep(4000);
			
			WebElement Option2ChkBox = driver.findElement(By.xpath(".//*[@id='ref_6215726011']/li[2]/a/img"));
			deSelectChKBox(Option2ChkBox, "4.0 and 4.4");
			Thread.sleep(4000);
			
			WebElement Option3 = driver.findElement(By.xpath(".//*[@id='ref_6215726011']/li[3]/a/span"));
			MouseHover(Option3, driver, "4.5 to 4.9");
			Thread.sleep(4000);
			
			WebElement Option3ChkBox = driver.findElement(By.xpath(".//*[@id='ref_6215726011']/li[3]/a/img"));
			deSelectChKBox(Option3ChkBox, "4.5 to 4.9");
			Thread.sleep(4000);
			
			WebElement Option4 = driver.findElement(By.xpath(".//*[@id='ref_6215726011']/li[4]/a/span"));
			MouseHover(Option4, driver, "5.0 to 5.4");
			Thread.sleep(4000);
			
			WebElement Option4ChkBox = driver.findElement(By.xpath(".//*[@id='ref_6215726011']/li[4]/a/img"));
			deSelectChKBox(Option4ChkBox, "5.0 to 5.4");
			Thread.sleep(4000);
			
			WebElement Option5 = driver.findElement(By.xpath(".//*[@id='ref_6215726011']/li[5]/a/span"));
			MouseHover(Option5, driver, "5.5 and up");
			Thread.sleep(4000);
			
			WebElement Option5ChkBox = driver.findElement(By.xpath(".//*[@id='ref_6215726011']/li[5]/a/img"));
			deSelectChKBox(Option5ChkBox, "5.5 and up");
			Thread.sleep(4000);			
	  		
	  	
	 }

	 
	public static void Condition(String URL) throws IOException, InterruptedException{
		
			driver = new FirefoxDriver(); 
			driver.get(URL); 

			Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");

			driver.manage().window().maximize();

			Thread.sleep(5000);
			
			WebElement Condition = driver.findElement(By.xpath(".//*[@id='refinements']/h2[8]"));
			String expectedTextMsg = "Cell Phone Display Size";
			validateTextMessage(Condition, expectedTextMsg, "Condition");
			
			WebElement New = driver.findElement(By.xpath(".//*[@id='ref_6503239011']/li[1]/a/span[1]"));
			MouseHover(New, driver, "New");
			
			WebElement ReFurbished = driver.findElement(By.xpath(".//*[@id='ref_6503239011']/li[2]/a/span[1]"));
			MouseHover(ReFurbished, driver, "ReFurbished");
			
			WebElement Used = driver.findElement(By.xpath(".//*[@id='ref_6503239011']/li[3]/a/span[1]"));
			MouseHover(Used, driver, "Used");
			
         	}


	public static void CellPhoneAcessories(String URL) throws IOException, InterruptedException{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement CellPhones = driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[2]/strong"));
		MouseHover(CellPhones, driver, "CellPhones and Accessories");
		Thread.sleep(6000);
		

		WebElement Accessoriess = driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[4]/a/span[1]"));
		MouseHover(Accessoriess, driver, "Accessoriess");

		Thread.sleep(3000);
		WebElement CellPhoneCases = driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[5]/a/span[1]"));
		MouseHover(CellPhoneCases, driver, "CellPhoneCases");

		Thread.sleep(3000);
		WebElement ReplacementParts = driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[6]/a/span[1]"));
		MouseHover(ReplacementParts, driver, "ReplacementParts");

		Thread.sleep(3000);
		WebElement SeeMore = driver.findElement(By.xpath(".//*[@id='seeAllDepartmentClosed1']/li/span/a/span[2]"));
		MouseHover(SeeMore, driver, "SeeMore");		

		Thread.sleep(5000);
		
                          	}	  
	
	
	public static void CellPhoneCompatibility(String URL) throws IOException, InterruptedException{
		
		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		WebElement Compatibility = driver.findElement(By.xpath(".//*[@id='refinements']/h2[11]"));
		MouseHover(Compatibility, driver, "Compatibility");
		Thread.sleep(3000);
		
		WebElement iPhone6s = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[1]/a/span"));
		MouseHover(iPhone6s, driver, "iPhone 6/6S");
		Thread.sleep(3000);
		
		WebElement iPhone6sChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[1]/a/img"));
		deSelectChKBox(iPhone6sChkBox, "iPhone 6/6S");
		Thread.sleep(3000);
		
		WebElement iPhone6sPlus = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[2]/a/span"));
		MouseHover(iPhone6sPlus, driver, "iPhone 6/6S Plus");
		Thread.sleep(3000);
		
		WebElement iPhone6sPlusChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[2]/a/img"));
		deSelectChKBox(iPhone6sPlusChkBox, "iPhone 6/6S Plus");
		Thread.sleep(3000);
		
		WebElement iPhone5s = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[3]/a/span"));
		MouseHover(iPhone5s, driver, "iPhone 5/5S");
		Thread.sleep(3000);
		
		WebElement iPhone5sChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[3]/a/img"));
		deSelectChKBox(iPhone5sChkBox, "iPhone 5/5S");
		Thread.sleep(3000);
		
		WebElement iPhone5C = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[4]/a/span"));
		MouseHover(iPhone5C, driver, "iPhone5C");
		Thread.sleep(3000);
		
		WebElement iPhone5CChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[4]/a/img"));
		deSelectChKBox(iPhone5CChkBox, "iPhone 5C");
		Thread.sleep(3000);
		
		WebElement iPhone4s = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[5]/a/span"));
		MouseHover(iPhone4s, driver, "iPhone 4S");
		Thread.sleep(3000);
		
		WebElement iPhone4sChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[5]/a/img"));
		deSelectChKBox(iPhone4sChkBox, "iPhone 4S");
		Thread.sleep(3000);
		
		WebElement SamsungS7 = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[6]/span/span"));
		MouseHover(SamsungS7, driver, "SamsungS7");
		Thread.sleep(3000);
		
		WebElement samsungS7Edge = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[7]/span/span"));
		MouseHover(samsungS7Edge, driver, "samsungS7Edge");
		
		WebElement SamsungS6 = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[8]/a/span"));
		MouseHover(SamsungS6, driver, "SamsungS6");
		Thread.sleep(3000);
		
		WebElement SamsungS6ChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[8]/a/img"));
		deSelectChKBox(SamsungS6ChkBox, "SamsungS6");
		Thread.sleep(3000);
		
		WebElement SamsungS6Edge = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[9]/a/span"));
		MouseHover(SamsungS6Edge, driver, "SamsungS6Edge");
		Thread.sleep(3000);
		
		WebElement SamsungS6EdgeChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[9]/a/img"));
		deSelectChKBox(SamsungS6EdgeChkBox, "SamsungS6Edge");
		Thread.sleep(3000);
		
		WebElement SamsungS5 = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[10]/a/span"));
		MouseHover(SamsungS5, driver, "SamsungS5");
		Thread.sleep(3000);
		
		WebElement SamsungS5ChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[10]/a/img"));
		deSelectChKBox(SamsungS5ChkBox, "SamsungS5");
		Thread.sleep(3000);
		
		WebElement SamsungS4 = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[11]/a/span"));
		MouseHover(SamsungS4, driver, "SamsungS4");
		Thread.sleep(3000);
		
		WebElement SamsungS4ChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[11]/a/img"));
		deSelectChKBox(SamsungS4ChkBox, "SamsungS4");
		Thread.sleep(3000);
		
		WebElement SamsungNote4 = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[12]/a/span"));
		MouseHover(SamsungNote4, driver, "SamsungNote4");
		Thread.sleep(3000);
		
		WebElement SamsungNote4ChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[12]/a/img"));
		deSelectChKBox(SamsungNote4ChkBox, "SamsungNote4");
		Thread.sleep(3000);
		
		WebElement LgG3 = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[13]/a/span"));
		MouseHover(LgG3, driver, "LgG3");
		Thread.sleep(3000);
		
		WebElement LgG3ChkBox = driver.findElement(By.xpath(".//*[@id='ref_2488708011']/li[13]/a/img"));
		deSelectChKBox(LgG3ChkBox, "LgG3");
		Thread.sleep(3000);
			
	   
	}
	
	
	public static void CustomerReview(String URL) throws IOException, InterruptedException{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");
		driver.manage().window().maximize();
		
		WebElement CustomerRvw = driver.findElement(By.xpath(".//*[@id='refinements']/h2[3]"));
		String expectedTextMsg = "Avg. Customer Review";
		validateTextMessage(CustomerRvw, expectedTextMsg, "CustomerRvw");
		Thread.sleep(4000);
		
		WebElement Stars4 = driver.findElement(By.xpath(".//*[@id='ref_2491147011']/li[1]/a/i"));
		MouseHover(Stars4, driver, "4 stars");
		Thread.sleep(4000);
		
		WebElement Stars3 = driver.findElement(By.xpath(".//*[@id='ref_2491147011']/li[2]/a/i"));
		MouseHover(Stars3, driver, "3 stars");
		Thread.sleep(4000);
		
		WebElement Stars2 = driver.findElement(By.xpath(".//*[@id='ref_2491147011']/li[3]/a/i"));
		MouseHover(Stars2, driver, "2 stars");
		Thread.sleep(4000);
		
		WebElement Star1 = driver.findElement(By.xpath(".//*[@id='ref_2491147011']/li[4]/a/i"));
		MouseHover(Star1, driver, "1 star");
				
		Thread.sleep(4000);
		
	}
	
	public static void shipping(String URL) throws IOException, InterruptedException{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");
		driver.manage().window().maximize();
	
		WebElement IntlShipping = driver.findElement(By.xpath(".//*[@id='refinements']/h2[6]"));
		String expectedTextMsg = "International Shipping";
		validateTextMessage(IntlShipping, expectedTextMsg, "International Shipping");
		
		WebElement GlobalElg = driver.findElement(By.xpath(".//*[@id='ref_2944662011']/li/a/span"));
		MouseHover(GlobalElg, driver, "Global shipping Eligible");
		Thread.sleep(3000);
		
		WebElement GlobalElgChkBox = driver.findElement(By.xpath(".//*[@id='ref_2944662011']/li/a/img"));
		deSelectChKBox(GlobalElgChkBox, "Global shipping Eligible");
		
		Thread.sleep(4000);
	
	}
	
	
	public static void AllTabs(String URL) throws IOException, InterruptedException{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");
		driver.manage().window().maximize();
	
		WebElement Departments = driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
		MouseHover(Departments, driver, "Departments");
		Thread.sleep(2000);
		
		WebElement YourAmazon = driver.findElement(By.id("nav-your-amazon"));
		MouseHover(YourAmazon, driver, "Your Amazon link ");
		Thread.sleep(2000);
		
		WebElement TodayDeals = driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]"));
		MouseHover(TodayDeals, driver, "Today's Deals");
		Thread.sleep(2000);
		
		WebElement GiftCards = driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[3]"));
		MouseHover(GiftCards, driver, "Giftcards and Registry");	
		Thread.sleep(2000);
		
		WebElement sell = driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[4]"));
		MouseHover(sell, driver, "Sell");
		Thread.sleep(2000);
		
		WebElement Help = driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[5]"));
		MouseHover(Help, driver, "Help");
		Thread.sleep(2000);
		
		WebElement SignYourAcct = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));
		MouseHover(SignYourAcct, driver, "Sign in your Account");
		Thread.sleep(2000);
		
		WebElement TryPrime = driver.findElement(By.xpath(".//*[@id='nav-link-prime']"));
		MouseHover(TryPrime, driver, "Try Prime");
		Thread.sleep(2000);
		
		WebElement Lists = driver.findElement(By.xpath(".//*[@id='nav-link-wishlist']/span[2]"));
		MouseHover(Lists, driver, "Lists");
		Thread.sleep(2000);
		
		WebElement Cart = driver.findElement(By.xpath(".//*[@id='nav-cart']/span[3]"));
		MouseHover(Cart, driver, "Cart");
		
		Thread.sleep(2000);
		
	}
	
	public static void Departments(String URL) throws Exception{

	
		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");
		driver.manage().window().maximize();
	
		 WebElement Dept = driver.findElement(By.xpath(".//*[@id='searchDropdownBox']"));
		  Select select = new Select (Dept);
	      select.selectByVisibleText("Books");
	      System.out.println("Books selected ");
          Thread.sleep(4000);
     	
		
	}
	
	public static void YourAccount(String URL) throws Exception{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");
		driver.manage().window().maximize();
		
		 WebElement YourAccount = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));
	     MouseHover(YourAccount, driver, "YOur Account");
	     clickElement(YourAccount, "Your Orders");
	     System.out.println("Your Orders selected ");
	     
		
     	Thread.sleep(4000);
		
	}
	

	public static void PrimeDropDown(String URL) throws Exception{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");
		driver.manage().window().maximize();
	
		WebElement Prime = driver.findElement(By.xpath(".//*[@id='nav-link-prime']/span[2]"));
		MouseHover(Prime, driver, "Prime");
		
		System.out.println("Prime dropdown");
		
     	Thread.sleep(4000);
		
	}

	public static void ListDropDown(String URL) throws Exception{

		driver = new FirefoxDriver(); 
		driver.get(URL); 

		Update_Report("Pass", "Launch SFDC Application", "SFDC Application is launched");
		driver.manage().window().maximize();
		
		WebElement Lists = driver.findElement(By.id("nav-link-wishlist"));
		MouseHover(Lists, driver, "Lists");
		clickElement(Lists, "Find a Gift");
		System.out.println("Find a Gift from ListDrop down");
			
     	Thread.sleep(4000);
		
	}

	
	
	
	
	
	
	
	
	
	}

  




