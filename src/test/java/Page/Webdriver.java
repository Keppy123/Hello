package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdriver {
    public static WebDriver driver = beforeScenario();
    public static WebDriver beforeScenario()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kparker47/IdeaProjects/Hello/src/main/Driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized", "--ignore-certificate-errors");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;

    }
}
