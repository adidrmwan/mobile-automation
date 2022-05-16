package starter.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginPage extends BasePageObject {

    private By registerLink() {
        return MobileBy.id("textViewLinkRegister");
    }

    private By loginButton() {
        return MobileBy.xpath("//android.widget.Button[contains(@content-desc, 'Login')]");
    }

    private By emailField() {
        return MobileBy.xpath("//android.widget.EditText[contains(@text, 'Email')]");
    }

    private By passwordField() {
        return MobileBy.xpath("//android.widget.EditText[contains(@text, 'Password')]");
    }

    private By userIcon() {
        return MobileBy.xpath("//android.view.View[contains(@content-desc, 'Products')]/following-sibling::android.widget.Button");
    }

    private By toastMessage() {
        return MobileBy.xpath("//android.view.View[@content-desc= 'Email atau password tidak valid.']");
    }
    @Step
    public boolean isOnPage() {
        onClick(userIcon());
        return waitUntilPresence(loginButton()).isDisplayed();
    }

    @Step
    public void tapRegisterLink() {
        onClick(registerLink());
    }

    @Step
    public void inputEmail(String email) {
        onClick(emailField());
        onType(emailField(), email);
    }

    @Step
    public void inputPassword(String password) {
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void tapLoginButton() {
        onClick(loginButton());
    }

    @Step
    public boolean errorMessageIsdisplayed() {
        return waitUntilPresence(toastMessage()).isDisplayed();
    }
}
