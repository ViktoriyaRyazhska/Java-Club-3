package com.softserve.greenCityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class GMailPage {
    private WebDriver driver;
    private String url="https://mail.google.com/mail/";
    private WebElement buttonLogin;
    private WebElement email;
    private WebElement next;
    private WebElement pass;

    public GMailPage(WebDriver driver){
        this.driver=driver;
        driver.navigate().to(url);
    }
    public void setID(){
        buttonLogin=driver.findElement(By.xpath("//a[@data-action='sign in']"));
        email=driver.findElement(By.id("yDmH0d"));
    }
    public void login() throws Exception{

        System.out.println(driver.getWindowHandles());
        buttonLogin=driver.findElement(By.xpath("//a[@data-action='sign in']"));
        buttonLogin.click();
        email=driver.findElement(By.id("identifierId"));
        email.click();
        email.clear();
        email.sendKeys(UserDataBase.googleUser().getEmail());
        next=driver.findElement(By.xpath("//button[@jsname='LgbsSe']"));
        next.click();
        Thread.sleep(2000);//??//
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOf(email));
        pass=driver.findElement(By.xpath("//input[@type='password']"));
        next=driver.findElement(By.xpath("//button[@jsname='LgbsSe']"));

        pass.click();
        pass.clear();
        pass.sendKeys(UserDataBase.googleUser().getPassword());
        next.click();

        try {
            if (driver.findElement(By.xpath("//span[@jsname='V67aGc']")).isDisplayed()) {
                driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
            }
        }
        catch (Exception e){
            System.out.println("No such element :: "+e);
        }
    }
    public void selectEmail(){
        //List<WebElement> mailSender=driver.findElements(By.xpath("//span[contains(text(), 'mailgreencity1')]"));
        List<WebElement> mailTheme=driver.findElements(By.xpath("//span[contains(text(), 'Confirm restoring password')]"));
        mailTheme.get(1).click();

        WebElement butn=driver.findElement(By.xpath("//a[contains(text(),'Change password')]"));
        butn.click();
        System.out.println(driver.getCurrentUrl());
    }
}
