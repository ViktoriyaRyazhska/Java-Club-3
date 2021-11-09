package com.softserve.greenCityTest.workflow;

import com.softserve.greenCityTest.ForgotPassword;
import com.softserve.greenCityTest.GMailPage;

import com.softserve.greenCityTest.UserDataBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class ForgotPasswordWF extends ForgotPassword {
    private WebDriver driver=super.sendDriver();
    private String handle;

    public ForgotPasswordWF(){
        super.setUp();
        super.setButtons();
        super.clickForgotPass();
        super.setID();
    }
    public void emptyMailField(){
       clickMail();
       clickSubmit();
       setErrorID();
    }
    public void wrongEmail(){
        enterMail(UserDataBase.errorUser());
        clickSubmit();
        setErrorID();
    }
    private void nextWindow() {
        String popup;
        Set<String> windList = driver.getWindowHandles();
        System.out.println(windList);

        Iterator<String> it = windList.iterator();
        while (it.hasNext()) {
            popup = it.next();
            if (popup != handle)
                driver.switchTo().window(popup);
        }
    }
    private void openGoogle() throws Exception{
        handle=driver.getWindowHandle();
        GMailPage gmp=new GMailPage(this.driver);
        gmp.login();
        gmp.selectEmail();
    }
    public void changePass() throws Exception{
        enterMail(UserDataBase.validUser());
        clickSubmit();
        setErrorID();
        if(error!=null)
        {
            closeWrapper();
        }
        WebDriverWait halt=new WebDriverWait(driver,10) ;
        halt.until(ExpectedConditions.stalenessOf(wrapper));
        openGoogle();

        nextWindow();

        newPassWrapperID();
        enterNewPass(UserDataBase.validUser());
        enterConfirmPass(UserDataBase.validUser());
        clickSubmit();
    }
    public void invalidPasswords() throws Exception{
        openGoogle();

        nextWindow();

        newPassWrapperID();
        enterNewPass(UserDataBase.errorUser());
        enterConfirmPass(UserDataBase.invalidUser());
        clickSubmit();
        errors();
    }
    public void emptyFields() throws Exception{
        openGoogle();

        nextWindow();

        newPassWrapperID();
        clickPass();
        clickConfirmPass();
        clickSubmit();
        errors();

    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public String verificationSignIn(){
        SignInWF signInWF=new SignInWF();
        signInWF.signIn();
        String url=signInWF.getUrl();
        signInWF.closeDriver();
        return url;
    }
}
