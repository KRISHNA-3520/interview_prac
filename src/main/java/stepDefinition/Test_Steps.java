package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;


public class Test_Steps {

	private static WebDriver driver=null;
	
	 @Given("^User is on Home Page$")
	    public void user_is_on_home_page() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NEW3\\Desktop\\kworkspace\\mavenproject\\chromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
	}

	 @When("^User enters UserName and Password$")
	    public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
	}

	 @And("^Message displayed Login Successfully$")
	    public void message_displayed_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successfully");
	}
	 
	 @When("^User LogOut from the Application$")
	    public void user_logout_from_the_application() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("react-burger-menu-btn")).click();
		  
		  driver.findElement(By.id("logout_sidebar_link")).click();
	    }

	    @Then("^Message displayed LogOut Successfully$")
	    public void message_displayed_logout_successfully() throws Throwable {
	    	  System.out.println("Logged out Successfully");
	    	  
	    	  driver.quit();
	    }

}
