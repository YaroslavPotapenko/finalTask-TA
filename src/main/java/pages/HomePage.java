package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "//li[@id='gh-minicart-hover']")
    private WebElement cartIcon;

    @FindBy(xpath = "//a[@id='gf-fbtn']")
    private WebElement languageButton;

    @FindBy(xpath = "//span[@id='gh-ug']/a")
    private WebElement signInButton;

    @FindBy(xpath = "//span[@id='gh-ug']/span/a")
    private WebElement registerButton;

    @FindBy(xpath = "//input[@id='gh-ac']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@id='gh-btn']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void isHeaderVisible() {
        header.isDisplayed();
    }

    public void isFooterVisible() {
        footer.isDisplayed();
    }

    public boolean isCartIconVisible() {
        return cartIcon.isDisplayed();
    }

    public boolean isSignInButtonVisible() {
        return signInButton.isDisplayed();
    }

    public boolean isRegisterButtonVisible() {
        return registerButton.isDisplayed();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public boolean isSearchFieldVisible() {
        return searchField.isDisplayed();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public boolean isSearchButtonVisible() {
        return searchButton.isDisplayed();
    }

    public boolean isLanguageButtonVisible() {
        return languageButton.isDisplayed();
    }
}
