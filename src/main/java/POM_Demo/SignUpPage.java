package POM_Demo;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;
    String SignUpUrl = "https://automationexercise.com/login";

    /**********************************Locators***********************************/
    private By userNamefeild_input = By.name("name");
    private By emaiFeild_input = By.xpath("//input[@data-qa='signup-email']");
    private By signUp_button = By.xpath("//button[@data-qa='signup-button']");
    private By emailAddress_input = By.xpath("//input[@data-qa=\"login-email\"]");
    private By passward_input = By.xpath("//input[@data-qa=\"login-password\"]");
    private By login_button = By.xpath("//button[@data-qa=\"login-button\"]");


    /**********************************Constructor***********************************/
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    /**********************************Actions***********************************/
    @Step("Enter Username and email")
    public void signUp1(String username, String email) {

        // Send the name & password then click on Signup
        driver.findElement(userNamefeild_input).sendKeys(username);
        driver.findElement(emaiFeild_input).sendKeys(email);
        driver.findElement(signUp_button).click();
    }

    public void navigateToSignUpPage() {
        // Load the page
        driver.get(SignUpUrl);
    }
    @Step("Enter your email and password")
    public void login(String email , String password){
        driver.findElement(emailAddress_input).sendKeys(email);
        driver.findElement(passward_input).sendKeys(password);
        driver.findElement(login_button).click();
    }


}
