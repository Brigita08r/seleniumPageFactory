import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='dropdown dropdown-login dropdown-tab']/a")
    private WebElement myAccountButton;
    @FindBy(xpath = "//a[@href='https://www.phptravels.net/login']")
    private WebElement loginButton;

    public LoginPage clickLogIn() {
        myAccountButton.click();
        loginButton.click();
        return new LoginPage(driver);
    }
}