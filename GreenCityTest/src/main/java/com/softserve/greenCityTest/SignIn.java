
package com.softserve.greenCityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SignIn extends App {
    private WebDriver driver;
    private String url="https://ita-social-projects.github.io/GreenCityClient/#/";
    private WebElement mail;
    private WebElement signXPath;
    public WebElement errEmail;
    public WebElement errPass;
    private WebElement pass;
    private WebElement submit;
    private WebElement google;


    public SignIn(WebDriver driver){
        driver.get(url);
        this.driver=driver;
        signXPath=driver.findElement(By.xpath("//a[@role='link']"));
    }

    private void errors(){
      errEmail= driver.findElement(By.id("email-err-msg"));
      errPass=driver.findElement(By.id("pass-err-msg"));
    }
    private void connect(){
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

   }
   private void setId(){
       pass=driver.findElement(By.id("password"));
       mail=driver.findElement(By.id("email"));
       submit=driver.findElement(By.xpath("//button[@type='submit']"));
       google=driver.findElement(By.xpath("//button[@type='button']"));
   }
    public void setLogin(){
        connect();
        signXPath.click();
        setId();
        mail.click();
        mail.clear();
        mail.sendKeys(UserDataBase.validUser().getEmail());
        pass.click();
        pass.clear();
        pass.sendKeys(UserDataBase.validUser().getPassword());
        submit.click();
    }
    public void loginWithGoogle() throws Exception{
        connect();
        signXPath.click();
        setId();
        google.click();
        Thread.sleep(2000);
        String winHand =driver.getWindowHandle();
        nextWindow();

        WebElement gmail=driver.findElement(By.id("identifierId"));
        gmail.click();
        gmail.clear();
        gmail.sendKeys(UserDataBase.googleUser().getEmail());
        WebElement next=driver.findElement(By.xpath("//button[@jsname='LgbsSe']"));
        next.click();
        Thread.sleep(2000);

        WebElement gpass=driver.findElement(By.xpath("//input[@type='password']"));
        gpass.click();
        gpass.clear();
        gpass.sendKeys(UserDataBase.googleUser().getPassword());
        next=driver.findElement(By.xpath("//button[@jsname='LgbsSe']"));
        next.click();
        Thread.sleep(2000);

        previousWindow(winHand);
    }
    private void nextWindow(){
        String popup="";
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
    public void emptyFieldCheck(){
        connect();
        signXPath.click();
        setId();
        mail.click();
        pass.click();
        mail.click();
        errors();
    }
    public void errorCheck(){
        mail.click();
        mail.clear();
        mail.sendKeys(UserDataBase.errorUser().getEmail());
        pass.click();
        pass.clear();
        pass.sendKeys(UserDataBase.errorUser().getPassword());
        errors();
    }
    public void badEmailOrPass(){
        connect();
        signXPath.click();
        setId();
        mail.click();
        mail.clear();
        mail.sendKeys(UserDataBase.invalidUser().getEmail());
        pass.click();
        pass.clear();
        pass.sendKeys(UserDataBase.invalidUser().getPassword());
        submit.click();
    }
}
