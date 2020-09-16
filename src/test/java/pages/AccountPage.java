package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AccountPage extends BasePage {

String locatorForCheckCreatedAccount = "//*[@class='scroller actionBarPlugin']//tbody//tr//span//a[text()=\"%s\"]";

    public AccountPage(WebDriver driver) {
        super(driver);
    }
    @Step("ОТКРЫТЬ ОКНО СОЗДАНИЯ НОВОГО АККАУНТА")
    public NewAccountModal newAccount() {

        driver.findElement(By.cssSelector("[title=\"New\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='New Account']")));

        return new NewAccountModal(driver);
    }
    @Step("ПРОВЕРКА ЧТО АККАУНТ С ДАННЫМ ИМЕНЕМ БЫЛ СОЗДАН")
    public void checkingThatAccountWasCreated(String accountName){
driver.get("https://ap16.lightning.force.com/lightning/o/Account/list?filterName=Recent");
Assert.assertTrue(driver.findElement(By.xpath(String.format(locatorForCheckCreatedAccount,accountName))).isDisplayed());


    }
}
