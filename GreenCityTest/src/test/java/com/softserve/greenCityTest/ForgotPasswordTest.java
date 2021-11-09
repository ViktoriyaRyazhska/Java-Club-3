package com.softserve.greenCityTest;

import com.softserve.greenCityTest.workflow.ForgotPasswordWF;
import junit.framework.TestCase;
import org.junit.Assert;

public class ForgotPasswordTest extends TestCase {

    private ForgotPasswordWF forgotPassword;

    public void setUp() throws Exception{
        forgotPassword=new ForgotPasswordWF();
        super.setUp();
    }
    public void tearDown(){
        forgotPassword.closeDriver();
    }
    public void testError(){
        forgotPassword.emptyMailField();
        Assert.assertTrue(forgotPassword.error.isDisplayed());
        Assert.assertTrue(forgotPassword.error.getText().contains("Email is required"));
    }
    public void testForgotPass() throws Exception{
        forgotPassword.changePass();
        Assert.assertTrue(forgotPassword.verificationSignIn().contains("/profile/"));
    }
    public void testWrongEmail(){
        forgotPassword.wrongEmail();
        Assert.assertTrue(forgotPassword.error.isDisplayed());
    }
    public void testEmptyPassFields() throws Exception{
        forgotPassword.emptyFields();
        Assert.assertTrue(forgotPassword.errors.get(0).isDisplayed());
        Assert.assertTrue(forgotPassword.errors.get(0).getText().contains("Password is required"));
        Assert.assertTrue(forgotPassword.errors.get(1).isDisplayed());
        Assert.assertTrue(forgotPassword.errors.get(1).getText().contains("Password is required"));

    }
    public void testPassError() throws Exception{
        forgotPassword.invalidPasswords();
        Assert.assertTrue(forgotPassword.errors.get(0).isDisplayed());
        Assert.assertTrue(forgotPassword.errors.get(0).getText().contains("Password must be at least 8 characters long"));
        Assert.assertTrue(forgotPassword.errors.get(1).isDisplayed());
        Assert.assertTrue(forgotPassword.errors.get(1).getText().contains("Passwords do not match"));
    }
}