package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String locator = "//span[text()='%s']/ancestor::div[contains(@class,\"uiInput\")]//input";
    String locatorForSearchInput = "//*[@class='lookup__list  visible']//li//div//div[text()='%s']";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);

    }

    public Input click() {
        driver.findElement(By.xpath(String.format(locator, label))).click();
        return this;
    }

    public void selectInSearchInput(String accountName) {
        driver.findElement(By.xpath(String.format(locatorForSearchInput,accountName))).click();

    }
}
