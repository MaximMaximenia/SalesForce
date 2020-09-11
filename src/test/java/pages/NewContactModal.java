package pages;
import elements.Input;
import elements.Select;
import elements.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NewContactModal  {

    WebDriver driver;

    public NewContactModal(WebDriver driver) {
        this.driver = driver;
    }

    public ContactsPage createContact(String firstName, String lastName) {

        new Input(driver, "First Name").write(firstName);
        new Input(driver, "Last Name").write(lastName);
        new Input(driver, "Phone").write("+222222");
        new Input(driver, "Mobile").write("222");
        new Input(driver, "Account Name").click().selectInSearchInput("Test");
        new Input(driver, "Email").write("test@mailinator.com");
        new Input(driver, "Title").write("99999999999999");

        new Input(driver, "Mailing City").write("TestLand");
        new Input(driver, "Mailing State/Province").write("Testy");
        new Input(driver, "Mailing Zip/Postal Code").write("Tess");
        new Input(driver, "Mailing Country").write("2222");

        new Input(driver, "Other City").write("TestLand");
        new Input(driver, "Other State/Province").write("Test");
        new Input(driver, "Other Zip/Postal Code").write("Tess");
        new Input(driver, "Other Country").write("332323");

        new Input(driver, "Fax").write("332323");
        new Input(driver, "Home Phone").write("332323");
        new Input(driver, "Other Phone").write("332323");
        new Input(driver, "Asst. Phone").write("332323");
        new Input(driver, "Assistant").write("332323");
        new Input(driver, "Department").write("332323");
        new Input(driver, "Birthdate").write("1/2/1983");


        new Select(driver, "Salutation").select("Mr.");
        new Select(driver, "Lead Source").select("In-Store");

        new TextArea(driver, "Mailing Street").write("test,2");
        new TextArea(driver, "Other Street").write("test,23231");
        new TextArea(driver, "Description").write("test");
        clickSaveButton();
        return new ContactsPage(driver);

    }
    public void clickSaveButton(){
        driver.findElement(By.xpath("//*[@class='actionsContainer']//button[@title='Save']")).click();
    }
}

