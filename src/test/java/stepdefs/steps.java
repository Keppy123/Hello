package stepdefs;

import Page.Webdriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import javax.swing.*;

public class steps extends Webdriver {

    @Given("I go to Adactin URL")
    public void iGoToAdactinUrl() {
        driver.get("https://adactinhotelapp.com");
    }

    @When("I select {string}")
    public void iSelectNewUserRegisterHere(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    @And("I input correct details")
    public void iInputCorrectDetails() {
        driver.findElement(By.id("username")).sendKeys("KParker12");
        driver.findElement(By.id("password")).sendKeys("!QAZxsw23edc");
        driver.findElement(By.id("re_password")).sendKeys("!QAZxsw23edc");
        driver.findElement(By.id("full_name")).sendKeys("Kelly Parker");
        driver.findElement(By.id("email_add")).sendKeys("testautomationsintellij@gmail.com");
    }

    @And("I solve the Captcha")
    public void iSolveTheCaptcha() {
        String captchaVal = JOptionPane.showInputDialog("captcha.png");
        driver.findElement(By.id("captcha-form")).sendKeys(captchaVal);
        driver.findElement(By.id("tnc_box")).click();
        driver.findElement(By.id("Submit")).click();
    }

    @Then("I should create a new account")
    public void iShouldCreateANewAccount() throws InterruptedException {
        Thread.sleep(7000);
        driver.close();
    }
}



