package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 60;
    private static final String ITEMS_AMOUNT = "2";
    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;
    RegistrationPage registrationPage;
    XiaomiCellPhonesSmartphonesPage xiaomiCellPhonesSmartphonesPage;
    PageFactoryManager pageFactoryManager;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User checks header visibility")
    public void checkHeaderVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.isHeaderVisible();
    }

    @And("User checks search field visibility")
    public void checkSearchVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.isSearchFieldVisible();
    }

    @And("User checks footer visibility")
    public void checkFooterVisibility() {
        homePage.isFooterVisible();
    }

    @And("User checks cart visibility")
    public void checkCartVisibility() {
        assertTrue(homePage.isCartIconVisible());
    }


    @And("User checks language button visibility")
    public void checkLanguageButtonVisibility() {
        assertTrue(homePage.isLanguageButtonVisible());
    }

    @And("User checks register button visibility")
    public void checkRegisterButtonVisibility() {
        assertTrue(homePage.isRegisterButtonVisible());
    }

    @And("User checks search button visibility")
    public void checkSearchButtonVisibility() {
        assertTrue(homePage.isSearchButtonVisible());
    }

    @And("User checks sign in button visibility")
    public void checkSignInButtonVisibility() {
        assertTrue(homePage.isSignInButtonVisible());
    }

    @And("User checks that current url contains {string}")
    public void checkCurrentUrl(final String query) {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(driver.getCurrentUrl().contains(query));
    }

    @And("User makes search by keyword {string}")
    public void enterKeywordToSearchField(final String keyword) {
        homePage.enterTextToSearchField(keyword);
    }

    @And("User clicks search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        productPage = pageFactoryManager.getProductPage();
    }

    @And("User clock click close pop up button")
    public void clickClosePopUpButton() {
        productPage.clickClosePopUp();
    }

    @And("User checks 'Continue Shopping' button visibility")
    public void checkContinueShoppingButtonVisibility() {
        productPage.isContinueShoppingButtonVisible();
    }

    @And("User checks registration form visibility")
    public void checkRegistrationFormVisibility() {
        assertTrue(registrationPage.isRegistrationFormVisible());
    }

    @And("User fill first name field {string}")
    public void fillFirstNameField(final String firstName) {
        registrationPage.fillFirstNameField(firstName);
    }

    @And("User clicks 'Register' button")
    public void clickRegisterButton() {
        homePage.clickRegisterButton();
        registrationPage = pageFactoryManager.getRegistrationPage();
        registrationPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        registrationPage.waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
    }

    @And("User fill last name field {string}")
    public void fillLastNameField(final String lastName) {
        registrationPage.fillLastNameField(lastName);
    }

    @And("User fill email field {string}")
    public void fillEmailField(final String email) {
        registrationPage.fillEmailField(email);
    }

    @And("User fill password field {string}")
    public void fillPasswordField(final String password) {
        registrationPage.fillPasswordField(password);
    }

    @Then("User clicks 'Create account' button")
    public void clickSubmitButton() {
        registrationPage.waitElementToBeClickable(DEFAULT_TIMEOUT, registrationPage.submitButton);
        registrationPage.clickSubmitButton();
    }

    @And("User checks alert message visibility")
    public void checkAlertMessageVisibility() {
        registrationPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        registrationPage.waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
        registrationPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,registrationPage.alertMessage);
        assertTrue(registrationPage.isAlertMessageVisible());
    }

    @And("User checks first name error message visibility")
    public void checkFirstNameErrorVisibility() {
        registrationPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        registrationPage.waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
        assertTrue(registrationPage.isFirstNameErrorVisible());
    }

    @And("User checks second name error message visibility")
    public void checkLastNameErrorVisibility() {
        registrationPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        registrationPage.waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
        assertTrue(registrationPage.isLastNameErrorVisible());
    }

    @And("User checks email error message visibility")
    public void checkEmailErrorVisibility() {
        registrationPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        registrationPage.waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
        assertTrue(registrationPage.isEmailErrorVisible());
    }

    @And("User checks password error message visibility")
    public void checkPasswordErrorVisibility() {
        registrationPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        registrationPage.waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
        assertTrue(registrationPage.isPasswordErrorVisible());
    }

    @And("User clicks first name field")
    public void clickFirstNameField() {
        registrationPage.firstNameFieldClick();
    }

    @And("User clicks 'Select color' button")
    public void productColorDropDown() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,productPage.select);
        productPage.productColorDropDown();
    }

    @And("User clicks 'Gray color' button")
    public void clickSelectProductColor() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,productPage.selectOption);
        productPage.selectProductColor();
    }

    @And("User clicks on product title")
    public void clickSelectProductButton() {
        productPage.clickSelectProductButton();
    }

    @And("User clicks 'Add to Cart' button on product")
    public void clickAddToCart() {
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        productPage.waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,productPage.addToCartButton);
        productPage.clickAddToCartButton();
    }

    @And("User checks product title visibility")
    public void checkProductTitleButtonVisibility() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,productPage.productTitleButton);
        assertTrue(productPage.isProductTitleButtonVisible());
    }

    @And("User checks items amount in product cart")
    public void checkItemsAmount() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,productPage.itemsAmountInCart);
        assertEquals(ITEMS_AMOUNT,productPage.itemsAmountInCart());
    }

    @And("User clicks 'Go to checkout' button")
    public void clickGoToCheckoutButton() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.goToCheckoutButton);
        productPage.clickGoToCheckoutButton();
    }

    @And("User clicks 'Continue as guest' button")
    public void clickContinueAsGuestButton() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,productPage.continueAsGuestButton);
        productPage.clickContinueAsGuestButton();
    }

    @And("User checks 'confirm and pay' button visibility")
    public void checkConfirmAndPayButtonVisibility() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,productPage.confirmAndPayButton);
        assertTrue(productPage.isConfirmAndPayButtonVisible());
    }

    @And("User hover 'Electronics category button'")
    public void hoverElectronicsCategoryButton() {
        xiaomiCellPhonesSmartphonesPage = pageFactoryManager.getXiaomiCellPhonesSmartphonesPage();
        xiaomiCellPhonesSmartphonesPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        xiaomiCellPhonesSmartphonesPage.waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
        xiaomiCellPhonesSmartphonesPage.hoverElectronicsCategoryButton();

    }
    @And("User checks 'Xiaomi Category' button visibility")
    public void checkXiaomiCategoryButtonVisibility() {
        xiaomiCellPhonesSmartphonesPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,xiaomiCellPhonesSmartphonesPage.xiaomiCategoryButton);
        assertTrue(xiaomiCellPhonesSmartphonesPage.isXiaomiCategoryButtonVisible());
    }
    @And("User clicks 'Xiaomi Category' button]")
    public void clickXiaomiCategoryButton() {
        xiaomiCellPhonesSmartphonesPage.clickXiaomiCategoryButton();
    }

    @And("User checks 'Xiaomi smartphones category' button visibility")
    public void checksXiaomiSmartphonesCategoryButtonVisibility() {
        assertTrue(xiaomiCellPhonesSmartphonesPage.isXiaomiSmartphonesCategoryButtonVisible());
    }

    @And("User clicks 'Xiaomi smartphones category' button")
    public void clickXiaomiSmartphonesCategoryButtonButton() {
        xiaomiCellPhonesSmartphonesPage.clickXiaomiSmartphonesCategoryButtonButton();
    }

    @And("User checks title visibility")
    public void checkTitleCategoryVisibility() {
        assertTrue(xiaomiCellPhonesSmartphonesPage.isTitleCategoryVisible());
    }

    @And("User clicks 'Best offer' button")
    public void clickBestOfferButton() {
        xiaomiCellPhonesSmartphonesPage.waitElementToBeClickable(DEFAULT_TIMEOUT,xiaomiCellPhonesSmartphonesPage.bestOfferButton);
        xiaomiCellPhonesSmartphonesPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        xiaomiCellPhonesSmartphonesPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        xiaomiCellPhonesSmartphonesPage.clickBestOfferButton();
        xiaomiCellPhonesSmartphonesPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User clicks 'Auction' button")
    public void clickAuctionButton() {
        xiaomiCellPhonesSmartphonesPage.waitElementToBeClickable(DEFAULT_TIMEOUT,xiaomiCellPhonesSmartphonesPage.auctionButton);
        xiaomiCellPhonesSmartphonesPage.clickAuctionButton();
        xiaomiCellPhonesSmartphonesPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }


    @And("User clicks 'Buy It Now' button")
    public void clickBuyItNowButton() {
        xiaomiCellPhonesSmartphonesPage.waitElementToBeClickable(DEFAULT_TIMEOUT,xiaomiCellPhonesSmartphonesPage.buyItNowButton);
        xiaomiCellPhonesSmartphonesPage.clickBuyItNowButton();
        xiaomiCellPhonesSmartphonesPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @After
    public void tearDown() {
        driver.close();
    }

}
