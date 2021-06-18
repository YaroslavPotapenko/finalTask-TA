package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.ProductPage;
import pages.RegistrationPage;
import pages.XiaomiCellPhonesSmartphonesPage;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public RegistrationPage getRegistrationPage() {
        return new RegistrationPage(driver);
    }

    public XiaomiCellPhonesSmartphonesPage getXiaomiCellPhonesSmartphonesPage() {
        return new XiaomiCellPhonesSmartphonesPage(driver);
    }

    public ProductPage getProductPage() {
        return new ProductPage(driver);
    }
}
