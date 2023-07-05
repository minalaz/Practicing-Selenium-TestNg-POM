package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.SignUpPage;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class BaseTests {
   private WebDriver driver;
   private WebDriverWait wait;
   private SignUpPage signUpPage;
   @BeforeClass
   public void setUp(){
       System.setProperty("webdriver.chrome.driver", "C://Users//minad//Downloads//chromedriver_win32//chromedriver.exe");
       driver = new ChromeDriver();
       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       signUpPage = new SignUpPage(driver, wait);
   }
    @BeforeMethod
    public void beforeEachTest(){
        getDriver().manage().window().maximize();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public SignUpPage getSignupPage(){
        return this.signUpPage;
    }
    @AfterClass
    public void cleanUp(){
        driver.close();
    }







}

