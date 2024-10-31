package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    WebDriver webDriver;
    LoginPage loginPage;

    @BeforeEach
    public void setup() {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.onliner.by/");

        loginPage = new LoginPage(webDriver);
    }

    @Test
    public void emptyLoginEmptyPasswordTest() {
        loginPage.clickButtonEnter();

        Assertions.assertEquals(LoginMessage.ERROR_MESSAGE_ENTER_EMAIL, loginPage.getTextEnterEmail());
        Assertions.assertEquals(LoginMessage.ERROR_MESSAGE_ENTER_PASSWORD, loginPage.getTextEnterPassword());
    }
}
