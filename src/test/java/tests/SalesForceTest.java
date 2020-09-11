package tests;


import org.testng.annotations.Test;
import pages.AccountPage;

public class SalesForceTest extends BaseTest {


    @Test
    public void createAccountTest() {
        loginPage.openPage()
                .login("fakalwik-tjmd@force.com").
                toAccountsPage().
                newAccount().
                createAccount("Test").
                checkingThatAccountWasCreated("Test");

    }

    @Test()
    public void createContactTest() throws InterruptedException {
        loginPage.openPage().
                login("fakalwik-tjmd@force.com").
                toContactsPage().
                newContact().
                createContact("Test","Test")
                .checkingThatContactWasCreated("Test Test");

    }
}
