package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage{
    @FindBy(id = "name" )
    private WebElement nameField;
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy (id = "password")
    private WebElement passwordField;
    @FindBy (id = "confirmPassword")
    private WebElement confirmPasswordField;
    @FindBy (xpath = "//button[@type='submit']//span")
    private WebElement signUpBtn;
    @FindBy(xpath = "//div[contains (@class , 'v-messages__message')]/preceding::input[@name='name']")
    private WebElement nameErrorMessage;
    @FindBy(xpath = "//div[contains (@class , 'v-messages__message')]/preceding::input[@name='email']")
    private WebElement emailErrorMessage;
    @FindBy(xpath = "//div[contains (@class , 'v-messages__message')]/preceding::input[@name='password']")
    private WebElement passwordErrorMessage;
    @FindBy(xpath = "//div[contains (@class , 'v-messages__message')]/preceding::input[@name='confirmPassword']"  )
    private WebElement confirmPasswordErrorMessage;

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(getDriver(), this);
    }

    public void enterDataToNameField(String text){
        nameField.sendKeys(text);
    }
    public void enterDataToEmailField(String text){
        emailField.sendKeys(text);
    }
    public void enterDataToPasswordField(String text){
        passwordField.sendKeys(text);
    }
    public void enterDataToConfirmPasswordField(String text){
        confirmPasswordField.sendKeys(text);
    }
    public void clickOnSignUpBtn(){
        signUpBtn.click();
    }
    public boolean nameErrorMessageIsShown() {
        nameErrorMessage.isDisplayed();
        return true;
    }
    public boolean emailErrorMessageIsShown() {
        emailErrorMessage.isDisplayed();
        return true;
    }
    public boolean passwordErrorMessageIsShown() {
        passwordErrorMessage.isDisplayed();
        return true;
    }
    public boolean confirmPasswordErrorMessage() {
        confirmPasswordErrorMessage.isDisplayed();
        return true;
    }
    public void open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
    }

}
