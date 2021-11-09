package com.softserve.greenCityTest;

import com.softserve.greenCityTest.workflow.SignUpWF;
import junit.framework.TestCase;
import org.junit.Assert;


public class SignUpTest extends TestCase {

    private SignUpWF signUp;

    public void setUp() throws Exception {
        signUp = new SignUpWF();
        super.setUp();

    }
    public void tearDown(){
        signUp.closeDriver();
    }

    //SignUp empty error field check
    public void testEmptyErr() {
        signUp.emptyFieldsError();
        Assert.assertTrue(signUp.errEmail.isDisplayed());
        Assert.assertTrue(signUp.errUserName.isDisplayed());
        Assert.assertTrue(signUp.errPass.isDisplayed());
        Assert.assertTrue(signUp.errConfirmPass.isDisplayed());

        Assert.assertTrue(signUp.errEmail.getText().contains("Email is required"));
        Assert.assertTrue(signUp.errUserName.getText().contains("User name is required"));
        Assert.assertTrue(signUp.errPass.getText().contains("Password is required"));
        Assert.assertTrue(signUp.errConfirmPass.getText().contains("Password is required"));
    }

    //SignUp incorrect data input error check
    public void testLogUpFieldsError(){
        signUp.logUpError();
        Assert.assertTrue(signUp.errEmail.isDisplayed());
        Assert.assertTrue(signUp.errUserName.isDisplayed());
        Assert.assertTrue(signUp.errPass.isDisplayed());
        Assert.assertTrue(signUp.errConfirmPass.isDisplayed());
    }

    //Already exist user error check
    public void testAlreadyExist() throws InterruptedException {
        signUp.signUpExist();
        Thread.sleep(2000);
        signUp.setAlreadyExistUser();
        Assert.assertTrue(signUp.alreadyExistUser.getText().contains("The user already exists by this email"));
    }


    //Sign up test
    /*public void testSignUp() throws InterruptedException {
        signUp.signUp();
        Thread.sleep(2000);
        Assert.assertTrue(signUp.congrats.getText().contains("Congratulations! You have successfully registered on the site. Please confirm your email address in the email box."));

    }*/

    //SignUpWithGoogle TEST
    public void testGoogleLogUp() throws Exception {
        signUp.logUpWithGoogle();
        Assert.assertTrue(signUp.getUrl().contains("/profile/"));
        System.out.println("Google login :: Checked");
    }



}
