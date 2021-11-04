package java.com.softserve.greenCityTest;

import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class SignInTest extends TestCase
{

    private WebDriver driver;
    private SignIn signIn;

    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:/Progs/GreenCityTes/GreenCityTest/geckodriver.exe");
        driver=new FirefoxDriver();
        signIn =new SignIn(driver);
        super.setUp();
    }
    public void tearDown(){
        driver.quit();
    }

////Login error field check
   public void testEmailErr(){
        signIn.emptyFieldCheck();
        Assert.assertTrue(signIn.errEmail.getText().contains("Email is required"));
        System.out.println(signIn.errEmail.getText()+" :: Checked");

        signIn.errorCheck();

        String expect="Please check that your e-mail address is indicated correctly";
        Assert.assertTrue(signIn.errEmail.getText().contains(expect));
        System.out.println(signIn.errEmail.getText()+" :: Checked");
   }

////Password error field check

   public void testPassErr(){
       signIn.emptyFieldCheck();

       Assert.assertTrue(signIn.errPass.getText().contains("Password is required"));
       System.out.println(signIn.errPass.getText()+" :: Checked");

       signIn.errorCheck();

       String expect="Password must be at least 8 characters long";
       Assert.assertTrue(signIn.errPass.getText().contains(expect));
       System.out.println(signIn.errPass.getText()+" :: Checked");
    }

    public void testSignIn() throws InterruptedException {

        signIn.setLogin();

        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("/profile/"));
        System.out.println("User page :: Checked");
        //driver.findElement(By.cssSelector("name"));
    }
    public void testGoogleSign() throws Exception {

        signIn.loginWithGoogle();
        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("/profile/"));
        System.out.println("Google login :: Checked");
    }
    public void testBadPassOrEmail(){
        signIn.badEmailOrPass();
        WebElement err=driver.findElement(By.cssSelector("div.alert-general-error"));
        Assert.assertTrue(err.isDisplayed());
        System.out.println("Bad email or password is displayed");

    }
}
