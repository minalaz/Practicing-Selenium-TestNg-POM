package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignUpTests extends BaseTest {
    @Test
public void verifyThatSignUpIsInPageUrl(){
    getSignupPage().open();
    Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));}

    @Test
    public void verifyThatEmailHasEmailValueAsTypeAtribute(){
        getSignupPage().open();
        Assert.assertEquals(getDriver().findElement(By.id("email")).getAttribute("type"),"email");
    }
    @Test
    public void verifyThatPasswordHasPasswordValueAsTypeAtribute(){
        getSignupPage().open();
        Assert.assertEquals(getDriver().findElement(By.id("password")).getAttribute("type"),"password");
    }
    @Test
    public void verifyThatLeavingAllInputsEmptyWillNotAllowCustomerToSignUp() {
        getSignupPage().open();
        getSignupPage().clickSignUPBtn();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://vue-demo.daniel-avellaneda.com/signup"));
    }
    @Test
    public void  verifYThatEnteringInvalidEmailGivesErrorMesageBelow() {
        getSignupPage().open();
        getSignupPage().enterDataToNameField("Sardina");
        getSignupPage().enterDataToEmailField("aaa");
        Assert.assertTrue(getSignupPage().emailErrorMessageIsShown());
    }
    @Test
    public void verifyThatTheUserGetsErrorMessageWithShortPassword(){
        getSignupPage().open();
        getSignupPage().enterDataToNameField("Sardina");
        getSignupPage().enterDataToEmailField("sardinamore3@gmail.com");
        getSignupPage().enterDataToPasswordField("aaa");
        Assert.assertTrue(getSignupPage().passwordErrorMessageIsShown());}
}
















