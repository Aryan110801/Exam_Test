package StepDef;

import Locators.LoginLocators;
import Locators.RegistrationLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class StepLoginPage extends PageObject {

    StepDashboardPage dashboardPage = new StepDashboardPage();
    LoginLocators loginLocators = new LoginLocators();
    RegistrationLocators registrationLocators = new RegistrationLocators();

    @Step("Enter username")
    public void inputUserName(String username) {
        $(By.xpath(loginLocators.UserName)).sendKeys(username);
    }

    @Step("Enter password")
    public void inputPassWord(String password) {
        $(By.xpath(loginLocators.Password)).sendKeys(password);
    }

    @Step("Click on login button")
    public void clicklogin() {
        $(By.xpath(loginLocators.Login)).click();
    }

    @Step("False credentials")
    public void errors(String username, String password) {
        if (username == "aryan" && password == "srkcss") {
            String user = $(By.xpath(loginLocators.wucp)).getText();
            Assert.assertEquals("User Not Found", user);
        } else if (username == "ppd" && password == "pandey") {
            String user = $(By.xpath(loginLocators.cuwp)).getText();
            Assert.assertEquals("Username or Password is incorrect!!", user);
        } else if (username == "aryan" && password == "pandey") {
            String user = $(By.xpath(loginLocators.Both_Wrong)).getText();
            Assert.assertEquals("User Not Found", user);
        }
        else if (username == "ppd" && password == "srkcss") {
            String user = $(By.xpath(loginLocators.DashPage)).getText();
            Assert.assertEquals(" Dashboard",user);
        }
    }

    @Step("User enter the following credentials")
    public void credentials(){
//        Thread.sleep(3000);
        $(By.xpath(registrationLocators.New_Entry)).click();
        $(By.xpath(registrationLocators.Date)).click();
        $(By.xpath(registrationLocators.Select_Date)).click();
        $(By.xpath(registrationLocators.Company)).click();
        $(By.xpath(registrationLocators.Select_Company)).click();
        $(By.xpath(registrationLocators.Location)).click();
        $(By.xpath(registrationLocators.Select_Location)).click();
        $(By.xpath(registrationLocators.Department)).click();
        $(By.xpath(registrationLocators.Select_Department)).click();
        $(By.xpath(registrationLocators.Category)).click();
        $(By.xpath(registrationLocators.Select_Category)).click();
        $(By.xpath(registrationLocators.Stone_Detail)).click();
        $(By.xpath(registrationLocators.Select_Stone)).click();
        $(By.xpath(registrationLocators.User_Role_Access)).click();
        $(By.xpath(registrationLocators.Select_Role)).click();
        $(By.xpath(registrationLocators.F_Name)).sendKeys("Aryan");
        $(By.xpath(registrationLocators.DOB)).click();
        $(By.xpath(registrationLocators.Select_DOB)).click();
        $(By.xpath(registrationLocators.Gender)).click();
        $(By.xpath(registrationLocators.Marital_Status)).click();
        $(By.xpath(registrationLocators.Code)).sendKeys("91");
        $(By.xpath(registrationLocators.Phone)).sendKeys("7096930275");
        $(By.xpath(registrationLocators.Email)).sendKeys("aryanpandey@scikey.ai");
        $(By.xpath(registrationLocators.Houseno)).sendKeys("Vatrak");
        $(By.xpath(registrationLocators.StreetAddress)).sendKeys("Tithal Road");
        $(By.xpath(registrationLocators.AddressLine2)).sendKeys("Bhagdawada");
        $(By.xpath(registrationLocators.Country)).click();
        $(By.xpath(registrationLocators.CountryDrop)).click();
        $(By.xpath(registrationLocators.State)).click();
        $(By.xpath(registrationLocators.StateDrop)).click();
        $(By.xpath(registrationLocators.City)).click();
        $(By.xpath(registrationLocators.CityDrop)).click();
        $(By.xpath(registrationLocators.Pincode)).click();
        $(By.xpath(registrationLocators.PincodeDrop)).click();
        $(By.xpath(registrationLocators.LoginName)).sendKeys("Aryan");
//        return null;
    }

    @Step("User click on save button")
    public void save(){
        $(By.xpath(registrationLocators.Save)).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
