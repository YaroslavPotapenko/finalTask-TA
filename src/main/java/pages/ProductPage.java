package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//select[@name='Color']")
    public WebElement select;

    @FindBy(xpath = "//select[@name='Color']/option[@value='0']")
    public WebElement selectOption;

    @FindBy(xpath = "//h3[@class='s-item__title']")
    public WebElement productTitleButton;

    @FindBy(xpath = "//span[contains(@class,'close')]")
    public WebElement closePopUp;

    @FindBy(xpath = "//a[@id='isCartBtn_btn']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//a[@id='smtBackToAnchorBTF']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//i[@id='gh-cart-n']")
    public WebElement itemsAmountInCart;

    @FindBy(xpath = "//button[@data-test-id='cta-top']")
    public WebElement goToCheckoutButton;

    @FindBy(xpath = "//button[@id='gxo-btn']")
    public WebElement continueAsGuestButton;

    @FindBy(xpath = "//button[@data-test-id='CONFIRM_AND_PAY_BUTTON']")
    public WebElement confirmAndPayButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickClosePopUp() {
        closePopUp.click();
    }

    public void productColorDropDown() {
        select.click();
    }

    public void selectProductColor() {
        selectOption.click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickSelectProductButton() {
        productTitleButton.click();
    }

    public void clickContinueAsGuestButton() {
        continueAsGuestButton.click();
    }

    public void clickGoToCheckoutButton() {
        goToCheckoutButton.click();
    }

    public void isContinueShoppingButtonVisible() {                                                        // +++
        continueShoppingButton.isDisplayed();
    }

    public boolean isProductTitleButtonVisible() {
        return productTitleButton.isDisplayed();
    }

    public boolean isConfirmAndPayButtonVisible() {                                                        // +++
        return confirmAndPayButton.isDisplayed();
    }

    public String itemsAmountInCart() {
        return itemsAmountInCart.getText();
    }
}
