package assignment20;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;


public class Task1 {
    WebDriver driver;
    WebDriverWait wait;
    WebElement name;
    WebElement email;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//minad//Downloads//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }
    @BeforeMethod
    public void beforeEachTest(){
        driver.get("https://vue-demo.daniel-avellaneda.com/signup");
        driver.manage().window().maximize();
    
    }
    @Test
    public void verifyThatSignUpIsInPageUrl(){
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"));
    }
    @Test
    public void verifyThatEmailHasEmailValueAsTypeAtribute(){
        WebElement emailField = driver.findElement(By.id("email"));
        Assert.assertEquals(emailField.getAttribute("type"),"email");
    }
    @Test
    public void verifyThatPasswordHasPasswordValueAsTypeAtribute(){
        Assert.assertEquals(driver.findElement(By.id("password")).getAttribute("type"),"password");
    }

    @Test
    public void verifyThatLeavingAllInputsEmptyWillNotAllowCustomerToSignUp(){
        WebElement signUpBtn = driver.findElement(By.xpath("//button[@type='submit']//span"));
        signUpBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://vue-demo.daniel-avellaneda.com/signup"));

    }
    @Test
    public void verifyThatTheUserGetsErrorMessageWithShortPassword(){
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Sardina");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("sardinamore3@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("aaa");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains (@class , 'v-messages__message')]/preceding::input[@name='password']")));
        WebElement errorMesage = driver.findElement(By.xpath("//div[contains (@class , 'v-messages__message')]/preceding::input[@name='password']"));
        Assert.assertTrue(errorMesage.isDisplayed());

    }





















    @AfterClass
    public void cleanUp(){
        driver.close();

    }








}
