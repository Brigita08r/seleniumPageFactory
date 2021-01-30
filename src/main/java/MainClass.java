import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\GitHub\\seleniumWebPageTesting\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.phptravels.net/home");

        //Page Object Model example
        //MainPage mainPage = new MainPage(driver);
        //mainPage.clickLogIn();
        
        //Page Factory
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickLogIn();

        driver.quit();
    }
}