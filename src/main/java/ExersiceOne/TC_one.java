package ExersiceOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_one {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Maximizing the screen size
        driver.manage().window().maximize();

        //Step1: Load the page
        driver.get("https://automationexercise.com/");


        //Step2 Clicking on signup bttn.
        driver.findElement(By.linkText("Signup / Login")).click();

        //Step3 Send the name & password then click on Signup
        driver.findElement(By.name("name")).sendKeys("Nada");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("nada9@gmail.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

        //Choosing Mrs as gender from Radio bttn.
        driver.findElement(By.id("id_gender2")).click();
        //Send Passwaord
        driver.findElement(By.id("password")).sendKeys("123456");


        /*way to locate element from dropDown list
        driver.findElement(By.xpath("//select[@id='days']/option[@value='3']")).click();
        driver.findElement(By.xpath("//select[@id='months']/option[@value='2']")).click();
        driver.findElement(By.xpath("//select[@id='years']/option[@value='2017']")).click();
        */


        //Option 2 : Select day , month , year from dropdown list by creating istance from Select class
        WebElement dropdown_day = driver.findElement(By.id("days"));
        Select Dropdown_day = new Select(dropdown_day);
        Dropdown_day.selectByIndex(0);

        //edit on option 2
        new Select(driver.findElement(By.id("days"))).selectByIndex(2);


      /*  WebElement dropdown_month = driver.findElement(By.id("months"));
        Select Courses_Dropdown2 = new Select(dropdown_month);
        Courses_Dropdown2.selectByValue("2");

        WebElement dropdown_year = driver.findElement(By.id("years"));
        Select Courses_Dropdown3 = new Select(dropdown_year);
        Courses_Dropdown3.selectByVisibleText("2020");
      */

        new Select(driver.findElement(By.id("months"))).selectByIndex(2);
        new Select(driver.findElement(By.id("years"))).selectByIndex(2);


        //Click on two radio bbtn
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();


        //Send the first , lastname , address , company ,
        driver.findElement(By.id("first_name")).sendKeys("Nadaa");
        driver.findElement(By.id("last_name")).sendKeys("Salah");
        driver.findElement(By.id("company")).sendKeys("Giza");
        driver.findElement(By.id("address1")).sendKeys("Helioples");
        driver.findElement(By.id("address2")).sendKeys("Aswan");


        //driver.findElement(By.xpath("//select[@id='country']/option[@value='United States']")).click();
       /* WebElement dropdown_country = driver.findElement(By.id("country"));
        Select Courses_Dropdown = new Select(dropdown_country);
        Courses_Dropdown.selectByIndex(1);
*/
        new Select(driver.findElement(By.id("country"))).selectByIndex(1);

        //Sending Satate city , zipcode , mobile number
        driver.findElement(By.id("state")).sendKeys("unknown");
        driver.findElement(By.id("city")).sendKeys("cairoo");
        driver.findElement(By.id("zipcode")).sendKeys("1234");
        driver.findElement(By.id("mobile_number")).sendKeys("01002233456");

        //Click on Create account
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

        //Click on Contiue by using xpath then delete account by link text
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
        driver.findElement(By.linkText("Delete Account")).click();

        //Printing the first statment in h2 "To print Account deleted"
        System.out.println(driver.findElement(By.xpath("//h2[@data-qa ='account-deleted']")).getText());

        //Click on Contiue by using xpath
        //driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();


        //Close the browser
        // driver.quit();
    }
}
