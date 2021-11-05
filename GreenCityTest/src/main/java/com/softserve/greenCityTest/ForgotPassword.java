package com.softserve.greenCityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ForgotPassword {
    private WebDriver driver;
    private String url="https://ita-social-projects.github.io/GreenCityClient/#/";
    private WebElement mail;
    private WebElement signXPath;
    private WebElement submit;
    private WebElement forgotPassId;

    String handle;

    public ForgotPassword(WebDriver driver){
        this.driver=driver;
        driver.get(url);
        signXPath=driver.findElement(By.xpath("//a[@role='link']"));
    }
    private void setID(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mail=driver.findElement(By.id("email"));
        submit=driver.findElement(By.xpath("//button[@type='submit']"));
    }
    public WebElement errorCheck(){
        signXPath.click();
        forgotPassId=driver.findElement(By.cssSelector("a.forgot-password"));
        forgotPassId.click();

        setID();
        mail.click();
        submit.click();
        WebElement error=driver.findElement(By.cssSelector("div.validation-email-error"));
        return error;
    }
    public void forgotPass(){
        signXPath.click();
        forgotPassId=driver.findElement(By.cssSelector("a.forgot-password"));
        forgotPassId.click();

        setID();
        mail.click();
        mail.clear();
        mail.sendKeys(UserDataBase.validUser().getEmail());
        submit.click();
    }
    public void enterMail() throws Exception{
        handle=driver.getWindowHandle();
        GMailPage gmp=new GMailPage(this.driver);
        gmp.login();
        gmp.selectEmail();

        //driver.navigate().to("https://mail.google.com/mail/");
    }
    public void changePass(){
        System.out.println(driver.getWindowHandles());
        nextWindow();
        WebElement newPass=driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        WebElement confirmPass=driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']"));

        newPass.click();
        newPass.clear();
        newPass.sendKeys(UserDataBase.validUser().getPassword());
        confirmPass.click();
        confirmPass.clear();
        confirmPass.sendKeys(UserDataBase.validUser().getPassword());

        WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
        btn.click();
    }
    private void nextWindow(){
        String popup;
        Set<String> windList=driver.getWindowHandles();
        System.out.println(windList);

        Iterator<String> it=windList.iterator();
        while(it.hasNext()){
            popup=it.next();
            if (popup!=handle)
                driver.switchTo().window(popup);
        }
    }

}
