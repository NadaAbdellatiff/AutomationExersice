package POM_Demo;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountcreatedPage {
    WebDriver driver;
    String accountCreatedUrl= "https://automationexercise.com/account_created";

    /**********************************Locators***********************************/

    private  By Contiue_bttn_feild = By.xpath("//a[@class='btn btn-primary']");
    private By creationMessage_feild = By.xpath("//h2[@data-qa='account-created']");

    /**********************************Constructor***********************************/
    public AccountcreatedPage(WebDriver driver) {
        this.driver = driver;
    }


    /**********************************Actions***********************************/
    @Step("Verify that account is created")
    public AccountcreatedPage assertCreatingAcc(String expected) {
        Assert.assertEquals(driver.findElement(creationMessage_feild).getText(), expected);
        return this;

    }

    @Step("Click On Contiue")
    public void clickOnContiueBttn() {
        //Click on Contiue by using xpath then delete account by link text
        driver.findElement(Contiue_bttn_feild).click();
    }

    public void navigateToAccountCreatedPage(){
        driver.get(accountCreatedUrl);
    }
}
