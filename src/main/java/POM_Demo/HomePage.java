package POM_Demo;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    WebDriver driver;
    String homePageUrl = "https://automationexercise.com/";
    /**********************************Locators***********************************/

    private By signLogBbttn_a = By.linkText("Signup / Login");
    private By deleteBttn_a = By.linkText("Delete Account");

    /**********************************Constructor***********************************/
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    @Step("Navigate to homepage")
    public HomePage navigateToHomePage() {
        // Load the page
        driver.get(homePageUrl);
        return this;
    }

}
