package com.softserve.greenCityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SignUp extends App {

    WebDriver driver=super.driver;
    private WebElement mail;
    private WebElement userName;
    public WebElement errEmail;
    public WebElement errUserName;
    public WebElement errPass;
    public WebElement errConfirmPass;
    private WebElement pass;
    private WebElement confirmPass;
    private WebElement submit;
    private WebElement googleSignUp;
    public WebElement badErr;
    public WebElement alreadyExistUser;
    public WebElement congrats;

    public SignUp() {
    }

    public WebDriver sendDriver() {
        return this.driver;
    }

    public void emailClick() {
        mail.click();
    }

    public void userNameClick() {
        userName.click();
    }

    public void passClick() {
        pass.click();
    }

    public void confPassClick() {
        confirmPass.click();
    }

    public void submitClick() {
        submit.click();
    }

    public void enterEmail(User u) {
        mail.click();
        mail.clear();
        mail.sendKeys(u.getEmail());
    }

    public void enterUserName(User u) {
        userName.click();
        userName.clear();
        userName.sendKeys(u.getName());
    }

    public void enterPass(User u) {
        pass.click();
        pass.clear();
        pass.sendKeys(u.getPassword());
    }

    public void enterConfirmPass(User u) {
        confirmPass.click();
        confirmPass.clear();
        confirmPass.sendKeys(u.getConfirmPass());
    }

    //

    public void setId() {
        pass = this.driver.findElement(By.id("password"));
        confirmPass = this.driver.findElement(By.id("repeatPassword"));
        mail = this.driver.findElement(By.id("email"));
        userName = this.driver.findElement(By.id("firstName"));
        submit =  this.driver.findElement(By.xpath("//button[@type='submit']"));
        googleSignUp =  this.driver.findElement(By.xpath("//button[@type='button']"));
    }

    public void setCongratsMsg(){
        congrats = this.driver.findElement(By.xpath("//div[@class = 'mat-simple-snackbar ng-star-inserted']"));
    }

    public void setAlreadyExistUser(){
        alreadyExistUser = this.driver.findElement(By.xpath("//div[@class = 'error-message error-message-show ng-star-inserted']"));
    }

    public void setBadErr(){ badErr=this.driver.findElement(By.cssSelector("div.alert-general-error"));
    }

    public void errors() {
        errEmail = driver.findElement(By.id("email-err-msg"));
        errUserName = driver.findElement(By.id("firstname-err-msg"));
        errPass = driver.findElement(By.id("password-err-msg"));
        errConfirmPass = driver.findElement(By.id("confirm-err-msg"));
    }

    public void clickGoogle(){
        googleSignUp.click();
    }

}



