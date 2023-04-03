package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageDefinitions {


    @Steps
    StepLoginPage loginPage;

    @Steps
    StepDashboardPage dashboardPage;

    @Given("User is on home page of website")
    public void user_is_on_home_page_of_website() {
        loginPage.open();
//        driver.manage().window().maximize();
    }

    @When("User enters username as {string}")
    public void user_enters_username_as(String username) {
        loginPage.inputUserName(username);
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String password) {
        loginPage.inputPassWord(password);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        loginPage.clicklogin();
        Thread.sleep(10000);

    }

    @Then("User should be able to login successfully")
    public void user_should_be_able_to_login_successfully(){
        dashboardPage.verify_login();
//        Thread.sleep(5000);
    }

    @Then("User should be able to see error message as incorrect credentials {string} and {string}")
    public void user_should_be_able_to_see_error_message_as_incorrect_credentials_and(String username, String password) {
        loginPage.errors(username,password);
    }

    @When("User fill the Registration form")
    public void userFillTheRegistrationForm(){
//        loginPage.highlight(loginPage.credentials());
        loginPage.credentials();
    }

    @And("Click on save button")
    public void clickOnSaveButton() {
        loginPage.save();
    }
}
