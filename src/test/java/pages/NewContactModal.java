package pages;
import elements.Input;
import elements.Select;
import elements.TextArea;
import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NewContactModal  {

    WebDriver driver;

    public NewContactModal(WebDriver driver) {
        this.driver = driver;
    }
    @Step("ВВОД ДАННЫХ ДЛЯ ЗАПОЛНЕНИЯ КОНТАКТА")
    public ContactsPage createContact(Contact contact) {

        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Account Name").click().selectInSearchInput(contact.getAccountName());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Title").write(contact.getTitle());

        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").write(contact.getMailingStateProvince());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZipPostalCode());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());

        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other State/Province").write(contact.getOtherStateProvince());
        new Input(driver, "Other Zip/Postal Code").write(contact.getOtherZipPostalCode());
        new Input(driver, "Other Country").write(contact.getOtherCountry());

        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Asst. Phone").write(contact.getAsstPhone());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Birthdate").write(contact.getBirthdate());


        new Select(driver, "Salutation").select(contact.getSalutation());
        new Select(driver, "Lead Source").select(contact.getLeadSource());

        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new TextArea(driver, "Other Street").write(contact.getOtherStreet());
        new TextArea(driver, "Description").write(contact.getDescription());
        clickSaveButton();

        return new ContactsPage(driver);

    }
    public void clickSaveButton(){
        driver.findElement(By.xpath("//*[@class='actionsContainer']//button[@title='Save']")).click();
    }
}

