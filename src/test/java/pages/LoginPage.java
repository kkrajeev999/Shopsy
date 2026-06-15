package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.cssSelector("button[type='submit']");

    public LoginPage() {
        this.driver = driver;
        // Constructor can be used to initialize elements if needed
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
            public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();


      }}
