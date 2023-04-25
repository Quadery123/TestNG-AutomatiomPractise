package object;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class TechfioSearch {
	WebDriver driver;
	
	public TechfioSearch(WebDriver d) {
	
	 driver= d;
	
	 PageFactory.initElements(driver, this);
}
	
	
	@FindBy(xpath = "//input[@name='allbox']")
			 WebElement  toggleAll;
				 
				 @FindBy(xpath ="//input[@value='Remove']")		 
				 
			 WebElement  remove;
				 
		public void	clicktoggleBtn() 
		
		{
		 toggleAll.click();
		
	}
	public void	clickremovebtnBtn() 
	{
	
		remove.click();
	}
	
	public void loginTechfios()
	{
	
	this.clicktoggleBtn();
	this.clickremovebtnBtn();
}
	
}			 
	

