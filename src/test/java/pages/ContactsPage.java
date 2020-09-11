package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ContactsPage extends BasePage{
String locatorForCheckCreatedContact = "//*[@class='scroller actionBarPlugin']//tbody//tr//span//a[text()=\"%s\"]";
    public ContactsPage(WebDriver driver) {
        super(driver);
    }
    public NewContactModal newContact() {
        driver.findElement(By.cssSelector("[title=\"New\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='New Contact']")));
        return new NewContactModal(driver);
    }
    public void checkingThatContactWasCreated(String contactName){
        driver.get("https://ap16.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        Assert.assertTrue(driver.findElement(By.xpath(String.format(locatorForCheckCreatedContact,contactName))).isDisplayed());


    }



}
