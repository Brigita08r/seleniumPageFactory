import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='https://www.phptravels.net/login']")
    private WebElement logInButton;
    @FindBy(xpath = "//a[@href='https://www.phptravels.net/register']")
    private WebElement registerButton;

    public LoginPage clickLog() {
        logInButton.click();
        registerButton.click();
        return new LoginPage(driver);
    }
}