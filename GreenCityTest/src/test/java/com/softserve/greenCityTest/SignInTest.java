package com.softserve.greenCityTest;

import static org.junit.Assert.assertTrue;

import com.softserve.greenCityTest.workflow.SignInWF;
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

    private SignInWF signIn;

    public void setUp() throws Exception {
        signIn=new SignInWF();
        super.setUp();

    }
    public void tearDown(){
        signIn.closeDriver();
    }

////Login error field check
   public void testEmptyErr() {
       signIn.emptyFieldsError();
       Assert.assertTrue(signIn.errEmail.isDisplayed());
       Assert.assertTrue(signIn.errPass.isDisplayed());

       Assert.assertTrue(signIn.errEmail.getText().contains("Email is required"));
       Assert.assertTrue(signIn.errPass.getText().contains("Password is required"));
   }

////Password error field check
   public void testEmailPassErr(){
       signIn.loginError();
       Assert.assertTrue(signIn.errEmail.isDisplayed());
       Assert.assertTrue(signIn.errPass.isDisplayed());
    }

    ////Sign in check
    public void testSignIn() throws InterruptedException {

        signIn.signIn();
        Thread.sleep(2000);
        System.out.println(signIn.getUrl());
        Assert.assertTrue(signIn.getUrl().contains("/profile/"));
        System.out.println("User page :: Checked");
    }

    ////Google sign in check
    public void testGoogleSign() throws Exception {
        signIn.loginWithGoogle();
        Assert.assertTrue(signIn.getUrl().contains("/profile/"));
        System.out.println("Google login :: Checked");
    }

    ////Bad pass or email verification
    public void testBadPassOrEmail(){
        signIn.badEmail();
        Assert.assertTrue(signIn.badErr.isDisplayed());
        System.out.println("Bad email or password is displayed");

    }
}
