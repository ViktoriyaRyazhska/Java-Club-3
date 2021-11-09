package com.softserve.greenCityTest;

import com.softserve.greenCityTest.workflow.SignInWF;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ForgotPassword extends App{
    private WebDriver driver=super.driver;
    private WebElement mail;
    private WebElement submit;
    private WebElement newPass;
    private WebElement confirmPass;
    public  WebElement error;
    public WebElement errorPass;
    public WebElement errorConfirm;
    public List<WebElement> errors;



    public ForgotPassword(){}
    protected void setID(){
        mail=driver.findElement(By.id("email"));
        submit=driver.findElement(By.xpath("//button[@type='submit']"));
    }
    public WebDriver sendDriver(){
        return this.driver;
    }
    public void setErrorID(){
        try {
            error = driver.findElement(By.cssSelector("div.validation-email-error"));
        }
        catch (Exception e){

        }
    }
    public void clickMail(){
        mail.click();
    }
    public void enterMail(User u){
        mail.click();
        mail.clear();
        mail.sendKeys(u.getEmail());
    }
    public void clickSubmit(){
        submit.click();
    }
    public void newPassWrapperID(){
        newPass=driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        confirmPass=driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']"));
        submit=driver.findElement(By.xpath("//button[@type='submit']"));
    }
    public void clickPass(){
        newPass.click();
    }
    public void enterNewPass(User u){
        newPass.click();
        newPass.clear();
        newPass.sendKeys(u.getPassword());
    }
    public void clickConfirmPass(){
        confirmPass.click();
    }
    public void enterConfirmPass(User u){
        confirmPass.click();
        confirmPass.clear();
        confirmPass.sendKeys(u.getPassword());
    }
    public void errors(){
        errors=driver.findElements(By.cssSelector("div.error-message-show"));
        System.out.println(errors);
    }



}
