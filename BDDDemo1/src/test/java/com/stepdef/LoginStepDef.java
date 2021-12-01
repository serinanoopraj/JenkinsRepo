package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("king");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("king123");
	}
	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {

		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {

		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		
	}




}
