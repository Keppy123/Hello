package Page;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewUserPage {
  public static ChromeDriver WebDriver()
  {
    System.setProperty("webdriver.chrome.driver", "C:/Users/kparker47/IdeaProjects/Hello/src/main/Driver/chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("start-maximized", "--ignore-certificate-errors");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    return driver;

  }
}
