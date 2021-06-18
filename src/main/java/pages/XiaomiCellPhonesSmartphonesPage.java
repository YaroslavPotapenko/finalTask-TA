package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class XiaomiCellPhonesSmartphonesPage extends BasePage{

    @FindBy(xpath = "//li[@data-currenttabindex='0']/a")
    private WebElement electronicsCategoryButton;

    @FindBy(xpath = "//nav[@aria-label='More categories']//a[contains(text(),'Xiaomi')]")
    public WebElement xiaomiCategoryButton;

    @FindBy(xpath = "//div[@class='dialog__cell']//a[contains(text(),'Smartphones')]")
    public WebElement xiaomiSmartphonesCategoryButton;

    @FindBy(xpath = "//h1/span[@class='b-pageheader__text']")
    private WebElement titleCategory;

    @FindBy(css = "input[aria-label='Best Offer'] ~ span")
    public WebElement bestOfferButton;

    @FindBy(css = "input[aria-label='Auction'] ~ span")
    public WebElement auctionButton;

    @FindBy(css = "input[aria-label='Buy It Now'] ~ span")
    public WebElement buyItNowButton;

    public XiaomiCellPhonesSmartphonesPage(WebDriver driver) {
        super(driver);
    }

    public void clickXiaomiCategoryButton() {
        xiaomiCategoryButton.click();
    }

    public void clickXiaomiSmartphonesCategoryButtonButton() {
        xiaomiSmartphonesCategoryButton.click();
    }

    public void hoverElectronicsCategoryButton() {
        actions.moveToElement(electronicsCategoryButton).build().perform();
    }

    public boolean isXiaomiCategoryButtonVisible() {
        return xiaomiCategoryButton.isDisplayed();
    }

    public boolean isXiaomiSmartphonesCategoryButtonVisible() {
        return xiaomiSmartphonesCategoryButton.isDisplayed();
    }

    public boolean isTitleCategoryVisible() {
        return titleCategory.isDisplayed();
    }

    public void clickBestOfferButton() {
        bestOfferButton.click();
    }

    public void clickAuctionButton() {
        auctionButton.click();
    }

    public void clickBuyItNowButton() {
        buyItNowButton.click();
    }
}
