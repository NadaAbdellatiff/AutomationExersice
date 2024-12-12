package POM_Demo;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuSkelton {
    WebDriver driver;

    /**********************************Locators***********************************/

    private By signLogBbttn_a = By.linkText("Signup / Login");
    private By deleteBttn_a = By.linkText("Delete Account");

    /**********************************Constructor***********************************/

    public MenuSkelton(WebDriver driver) {
        this.driver = driver;
    }

    /**********************************Actions***********************************/
    @Step("Click on Sign up in the header")
    public void signUpClick() {
        // Clicking on signup bttn.
        driver.findElement(signLogBbttn_a).click();
    }
    @Step("Click on Delete account in the header")
    public void deleteClick(){
        driver.findElement(deleteBttn_a).click();
    }


}
