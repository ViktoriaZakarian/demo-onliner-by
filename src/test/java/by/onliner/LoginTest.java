package by.onliner;

import org.junit.jupiter.api.AfterEach;
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

    @Test
    public void emptyPasswordTest() {
        loginPage.sendKeysInputEmail("zakarianviktoria@gmail.com");
        loginPage.clickButtonEnter();

        Assertions.assertEquals(LoginMessage.ERROR_MESSAGE_ENTER_PASSWORD, loginPage.getTextEnterPassword());
    }

    @Test
    void emptyLoginTest() {
        loginPage.sendKeysInputPassword("fbbffb");
        loginPage.clickButtonEnter();

        Assertions.assertEquals(LoginMessage.ERROR_MESSAGE_ENTER_EMAIL, loginPage.getTextEnterEmail());
    }

    @Test
    public void filledOutFormWithIncorrectDataTest() {
        loginPage.sendKeysInputEmail("zkr.vkr@gmail.com");
        loginPage.sendKeysInputPassword("bvdsbvu");
        loginPage.clickButtonEnter();

        Assertions.assertEquals(LoginMessage.INVALID_LOGIN_OR_PASSWORD, loginPage.getTextInvalidLoginOrPassword());
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
