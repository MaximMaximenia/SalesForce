package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AccountPage toAccountsPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Account/home");
        return new AccountPage(driver);
    }

    public ContactsPage toContactsPage() {
        driver.get("https://ap16.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        return new ContactsPage(driver);
    }
}
