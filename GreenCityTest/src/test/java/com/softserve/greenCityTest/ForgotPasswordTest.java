package com.softserve.greenCityTest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForgotPasswordTest extends TestCase {
    private WebDriver driver;
    private ForgotPassword forgotPassword;

    public void setUp() throws Exception{
        driver=new FirefoxDriver();
        forgotPassword=new ForgotPassword(driver);
        super.setUp();
    }
    public void tearDown(){
        driver.quit();
    }
    public void testError(){
        WebElement error=forgotPassword.errorCheck();
        Assert.assertTrue(error.isDisplayed());
        Assert.assertTrue(error.getText().contains("Email is required"));
    }
    public void testForgotPass() throws Exception{
        forgotPassword.forgotPass();
        forgotPassword.enterMail();
        forgotPassword.changePass();
    }
}