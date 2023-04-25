package testscenerio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import object.TechfioSearch;




@Test
public class testMethods<selected> {

	  static WebDriver driver; 
	  
	  TechfioSearch LoginPg;
	  
	@BeforeTest 
	  public void setUp() 
			  
			  //throws InterruptedException 
	  { 
	    
		WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver = new  ChromeDriver(); 
		  
		  driver.manage().window().maximize();
		  
		  driver.get( "https://techfios.com/test/103/");
		  
	//	 Thread.sleep(5000);
	     
	     TechfioSearch LoginPg = new TechfioSearch (driver);
	     
	     
	   
	  }
	    
	     @Test(priority = 0) 
	  public void verifyelement() 
	  {

	 
	  WebElement togglebox = driver.findElement(By.xpath("//input[@name='allbox']']")); 
  
  togglebox.click();
  
	if(togglebox.isSelected())
	{
		System.out.println("togglebox is checked");
	}

  
  
  //Assert.assertEquals(true, togglebox.isSelected()); 

 // System.out.println(“ToggleAll button is selected – Assert passed”);

	  } 
	     @Test(priority = 1)
	  public void verifyelement1()
	  {

	   WebElement remove = driver.findElement(By.xpath("//input[@value='Remove']")); 
  
  remove.click();
  
	if(remove.isSelected())
	{
		System.out.println("remove is checked");
	}

  
  
  

 
	  }  
	  
	  @AfterTest
	  public void closing() 
	  { 
	    driver.quit(); 
	   } 
	  }
	

	
	
	
	
	
	
	

