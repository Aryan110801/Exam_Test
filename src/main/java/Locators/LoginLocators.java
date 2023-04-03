package Locators;

public class LoginLocators {
    public  final String UserName = "//input[@placeholder='user name']";
    public  final String Password = "//input[@type='password']";
    public  final String Login = "//span[@class='ui-button-text ui-clickable']";
    public  final String wucp = "//span[contains(text(),'User Not Found')]";
    public  final String cuwp = "//span[contains(text(),'Username or Password is incorrect!!')]";
    public  final String Both_Wrong = "//span[contains(text(),'User Not Found')]";
    public  final String Dashboard = "//em[@class='fa fa-bars']";
    public  final String UserRegistration = "//span[normalize-space()='User Registration']";
    public  final String DashPage = "//h3[@class='p-col-fixed pd-tb-7 mb-0']";
}
