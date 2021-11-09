package com.softserve.greenCityTest.workflow;

import com.softserve.greenCityTest.SignUp;
import com.softserve.greenCityTest.UserDataBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SignUpWF extends SignUp {
    WebDriver driver=super.sendDriver();

    public SignUpWF(){
        super.setUp();
        super.setButtons();
        super.clickSignUp();
        super.setId();
    }

    public void emptyFieldsError(){
        emailClick();
        userNameClick();
        passClick();
        confPassClick();
        submitClick();
        errors();
    }

    public void logUpError(){
        enterEmail(UserDataBase.errorUser());
        enterUserName(UserDataBase.errorUser());
        enterPass(UserDataBase.errorUser());
        enterConfirmPass(UserDataBase.errorUser());
        errors();
    }

    public void badEmailOrPass(){
        enterEmail(UserDataBase.invalidUser());
        enterUserName(UserDataBase.invalidUser());
        enterPass(UserDataBase.invalidUser());
        enterConfirmPass(UserDataBase.invalidUser());
        submitClick();
    }

    public void signUp(){
        enterEmail(UserDataBase.validUserSignUp());
        enterUserName(UserDataBase.validUserSignUp());
        enterPass(UserDataBase.validUserSignUp());
        enterConfirmPass(UserDataBase.validUserSignUp());
        submitClick();
        setCongratsMsg();
    }

    public void signUpExist(){
        enterEmail(UserDataBase.validUserSignUp());
        enterUserName(UserDataBase.validUserSignUp());
        enterPass(UserDataBase.validUserSignUp());
        enterConfirmPass(UserDataBase.validUserSignUp());
        submitClick();
        setAlreadyExistUser();
    }

    //Google signup sequence
    public void logUpWithGoogle() throws Exception {
        clickGoogle();
        Thread.sleep(2000);
        String winHand = driver.getWindowHandle();
        nextWindow();
        System.out.println(driver.getCurrentUrl());

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait webWait = new WebDriverWait(driver, 5);
        webWait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
        WebElement gmail = driver.findElement(By.id("identifierId"));
        gmail.click();
        gmail.clear();
        gmail.sendKeys(UserDataBase.googleUser().getEmail());
        WebElement next = driver.findElement(By.xpath("//button[@jsname='LgbsSe']"));
        next.click();

        System.out.println(driver.getCurrentUrl());
        WebDriverWait ww = new WebDriverWait(driver, 20);
        ww.until(ExpectedConditions.stalenessOf(gmail));


        WebElement gpass = driver.findElement(By.xpath("//input[@jsname='YPqjbf']"));
        gpass.click();
        gpass.clear();
        gpass.sendKeys(UserDataBase.googleUser().getPassword());
        next = driver.findElement(By.xpath("//button[@jsname='LgbsSe']"));
        next.click();

        previousWindow(winHand);
        WebDriverWait pw=new WebDriverWait(driver,10);
        pw.until(ExpectedConditions.urlContains("/profile/"));
    }

    private void nextWindow(){
        String popup;
        Set<String> windList=driver.getWindowHandles();
        System.out.println(windList);

        Iterator<String> it=windList.iterator();
        while(it.hasNext()){
            popup=it.next();
            driver.switchTo().window(popup);
        }
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    private void previousWindow(String s){
        driver.switchTo().window(s);
    }
}
