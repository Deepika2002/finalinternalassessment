package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonn {
    WebDriver driver;

    @Given("I am on the Login page URL {string}")
    public void i_am_on_the_login_page_url(String url) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Keerthi Vardhani/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();                 
        driver.manage().window().maximize();         
        driver.get(url);
    }

    @Then("I click on sign in button and wait for sign in page")
    public void i_click_on_sign_in_button_and_wait_for_sign_in_page() {
        // Implementation to click on sign in button and wait for sign in page
        WebElement signInButton = driver.findElement(By.cssSelector("a[data-nav-role='signin']"));
        signInButton.click();
    }

    @When("I enter username as {string}")
    public void i_enter_username_as(String username) {
        // Implementation to enter username
        WebElement usernameField = driver.findElement(By.id("ap_email"));
        usernameField.sendKeys(username);
    }

    @When("I Click on Continue button")
    public void i_click_on_continue_button() {
        // Implementation to click on Continue button
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String password) {
        // Implementation to enter password
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys(password);
    }

    @When("click on login button")
    public void click_on_login_button() {
        // Implementation to click on login button
        WebElement signInSubmitButton = driver.findElement(By.id("signInSubmit"));
        signInSubmitButton.click();
    }

    @Then("I am logged in")
    public void i_am_logged_in() {
        // Implementation to verify successful login
        System.out.println("Successfully logged in");
    }

    @Then("I search different {string} from the search bar")
    public void i_search_different_from_the_search_bar(String products) {
        // Implementation to search different products from the search bar
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(products);
        searchBox.submit();
    }

    @When("I enter phone number as {string}")
    public void i_enter_phone_number_as(String phoneNumber) {
        // Implementation to enter phone number
        WebElement phoneNumberField = driver.findElement(By.id("ap_phone_number"));
        phoneNumberField.sendKeys(phoneNumber);
    }
}