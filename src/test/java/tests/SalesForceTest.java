package tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import io.qameta.allure.*;
import models.Contact;
import org.testng.annotations.Test;
@Listeners(TestListener.class)
public class SalesForceTest extends BaseTest {

    Contact contact = new Contact("229", "Ld", "Test", "Mr.", "Test", "mas@mail.ru", "asdas", "Gomel", "Yakydza",
            "23213", "Keln", "Gock", "Klein", "2232", "Ketr", "23213", "+228",
            "+227", "226", "2292", "Og", "1/2/1983", "In-Store", "Swag", "Ssad", "dadas", "Test");

    @Step("1.Открыть страницу.(salesforce.com)")
    @Description("ПРОВЕРКА ЧТО АККАУНТ СОЗДАЕТСЯ.")
    @Issue("shooter")
    @TmsLink("1313.ss")
    @Test
    public void createAccountTest() {
        loginPage.openPage()
                .login("fakalwik-tjmd@force.com").
                toAccountsPage().
                newAccount().
                createAccount("Test").
                checkingThatAccountWasCreated("Test");
    }

    @Description("ПРОВЕРКА ЧТО КОНТАКТ СОЗДАЕТСЯ.")
    @Issue("shooter")
    @Test()
    @TmsLink("1313.ss")
    public void createContactTest() {
        loginPage.openPage().
                login("fakalwik-tjmd@force.com").
                toContactsPage().
                newContact().
                createContact(contact)
                .checkingThatContactWasCreated("Test Test");


    }


}
