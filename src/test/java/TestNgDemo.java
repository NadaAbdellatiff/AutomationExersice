//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import static org.testng.Assert.assertEquals;
//
//public class TestNgDemo {
//    WebDriver driver;
//
//
//    /********************Locators*************************/
//    private By Sign_log_bttn_feild = By.linkText("Signup / Login");
//    private By UserName_feild = By.name("name");
//    private By Email_feild = By.xpath("//input[@data-qa='signup-email']");
//    private By SignUp_bttn_feild = By.xpath("//button[@data-qa='signup-button']");
//    private By Gender_male_feild = By.id("id_gender1");
//    private By Gender_female_feild = By.id("id_gender2");
//    private By Passward_feild = By.id("password");
//    private By Day_feild = By.id("days");
//    private By months_feild = By.id("months");
//    private By year_feild = By.id("years");
//    private By Setle_feild = By.id("newsletter");
//    private By Optio_feild = By.id("optin");
//    private By FirstName_feild = By.id("first_name");
//    private By LastName_feild = By.id("last_name");
//    private By Comapny_feild = By.id("company");
//    private By Address1_feild = By.id("address1");
//    private By Address2_feild = By.id("address2");
//    private By Country_feild = By.id("country");
//    private By state_feild = By.id("state");
//    private By city_feild = By.id("city");
//    private By ZipCode_feild = By.id("zipcode");
//    private By Mobile_feild = By.id("mobile_number");
//    private By CreateAcc_bttn_feild = By.xpath("//button[@data-qa='create-account']");
//    private By Contiue_bttn_feild = By.xpath("//a[@class='btn btn-primary']");
//    private By Creation_Message = By.xpath("//h2[@data-qa='account-created']");
//    private By Deletion_Message = By.xpath("//h2[@data-qa='account-deleted']");
//    private By DeleteBttnFeild = By.linkText("Delete Account");
//
//    /********************Before Class*************************/
//    @BeforeClass
//    public void Setup() {
//        driver = new ChromeDriver();
//
//        //Maximizing the screen size
//        driver.manage().window().maximize();
//        //Step1: Load the page
//        driver.get("https://automationexercise.com/");
//    }
//
//    /********************Testcase *************************/
//    @Test
//    public void regTC1() {
//        signUp("nada", "nada7890@gmail.com");
//        enterAccountInfo("Female", "123456");
//        enterAddressInfo("Nada", "Salah", "giza", "Aswan", "Alex",
//                "unkown", "Cairo", "4567", "01098765432");
//        assertCreatingAcc("ACCOUNT CREATED!");
//
//        clickOnContiueBttn();
//        DeleteAccount();
//        assertDeletingAccount("ACCOUNT DELETED!");
//    }
//
//
//    /********************After Class *************************/
//    @AfterClass
//    public void ShutDown() {
//        //Close the browser
//        driver.quit();
//
//    }
//
//    /***********************************Methods************** *************************/
//    private void signUp(String username, String email) {
//        //Step2 Clicking on signup bttn.
//        driver.findElement(Sign_log_bttn_feild).click();
//
//        //Step3 Send the name & password then click on Signup
//        driver.findElement(UserName_feild).sendKeys(username);
//        driver.findElement(Email_feild).sendKeys(email);
//        driver.findElement(SignUp_bttn_feild).click();
//    }
//
//    private void enterAccountInfo(String gender, String password) {
//        //Choosing Mrs as gender from Radio bttn.
//        if (gender.equals("Male")) {
//            driver.findElement(Gender_male_feild).click();
//        } else if (gender.equals("Female") ) {
//            driver.findElement(Gender_female_feild).click();
//
//        } else {
//            System.out.println("Please enter gender Male / Female ");
//            return;
//        }
//        //Send Passwaord
//        driver.findElement(Passward_feild).sendKeys(password);
//
//
//        //Choosing day mounth year from drop down list
//        new Select(driver.findElement(Day_feild)).selectByIndex(2);
//        new Select(driver.findElement(months_feild)).selectByIndex(2);
//        new Select(driver.findElement(year_feild)).selectByIndex(2);
//
//
//        //Click on two radio bbtn
//        driver.findElement(Setle_feild).click();
//        driver.findElement(Optio_feild).click();
//
//    }
//
//    private void enterAddressInfo(String firstname, String lastname, String Comapny, String Address1,
//                                  String Address2, String state, String City, String ZipCode, String mobile) {
//        //Send the first , lastname , address , company ,
//        driver.findElement(FirstName_feild).sendKeys(firstname);
//        driver.findElement(LastName_feild).sendKeys(lastname);
//        driver.findElement(Comapny_feild).sendKeys(Comapny);
//        driver.findElement(Address1_feild).sendKeys(Address1);
//        driver.findElement(Address2_feild).sendKeys(Address2);
//
//
//        new Select(driver.findElement(Country_feild)).selectByIndex(1);
//
//        //Sending Satate city , zipcode , mobile number
//        driver.findElement(state_feild).sendKeys(state);
//        driver.findElement(city_feild).sendKeys(City);
//        driver.findElement(ZipCode_feild).sendKeys(ZipCode);
//        driver.findElement(Mobile_feild).sendKeys(mobile);
//
//        //Click on Create account
//        driver.findElement(CreateAcc_bttn_feild).click();
//
//
//    }
//
//    private void assertCreatingAcc(String expected) {
//        Assert.assertEquals(driver.findElement(Creation_Message).getText(), expected);
//
//    }
//    private void assertDeletingAccount(String expected){
//        Assert.assertEquals(driver.findElement(Deletion_Message).getText(), expected);
//
//    }
//
//    private void clickOnContiueBttn() {
//        //Click on Contiue by using xpath then delete account by link text
//        driver.findElement(Contiue_bttn_feild).click();
//    }
//    private void DeleteAccount(){
//        driver.findElement(DeleteBttnFeild).click();
//    }
//
//
//
//}
//
//
