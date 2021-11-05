package com.softserve.greenCityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;

import java.util.List;


public class SignIn extends App {
    WebDriver driver=super.sendDriver();
    private WebElement mail;
    public WebElement errEmail;
    public WebElement errPass;
    private WebElement pass;
    private WebElement submit;
    private WebElement google;
    public WebElement badErr;


    public SignIn(){
    }

    @Override
    public WebDriver sendDriver(){
        return this.driver;
    }
    public void emailClick(){
        mail.click();
    }
    public void passClick(){
        pass.click();
    }
    public void submitClick(){
        submit.click();
    }
    public void enterEmail(User u){
        mail.click();
        mail.clear();
        mail.sendKeys(u.getEmail());
    }
    public void enterPass(User u){
        pass.click();
        pass.clear();
        pass.sendKeys(u.getPassword());
    }
    public List<WebElement> elementsSet(){
        setId();
        List<WebElement> list=new ArrayList<>();
        list.add(mail);
        list.add(pass);
        list.add(submit);
        list.add(errEmail);
        list.add(errPass);
        list.add(google);
        return list;
    }

    // Id setters
    public void errors(){
      errEmail=this.driver.findElement(By.id("email-err-msg"));
      errPass=this.driver.findElement(By.id("pass-err-msg"));
         }
    public void setBadErr(){
      badErr=this.driver.findElement(By.cssSelector("div.alert-general-error"));
    }

   public void setId(){
       pass=this.driver.findElement(By.id("password"));
       mail=this.driver.findElement(By.id("email"));
       submit=this.driver.findElement(By.xpath("//button[@type='submit']"));
       google=this.driver.findElement(By.xpath("//button[@type='button']"));
   }
   public void clickGoogle(){
        google.click();
   }
}
