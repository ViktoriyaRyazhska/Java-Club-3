package com.softserve.greenCityTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class App//Sign in
{
    private WebDriver driver;
    private String url="https://ita-social-projects.github.io/GreenCityClient/#/";


     public WebElement signXPath;
     public WebElement signupXPath;
     public WebElement wrapper;
    private WebElement crossBtn;

    public App(WebDriver driver){
        driver.get(url);
        this.driver=driver;
        signXPath=driver.findElement(By.xpath("//a[@role='link']"));
        signupXPath=driver.findElement(By.xpath("//li[@role='link']"));
    }
    public App(){}
    public void selectSignIn(){
        signXPath.click();
        wrapper=driver.findElement(By.cssSelector("div.wrapper"));
        crossBtn=driver.findElement(By.cssSelector("img.cross-btn"));
    }
    public void selectSignUp(){
        signupXPath.click();
        wrapper=driver.findElement(By.cssSelector("div.wrapper"));
        crossBtn=driver.findElement(By.cssSelector("img.cross-btn"));
    }
    public void closeWrapper(){
        crossBtn.click();
    }

}
