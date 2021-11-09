package com.softserve.greenCityTest.workflow;

import com.softserve.greenCityTest.SignIn;
import com.softserve.greenCityTest.UserDataBase;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SignInWF extends SignIn {
    WebDriver driver=super.sendDriver();

    public SignInWF(){
        super.setUp();
        super.setButtons();
        super.clickSignIn();
        super.setId();
    }

    public void emptyFieldsError(){
        emailClick();
        passClick();
        submitClick();
        errors();
    }
    public void loginError(){
        enterEmail(UserDataBase.errorUser());
        enterPass(UserDataBase.errorUser());
        errors();
    }
    public void signIn(){
        enterEmail(UserDataBase.validUser());
        enterPass(UserDataBase.validUser());
        submitClick();
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.urlContains("/profile/"));
    }
    public void badEmail(){
        enterEmail(UserDataBase.invalidUser());
        enterPass(UserDataBase.invalidUser());
        submitClick();
        setBadErr();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }

    //Google login sequence

    public void loginWithGoogle() throws Exception{
        clickGoogle();
        Thread.sleep(2000);


        String winHand =driver.getWindowHandle();
        nextWindow();
        System.out.println(driver.getCurrentUrl());

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait webWait=new WebDriverWait(driver,5);
        webWait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
        WebElement gmail=driver.findElement(By.id("identifierId"));
        gmail.click();
        gmail.clear();
        gmail.sendKeys(UserDataBase.googleUser().getEmail());
        WebElement next=driver.findElement(By.xpath("//button[@jsname='LgbsSe']"));
        next.click();

        System.out.println(driver.getCurrentUrl());
        WebDriverWait ww=new WebDriverWait(driver,20);
        ww.until(ExpectedConditions.stalenessOf(gmail));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement gpass=driver.findElement(By.xpath("//input[@jsname='YPqjbf']"));
        gpass.click();
        gpass.clear();
        gpass.sendKeys(UserDataBase.googleUser().getPassword());
        next=driver.findElement(By.xpath("//button[@jsname='LgbsSe']"));
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

    private void previousWindow(String s){
        driver.switchTo().window(s);
    }

}
