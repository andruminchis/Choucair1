package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchsteps {
	
	WebDriver driver;
	
	@Given("the user is in the index page")
	public void theuserisintheindexpage() {
		
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		
		 driver.navigate().to("https://serenity.is/demo/Account/Login/?ReturnUrl=%2Fdemo%2F");
		
		
	}

	@When ("the person enter to url and enter user and pass")
	public void usersEnterDressesinSearchBar () {
		
		driver.findElement(By.id("StartSharp_Membership_LoginPanel0_Username")).click();
		
		driver.findElement(By.id("StartSharp_Membership_LoginPanel0_Username")).sendKeys("admin");
		
		driver.findElement(By.id("StartSharp_Membership_LoginPanel0_Password")).sendKeys("serenity");
		
		driver.findElement(By.id("StartSharp_Membership_LoginPanel0_LoginButton")).click();
	}
	
	@Then ("it goes to the business units organization menu")
	public void business()
	{
		driver.findElement(By.xpath("//ul[@id='SidebarMenu']/li[6]/a/span")).click();
		driver.findElement(By.className("nav-icon fa fa-sitemap")).click();
		
	}
	
	@Then ("create a new Businnes unit")
	public void unit(String start)
	{
		driver.findElement(By.xpath("//div[@id='StartSharp_Organization_BusinessUnitDialog7_PropertyGrid']/div/div/div/input")).click();
		driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).click();
		driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).sendKeys("nuevo");
		driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).sendKeys(Keys.ENTER);
		
		
		
	}
	
	@Then ("access the Meeting meetings menu")
	public void meeting ()
	{
		
	}
	
	
	@Then ("schedule a meeting")
	public void shedule ()
	{
		
	}
	
}
