package com.softserve.greenCityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SignUp extends App{

    private WebDriver driver;
    private String url="https://ita-social-projects.github.io/GreenCityClient/#/";
    private WebElement mail;
    private WebElement userName;
    private WebElement signupXPath;
    public WebElement errEmail;
    public WebElement errUserName;
    public WebElement errPass;
    public WebElement errConfirmPass;
    private WebElement pass;
    private WebElement confirmPass;
    private WebElement submit;
    private WebElement googleSignUp;


    public SignUp(WebDriver driver){
        driver.get(url);
        this.driver=driver;
        signupXPath=driver.findElement(By.xpath("//li[@role='link']"));
    }

    private void errors(){
        errEmail = driver.findElement(By.id("email-err-msg"));
        errUserName = driver.findElement(By.id("firstname-err-msg"));
        errPass = driver.findElement(By.id("pass-err-msg"));
        errConfirmPass = driver.findElement(By.id("confirm-err-msg"));
    }

    private void connect(){
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

    }

    private void setId(){
        pass = driver.findElement(By.id("password"));
        confirmPass = driver.findElement(By.id("repeatPassword"));
        mail = driver.findElement(By.id("email"));
        userName = driver.findElement(By.id("firstName"));
        submit = driver.findElement(By.xpath("//button[@type='submit']"));
        googleSignUp = driver.findElement(By.xpath("//button[@type='button']"));
    }

    public void setLogUp(){
        connect();
        signupXPath.click();
        setId();
        mail.click();
        mail.clear();
        mail.sendKeys(UserDataBase.validUserSignUp().getEmail());
        userName.sendKeys(UserDataBase.validUserSignUp().getName());
        pass.click();
        pass.clear();
        pass.sendKeys(UserDataBase.validUserSignUp().getPassword());
        confirmPass.sendKeys(UserDataBase.validUserSignUp().getconfirmPass());
        submit.click();
    }

    public void emptyFieldCheck(){
        connect();
        signupXPath.click();
        setId();
        mail.click();
        userName.click();
        pass.click();
        confirmPass.click();
        submit.click();
        errors();
    }

    public void errorCheck(){
        mail.click();
        mail.clear();
        mail.sendKeys(UserDataBase.errorUser().getEmail());
        pass.click();
        pass.clear();
        userName.sendKeys(UserDataBase.errorUser().getName());
        pass.click();
        pass.clear();
        pass.sendKeys(UserDataBase.errorUser().getPassword());
        pass.click();
        pass.clear();
        confirmPass.sendKeys(UserDataBase.errorUser().getconfirmPass());
        errors();
    }

    public void badEmailOrPass(){
        connect();
        signupXPath.click();
        setId();
        mail.click();
        mail.clear();
        mail.sendKeys(UserDataBase.invalidUser().getEmail());
        pass.click();
        pass.clear();
        userName.sendKeys(UserDataBase.invalidUser().getName());
        pass.click();
        pass.clear();
        pass.sendKeys(UserDataBase.invalidUser().getPassword());
        pass.click();
        pass.clear();
        confirmPass.sendKeys(UserDataBase.invalidUser().getconfirmPass());
        submit.click();
    }

}
