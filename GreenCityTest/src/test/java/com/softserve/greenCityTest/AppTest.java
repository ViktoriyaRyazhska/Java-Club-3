package com.softserve.greenCityTest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest extends TestCase {

    private WebDriver driver;
    private App page;

    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:/Progs/GreenCityTes/GreenCityTest/geckodriver.exe");
        driver=new FirefoxDriver();
        page =new App(driver);
        super.setUp();
    }
    public void tearDown(){
        driver.quit();
    }
    public void testMain(){
        Assert.assertTrue(page.signXPath.isDisplayed());
        System.out.println("Sign in button is displayed");
        Assert.assertTrue(page.signupXPath.isDisplayed());
        System.out.println("Sign up button is displayed");
        page.selectSignIn();
        Assert.assertTrue(page.wrapper.isDisplayed());
        System.out.println("Sign In Wrapper is displayed");
        page.closeWrapper();

        page.selectSignUp();
        Assert.assertTrue(page.wrapper.isDisplayed());
        System.out.println("Sign Up Wrapper is displayed");
    }
}