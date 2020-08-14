//package browsers;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class GmailAccount {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/kparker47/IdeaProjects/Hello/src/main/Driver/chromedriver.exe");
//
//    WebDriver driver = new ChromeDriver();
//    driver.get("https://www.gmail.com/");
//    driver.manage().window().maximize();
//    driver.findElement(By.id("identifierId")).sendKeys("testautomationsintellij@gmail.com");
//    driver.findElement(By.id("identifierNext")).click();
//        Thread.sleep(4200);
//        driver.findElement(By.name("password")).sendKeys("!QAZxsw23edc");
//        driver.findElement(By.id("passwordNext")).click();
//        Thread.sleep(7000);
//        driver.close();
//
//    }
//}