package pages;
import elements.Input;
import elements.Select;
import elements.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NewAccountModal {

    WebDriver driver;

    public NewAccountModal(WebDriver driver) {
        this.driver = driver;
    }

    public AccountPage createAccount(String accountName) {

        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Phone").write("+222222");
        new Input(driver, "Fax").write("222");
        new Input(driver, "Website").write("test.com");
        new Input(driver, "Employees").write("12");

        new Input(driver, "Annual Revenue").write("99999999999999");

        new Input(driver, "Billing Country").write("TestLand");
        new Input(driver, "Billing City").write("Testy");
        new Input(driver, "Billing State/Province").write("Tess");
        new Input(driver, "Billing Zip/Postal Code").write("2222");

        new Input(driver, "Shipping Country").write("TestLand");
        new Input(driver, "Shipping City").write("Test");
        new Input(driver, "Shipping State/Province").write("Tess");
        new Input(driver, "Shipping Zip/Postal Code").write("332323");


        new Select(driver, "Type").select("Analyst");
        new Select(driver, "Industry").select("Agriculture");

        new TextArea(driver, "Billing Street").write("test,2");
        new TextArea(driver, "Shipping Street").write("test,23231");
        new TextArea(driver, "Description").write("test");

        driver.findElement(By.xpath("//*[@class='actionsContainer']//button[@title='Save']")).click();
        return new AccountPage(driver);
    }
}
