package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("ПЕРЕХОД НА СТРАНИЦУ АКАУНТОВ")
    public AccountPage toAccountsPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Account/home");
        return new AccountPage(driver);
    }
    @Step("ПЕРЕХОД НА СТРАНИЦУ КОНТАКТОВ")
    public ContactsPage toContactsPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        return new ContactsPage(driver);
    }
}
