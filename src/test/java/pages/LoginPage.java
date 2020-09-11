package pages;

import elements.Password;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String login) {
        Password pass = new Password();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(pass.getPassword());
        driver.findElement(By.id("Login")).click();
return new HomePage(driver);

    }

    public LoginPage openPage() {
        driver.get("https://login.salesforce.com/");
        return this;
    }
}
