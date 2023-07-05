package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Array;
import java.util.List;

import static java.sql.DriverManager.getDriver;

public class SignUpPage extends BasePage{
    private WebElement nameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement confirmPasswordField;
    private WebElement signUpBtn;
    private WebElement nameErrorMessage;
    private WebElement emailErrorMessage;
    private WebElement passwordErrorMessage;
    private WebElement confirmPasswordErrorMessage;


    public SignUpPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public WebElement getNameField(){
        this.nameField= getDriver().findElement(By.id("name"));
        return nameField;
    }
    public WebElement getEmailField() {
        this.emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }
    public WebElement getPasswordField(){
        this.passwordField = getDriver().findElement(By.id("password"));
        return passwordField;}
    public WebElement getConfirmPasswordField() {
        this.confirmPasswordField = getDriver().findElement(By.id("confirmPassword"));
        return confirmPasswordField;}
    public WebElement getSignUpBtn(){
        this.signUpBtn = getDriver().findElement(By.xpath("//button[@type='submit']//span"));
        return signUpBtn;
    }

    public WebElement getNameErrorMessage(){
        this.nameErrorMessage = getDriver().findElement(By.xpath("//div[contains (@class , 'v-messages__message')]/preceding::input[@name='name']"));
        return nameErrorMessage;
    }
    public WebElement getEmailErrorMessage(){
        this.emailErrorMessage = getDriver().findElement(By.xpath("//div[contains (@class , 'v-messages__message')]/preceding::input[@name='email']"));
        return emailErrorMessage;
    }
    public WebElement getPasswordErrorMessage(){
        this.passwordErrorMessage = getDriver().findElement(By.xpath("//div[contains (@class , 'v-messages__message')]/preceding::input[@name='password']"));
        return passwordErrorMessage;
    }
    public WebElement getConfirmPasswordErrorMessage(){
        this.confirmPasswordErrorMessage = getDriver().findElement(By.xpath("//div[contains (@class , 'v-messages__message')]/preceding::input[@name='confirmPassword']"));
        return confirmPasswordErrorMessage;
    }
    public SignUpPage enterDataIntoNameField(String text){
        getNameField().sendKeys(text);
        return this;
    }
    public SignUpPage enterDataIntoEmailField(String text){
        getEmailField().sendKeys(text);
        return this;
    }
    public SignUpPage enterDataIntoPasswordField(String text){
        getPasswordField().sendKeys(text);
        return this;
    }
    public SignUpPage enterDataIntoConfirmPAsswordField(String text){
       getConfirmPasswordField().sendKeys(text);
        return this;
    }
    public SignUpPage clickOnSignUpBtn(){
        getSignUpBtn().click();
        return this;
    }


    public SignUpPage open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
        return this;
    }


}





