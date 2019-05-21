package com.automation.page;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppStepDef {

	WebDriver driver= null;

	@Given("^they launch the application$")
	public void they_launch_the_application() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
				
	}
	
	@When("^they login with credentials$")
	public void they_login_with_credentials() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("TestUser7");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.name("login")).click();
	}
	
	
	@Then("^home Page is displayed$")
	public void home_Page_is_displayed() throws Throwable {
		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle,driver.getTitle());
		driver.close();
	}
	
	@Given("^they login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void they_login_with_and(String username, String password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	
	@Given("^they login with below credentials:$")
	public void they_login_with_below_credentials(DataTable credentials) throws Throwable {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		driver.findElement(By.name("login")).click();
		}
	
	@Given("^they login with given credentials:$")
	public void they_login_with_given_credentials(DataTable credentials) throws Throwable {
		
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			 driver.findElement(By.id("username")).sendKeys(data.get("username")); 
			     driver.findElement(By.id("password")).sendKeys(data.get("password"));
			     driver.findElement(By.id("login")).click();
			     driver.findElement(By.linkText("Logout")).click();
			     driver.findElement(By.linkText("Click here to login again")).click();
			 }
		}
	
	
}
