import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement mobileNumberField;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@name='confirmpassword']")
    private WebElement passwordConfirmationField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement singUpButton;

    public RegisterPage typeFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    public RegisterPage typeLastName(String lastName) {
        lastNameField.sendKeys(lastName);
        return this;
    }

    public RegisterPage typeMobileNumber(String mobileNumber) {
        mobileNumberField.sendKeys(mobileNumber);
        return this;
    }

    public RegisterPage typeEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public RegisterPage typePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public RegisterPage confirmPassword(String password) {
        passwordConfirmationField.sendKeys(password);
        return this;
    }

    public RegisterPage registerWithValidCredits(String firstName, String lastName, String mobileNumber,
                                                 String email, String password, String confirmPassword) {
        this.typeFirstName(firstName);
        this.typeLastName(lastName);
        this.typeMobileNumber(mobileNumber);
        this.typeEmail(email);
        this.typePassword(password);
        this.confirmPassword(confirmPassword);
        singUpButton.click();
        return new RegisterPage(driver);
    }
}