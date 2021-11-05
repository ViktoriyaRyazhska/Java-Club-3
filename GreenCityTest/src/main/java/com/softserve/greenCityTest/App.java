package com.softserve.greenCityTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class App//Sign in
{
    WebDriver driver=new FirefoxDriver();;


    public WebElement signXPath;
     public WebElement signupXPath;
     public WebElement wrapper;
     private WebElement crossBtn;

    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "E:/Progs/GreenCityTes/GreenCityTest/geckodriver.exe");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        String url = "https://ita-social-projects.github.io/GreenCityClient/#/";
        driver.get(url);
    }

    public App(){}

    public WebDriver sendDriver() {
        return this.driver;
    }

    public void setButtons(){
        signXPath=driver.findElement(By.xpath("//a[@role='link']"));
        signupXPath=driver.findElement(By.xpath("//li[@role='link']"));
    }

    private  void setWrapper(){
        wrapper=driver.findElement(By.cssSelector("div.wrapper"));
        crossBtn=driver.findElement(By.cssSelector("img.cross-btn"));
    }
    public void selectSignIn(){
        signXPath.click();
        setWrapper();
    }
    public void clickSignIn(){
        signXPath.click();
    }
    public void selectSignUp(){
        signupXPath.click();
        setWrapper();
    }
    public void clickSignUp(){
        signupXPath.click();

    }
    public void closeWrapper(){
        crossBtn.click();
    }
    public void closeDriver(){
        driver.quit();
    }

}
