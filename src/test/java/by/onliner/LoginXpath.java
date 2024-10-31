package by.onliner;

public class LoginXpath {

    public static final String BUTTON_ENTER_XPATH = "//button[@type='submit']";
    public static final String INPUT_EMAIL_XPATH = "//input[@class='auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full'][1]";
    public static final String INPUT_PASSWORD_XPATH = "//input[@class='auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full'][2]";
    public static final String ERROR_MESSAGE_ENTER_EMAIL_XPATH = "//div[@class='auth-form__description auth-form__description_error auth-form__description_base auth-form__description_extended-other'][1]";
    public static final String ERROR_MESSAGE_ENTER_PASSWORD_XPATH = "//div[@class='auth-form__description auth-form__description_error auth-form__description_base auth-form__description_extended-other'][2]";
    public static final String INVALID_LOGIN_OR_PASSWORD_XPATH = "//*[@class='auth-form__description auth-form__description_error auth-form__description_base auth-form__description_extended-other']";
    public static final String ENTRANCE_XPATH = "//*[text()='Вход']";
    public static final String BUTTON_ACCEPT_ALL_COOKIES_XPATH = "//a[@id='submit-button']";
}
