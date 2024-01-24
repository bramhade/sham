package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Loginpage {

	private WebDriver driver;
	
	public Loginpage (WebDriver driver)
	{    
		this.driver=driver;
	}
	
	
	private By usn=By.name("username");
			
	private By psw=By.name("password");
	private By loginbtn=By.xpath("// button[ @type='submit']");
	
	
	
	

	public void doLogin(String username,String password) {
	
	driver.findElement(usn).sendKeys(username);
	
	driver.findElement(psw).sendKeys(password);
	
	driver.findElement(loginbtn).click();
	}
	
	public String  getUrl() {
		
		 return driver.getCurrentUrl();
	}
	public String getAppTittle()	 
		 
	{
		return driver.getTitle();
	
	}

	
}

	
	
	
	
	

