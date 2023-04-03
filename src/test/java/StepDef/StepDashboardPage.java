package StepDef;

import Locators.LoginLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepDashboardPage extends PageObject {
LoginLocators loginLocators = new LoginLocators();
@Step("Successfull login")
    public void verify_login() {
    $(By.xpath(loginLocators.Dashboard)).click();
    $(By.xpath(loginLocators.UserRegistration)).click();
//    String dashboard = $(By.xpath(loginLocators.UserRegistration)).getText();
//    Assert.assertEquals("User Registration",dashboard);
}
}
