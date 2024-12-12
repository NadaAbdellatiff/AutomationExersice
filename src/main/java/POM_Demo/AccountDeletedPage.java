package POM_Demo;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountDeletedPage {
    WebDriver driver;
    String accountDeletedUrl = "https://automationexercise.com/delete_account";
    /**********************************Locators***********************************/

    private By Deletion_Message = By.xpath("//h2[@data-qa='account-deleted']");
    private By Contiue_bttn_feild = By.xpath("//a[@class='btn btn-primary']");

    /**********************************Constructor***********************************/
    public AccountDeletedPage(WebDriver driver) {
        this.driver = driver;
    }


    /**********************************Actions***********************************/
    @Step("Verify that account is deleted")
    public AccountDeletedPage assertDeletingAccount(String expected) {
        Assert.assertEquals(driver.findElement(Deletion_Message).getText(), expected);
        return this;

    }

    @Step("Click On Contiue ")
    public void clickOnContiueBttn() {
        //Click on Contiue by using xpath then delete account by link text
        driver.findElement(Contiue_bttn_feild).click();
    }

    public void NavigateToDeletedPage() {
        driver.get(accountDeletedUrl);
    }
}
