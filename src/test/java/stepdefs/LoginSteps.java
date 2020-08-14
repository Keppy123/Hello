package stepdefs;

import Page.Webdriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LoginSteps extends Webdriver {

    @Given("I go to Adactin website")
    public void iGoToAdactinWebsite() {
        driver.get("https://adactinhotelapp.com");
    }

    @When("I log in with Username & Password")
    public void iLogInWithUsernamePassword() {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Kparker123");
        driver.findElement(By.id("password")).sendKeys("!QAZxsw23edc");
    }

    @And("I press Login")
    public void iPressLogin() {
        driver.findElement(By.name("login")).click();
    }

    @Then("I should see the booking screen")
    public void iShouldSeeTheBookingScreen() throws InterruptedException {
        if(driver.getTitle().contains("Adactin.com - Search Hotel"))
            System.out.println("You are logged in!");
        Thread.sleep(4000);
        driver.close();
    }

    @Given("I log into Adactin")
    public void iLogIntoAdactin() {
        driver.get("https://adactinhotelapp.com");
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Kparker123");
        driver.findElement(By.id("password")).sendKeys("!QAZxsw23edc");
        driver.findElement(By.name("login")).click();
    }

    @When("I fill in the search form")
    public void iFillInTheSearchForm() throws InterruptedException {
        driver.findElement(By.name("location")).sendKeys("London");
        driver.findElement(By.name("hotels")).sendKeys("Hotel Creek");
        driver.findElement(By.id("room_type")).sendKeys("Double");
        driver.findElement(By.xpath("//*[@id=\"room_nos\"]")).sendKeys("2");
        driver.findElement(By.name("datepick_in")).clear();
        driver.findElement(By.name("datepick_in")).sendKeys("20/08/2020");
        driver.findElement(By.name("datepick_out")).clear();
        driver.findElement(By.name("datepick_out")).sendKeys("22/08/2020");
        driver.findElement(By.xpath("//*[@id=\"adult_room\"]")).sendKeys("2 - Two");
        Thread.sleep(2000);
    }

    @And("Click search")
    public void clickSearch() {
        driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
    }

    @And("I select the hotel and press continue")
    public void iSelectTheHotelAndPressContinue() {
        driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]")).click();
        driver.findElement(By.id("continue")).click();
    }

    @And("I fill in account details and press book now")
    public void iFillInAccountDetailsAndPressBookNow() throws InterruptedException {
        driver.findElement(By.name("first_name")).sendKeys("Kelly");
        driver.findElement(By.id("last_name")).sendKeys("Parker");
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("123 Fake Lane");
        driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
        driver.findElement(By.name("cc_type")).sendKeys("VISA");
        driver.findElement(By.id("cc_exp_month")).sendKeys("July");
        driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]")).sendKeys("2022");
        driver.findElement(By.name("cc_cvv")).sendKeys("123");
        driver.findElement(By.id("book_now")).click();
        Thread.sleep(4000);
    }

    @Then("I should see Booking Confirmation")
    public void iShouldSeeBookingConfirmation() throws InterruptedException {
        if(driver.getTitle().contains("Adactin.com - Hotel Booking Confirmation"))
            System.out.println("You have booked your hotel!");
        Thread.sleep(4000);
        driver.close();
    }
}