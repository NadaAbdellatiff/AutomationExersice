package TestCases;

import POM_Demo.*;
import Utilities.DriverFacory;
import Utilities.JsonFileManager;
import Utilities.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Utilities.DriverFacory.initiateDriver;


public class Tests {
    private WebDriver driver;
    private JsonFileManager jsonFileManager;

    private HomePage homePage;
    private SignUpPage signUpPage;
    private RegestrationPage regestrationPage;
    private AccountcreatedPage accountcreatedPage;
    private AccountDeletedPage accountDeletedPage;
    private MenuSkelton menuSkelton;

    @BeforeClass
    public void Setup() {
        //driver = new ChromeDriver();
        driver = initiateDriver(System.getProperty("browserName"), true , true);

        //jsonFileManager = new JsonFileManager("E:\\Automation\\AutomationExersice\\src\\test\\resources\\TestDataJsonFile\\TestData.json");
        jsonFileManager = new JsonFileManager("src/test/resources/TestDataJsonFile/TestData.json");



    }
    /********************Before Suite *************************/
    @BeforeSuite
    public void beforeSuit(){
        PropertiesReader.loadProperties();
    }


    /********************Testcase *************************/
    @Test(description = "Registration Test cases")
    @Description("Registration Test case ")

    @Severity(SeverityLevel.CRITICAL)
    public void regTC1() {
        new HomePage(driver)
                .navigateToHomePage();

        new MenuSkelton(driver)
                .signUpClick();

        new SignUpPage(driver)
                .signUp1(jsonFileManager.getTestData("username"), jsonFileManager.getTestData("email"));

        new RegestrationPage(driver).enterAccountInfo("Male", jsonFileManager.getTestData("newPassword"))
                .enterAddressInfo("nada", "salah", "giza", "aswan", "alex", "cairo",
                        "giza", "1234", "12344");

        new AccountcreatedPage(driver)
                .assertCreatingAcc("ACCOUNT CREATED!")
                .clickOnContiueBttn();

        new MenuSkelton(driver)
                .deleteClick();

        new AccountDeletedPage(driver).
                assertDeletingAccount("ACCOUNT DELETED!")
                .clickOnContiueBttn();



    }

    @Test(description = "Login Test cases")
    @Description("login Test case ")
    @Severity(SeverityLevel.CRITICAL)
    public void LoginTC2() {
        new HomePage(driver)
                .navigateToHomePage();

        new MenuSkelton(driver)
                .signUpClick();

        new SignUpPage(driver)
                .signUp1(jsonFileManager.getTestData("username"), jsonFileManager.getTestData("email"));

        new RegestrationPage(driver).enterAccountInfo("Male", jsonFileManager.getTestData("newPassword"))
                .enterAddressInfo("nada", "salah", "giza", "aswan", "alex", "cairo",
                        "giza", "1234", "12344");

        new AccountcreatedPage(driver)
                .assertCreatingAcc("ACCOUNT CREATED!")
                .clickOnContiueBttn();

        new MenuSkelton(driver)
                .logOut();

        new SignUpPage(driver)
                .login(jsonFileManager.getTestData("email"),jsonFileManager.getTestData("newPassword") );


        new MenuSkelton(driver)
                .deleteClick();

        new AccountDeletedPage(driver).
                assertDeletingAccount("ACCOUNT DELETED!")
                .clickOnContiueBttn();



    }


    /********************After Class *************************/
    @AfterClass
    public void ShutDown() {
        //Close the browser
        driver.quit();

    }


}




/// ////////////////WithoutFluent///////////
//       homePage.navigateToHomePage();
//       homePage.signUpClick();
//       signUpPage.signUp1("nada" , "nada68@gmail.com");
//       regestrationPage.enterAccountInfo("Male", "12345");
//       regestrationPage.enterAddressInfo("nada", "salah" , "giza" , "aswan" ,"alex" ,"cairo" ,
//               "giza" , "1234" , "12344");
//       accountcreatedPage.assertCreatingAcc("ACCOUNT CREATED!");
//       accountcreatedPage.clickOnContiueBttn();
//       homePage.deleteClick();
//       accountDeletedPage.assertDeletingAccount("ACCOUNT DELETED!");
//       accountDeletedPage.clickOnContiueBttn();
