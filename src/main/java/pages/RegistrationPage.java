package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    @FindBy(xpath = "//form[@name='create-personal-account-with-email']")
    private WebElement registrationForm;

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='module--reclaim-container']/h1")
    public WebElement alertMessage;

    @FindBy(xpath = "//span[@id='firstname_err']")
    private WebElement firstNameError;

    @FindBy(xpath = "//span[@id='lastname_err']")
    private WebElement lastNameError;

    @FindBy(xpath = "//span[@id='Email_err']")
    private WebElement emailError;

    @FindBy(xpath = "//span[@id='password_err']")
    private WebElement passwordError;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void fillFirstNameField( final String firstName ) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void firstNameFieldClick() {
        firstNameField.click();
    }

    public void fillLastNameField(final String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void fillEmailField(final String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void fillPasswordField(final String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isRegistrationFormVisible() {
        return registrationForm.isDisplayed();
    }

    public boolean isAlertMessageVisible() {
        return alertMessage.isDisplayed();
    }

    public boolean isFirstNameErrorVisible() {
        return firstNameError.isDisplayed();
    }

    public boolean isLastNameErrorVisible() {
        return lastNameError.isDisplayed();
    }

    public boolean isEmailErrorVisible() {
        return emailError.isDisplayed();
    }

    public boolean isPasswordErrorVisible() {
        return passwordError.isDisplayed();
    }


}
