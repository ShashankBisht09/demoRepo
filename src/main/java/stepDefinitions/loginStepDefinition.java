package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefinition {

    WebDriver driver;

    @Given("^Open Firefox and start application$")
    public void open_Firefox_and_start_application()  {

	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.fb.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @When("^I provide valid username and password$")
    public void i_provide_valid_username_and_password()  {
	driver.findElement(By.xpath("//input[@ id='email']")).sendKeys("shashank");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("bisht");


    }

    @Then("^User should be able to login$")
    public void user_should_be_able_to_login()  {
	driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
    }

}
