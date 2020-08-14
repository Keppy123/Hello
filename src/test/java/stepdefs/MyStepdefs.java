package stepdefs;

import Page.Webdriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class MyStepdefs extends Webdriver {

    @Given("I navigate to gmail URL")
    public void iNavigateToGmailURL() {
        driver.get("https://www.gmail.com/");
    }

    @And("Enter my username and press next")
    public void enterMyUsernameAndPressNext() throws InterruptedException {
        driver.findElement(By.id("identifierId")).sendKeys("testautomationsintellij@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(4200);
    }

    @And("Enter my password and press next")
    public void enterMyPasswordAndPressNext() throws InterruptedException {
        driver.findElement(By.name("password")).sendKeys("!QAZxsw23edc");
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(7000);
    }

    @Then("I should see my email")
    public void iShouldSeeMyEmail() {
        if(driver.getTitle().contains("Inbox - testautomationsintellij@gmail.com - Gmail"))
            System.out.println("You are logged in!");
        else
            System.out.println("You are not logged in.");
        driver.close();
    }
}
