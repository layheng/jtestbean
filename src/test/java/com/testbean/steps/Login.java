package com.testbean.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Login {
    WebDriver driver = new FirefoxDriver();

    @Given("Facebook website is accessible")
    public void website_is_accessible() {
        driver.get("https://www.facebook.com");
    }

    @When("login with user-defined username and password")
    public void login_with_user_defined_username_and_password() throws IOException {
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement passInput = driver.findElement(By.name("pass"));
        WebElement submitButton = driver.findElement(By.name("login"));

        emailInput.sendKeys(UserData.get("email"));
        passInput.sendKeys(UserData.get("password"));
        submitButton.click();
    }

    @Then("login is successful")
    public void login_is_successful() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
        String title = driver.getTitle();
        assertNotEquals("Facebook - Log In or Sign Up", title);
        assertNotEquals("Log into Facebook", title);
    }
}
