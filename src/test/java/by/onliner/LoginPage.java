package by.onliner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickButtonEnter() {
        WebElement buttonEnterWebElement = webDriver.findElement(By.xpath(LoginXpath.BUTTON_ENTER_XPATH));
        buttonEnterWebElement.click();
    }

    public void sendKeysInputEmail(String email) {
        WebElement inputEmailWebElement = webDriver.findElement(By.xpath(LoginXpath.INPUT_EMAIL_XPATH));
        inputEmailWebElement.sendKeys(email);
    }

    public void sendKeysInputPassword(String password) {
        WebElement inputPasswordWebElement = webDriver.findElement(By.xpath(LoginXpath.INPUT_PASSWORD_XPATH));
        inputPasswordWebElement.sendKeys(password);
    }
}
