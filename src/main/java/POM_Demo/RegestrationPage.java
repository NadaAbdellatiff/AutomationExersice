package POM_Demo;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegestrationPage {
    WebDriver driver;

    String RegistrationPageUrl = "https://automationexercise.com/signup";
    /**********************************Locators***********************************/
    private By gender_male_feild = By.id("id_gender1");
    private By gender_female_feild = By.id("id_gender2");
    private By passward_feild = By.id("password");
    private By day_feild = By.id("days");
    private By months_feild = By.id("months");
    private By year_feild = By.id("years");
    private By setle_feild = By.id("newsletter");
    private By optio_feild = By.id("optin");
    private By firstName_feild = By.id("first_name");
    private By lastName_feild = By.id("last_name");
    private By comapny_feild = By.id("company");
    private By address1_feild = By.id("address1");
    private By address2_feild = By.id("address2");
    private By country_feild = By.id("country");
    private By state_feild = By.id("state");
    private By city_feild = By.id("city");
    private By zipCode_feild = By.id("zipcode");
    private By mobile_feild = By.id("mobile_number");
    private By createAcc_bttn_feild = By.xpath("//button[@data-qa='create-account']");


    /**********************************Constructor***********************************/
    public RegestrationPage(WebDriver driver) {
        this.driver = driver;
    }


    /**********************************Actions***********************************/
    @Step("Enter Account info.")
    public RegestrationPage enterAccountInfo(String gender, String password) {
        //Choosing Mrs as gender from Radio bttn.
        if (gender.equals("Male")) {
            driver.findElement(gender_male_feild).click();
        } else if (gender.equals("Female")) {
            driver.findElement(gender_female_feild).click();

        } else {
            System.out.println("Please enter gender Male / Female ");
            return this;
        }
        //Send Passwaord
        driver.findElement(passward_feild).sendKeys(password);


        //Choosing day mounth year from drop down list
        new Select(driver.findElement(day_feild)).selectByIndex(2);
        new Select(driver.findElement(months_feild)).selectByIndex(2);
        new Select(driver.findElement(year_feild)).selectByIndex(2);


        //Click on two radio bbtn
        driver.findElement(setle_feild).click();
        driver.findElement(optio_feild).click();
        return this;

    }

    @Step("Enter address info.")
    public void enterAddressInfo(String firstname, String lastname, String Comapny, String Address1,
                                 String Address2, String state, String City, String ZipCode, String mobile) {
        //Send the first , lastname , address , company ,
        driver.findElement(firstName_feild).sendKeys(firstname);
        driver.findElement(lastName_feild).sendKeys(lastname);
        driver.findElement(comapny_feild).sendKeys(Comapny);
        driver.findElement(address1_feild).sendKeys(Address1);
        driver.findElement(address2_feild).sendKeys(Address2);


        new Select(driver.findElement(country_feild)).selectByIndex(1);

        //Sending Satate city , zipcode , mobile number
        driver.findElement(state_feild).sendKeys(state);
        driver.findElement(city_feild).sendKeys(City);
        driver.findElement(zipCode_feild).sendKeys(ZipCode);
        driver.findElement(mobile_feild).sendKeys(mobile);

        //Click on Create account
        driver.findElement(createAcc_bttn_feild).click();


    }

    public void NavigateToRegPage() {
        //Load Page
        driver.get(RegistrationPageUrl);
    }

}
