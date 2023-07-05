package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmPassword");
    private By nameErrorMessage = By.xpath("//div[contains (@class , 'v-messages__message')]/preceding::input[@name='name']");
    private By emailErrorMessage = By.xpath("//div[contains (@class , 'v-messages__message')]/preceding::input[@name='email']");
    private By passwordErrorMessage = By.xpath("//div[contains (@class , 'v-messages__message')]/preceding::input[@name='password']");
    private By confirmPasswordErrorMessage = By.xpath("//div[contains (@class , 'v-messages__message')]/preceding::input[@name='confirmPassword']");
    private By signUpBtn = By.xpath("//button[@type='submit']//span");
    public SignUpPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }



    public void enterDataToNameField(String text){
        getDriver().findElement(nameField).sendKeys(text);
    }
    public void enterDataToEmailField(String text){
        getDriver().findElement(emailField).sendKeys(text);
    }
    public void enterDataToPasswordField(String text){
        getDriver().findElement(passwordField).sendKeys(text);
    }
    public void enterDataToConfirmPasswordField(String text){
        getDriver().findElement(confirmPasswordField).sendKeys(text);
    }
    public boolean nameErrorMessageIsShown() {
        getDriver().findElement(nameErrorMessage).isDisplayed();
        return true;
    }
    public boolean emailErrorMessageIsShown() {
        getDriver().findElement(emailErrorMessage).isDisplayed();
        return true;
    }
    public boolean passwordErrorMessageIsShown() {
        getDriver().findElement(passwordErrorMessage).isDisplayed();
        return true;
    }
    public boolean confirmPasswordErrorMessage() {
        getDriver().findElement(confirmPasswordErrorMessage).isDisplayed();
        return true;
    }
    public void clickSignUPBtn(){
        getDriver().findElement(signUpBtn).click();
    }


    public void open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
    }
}


