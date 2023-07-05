package tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTests;

public class SignUpTests extends BaseTests {
    @Test
    public void verifyThatSignUpIsInPageUrl(){
        getSignupPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }

    @Test
    public void verifyThatEmailHasEmailValueAsTypeAtribute() {
        getSignupPage().open();
        Assert.assertEquals(getDriver().findElement(By.id("email")).getAttribute("type"), "email");
    }
    @Test
    public void verifyThatLeavingAllInputsEmptyWillNotAllowCustomerToSignUp() {
        getSignupPage().open();
        getSignupPage().clickOnSignUpBtn();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://vue-demo.daniel-avellaneda.com/signup"));
    }
    @Test
    public void verifyThatPasswordHasPasswordValueAsTypeAtribute() {
        getSignupPage().open();
        Assert.assertEquals(getDriver().findElement(By.id("password")).getAttribute("type"), "password");
    }
    @Test
    public void verifYThatEnteringInvalidEmailGivesErrorMesageBelow() {
        getSignupPage().open();
        getSignupPage().enterDataToNameField("Sardina");
        getSignupPage().enterDataToEmailField("eee");
        Assert.assertTrue(getSignupPage().emailErrorMessageIsShown());}

    @Test
    public void verifyThatTheUserGetsErrorMessageWithShortPassword() {
        getSignupPage().open();
        getSignupPage().enterDataToNameField("Sardina");
        getSignupPage().enterDataToEmailField("sardinamore3@gmail.com");
        getSignupPage().enterDataToPasswordField("aaa");
        Assert.assertTrue(getSignupPage().passwordErrorMessageIsShown());

    }
}