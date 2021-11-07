package com.softserve.greenCityTest.workflow;

import com.softserve.greenCityTest.SignUp;
import com.softserve.greenCityTest.UserDataBase;
import org.openqa.selenium.WebDriver;

public class SignUpWF extends SignUp {
    WebDriver driver=super.sendDriver();

    public SignUpWF(){
        super.setUp();
        super.setButtons();
        super.clickSignUp();
        super.setId();
    }

    public void emptyFieldsError(){
        emailClick();
        userNameClick();
        passClick();
        confPassClick();
        submitClick();
        errors();
    }

    public void logUpError(){
        enterEmail(UserDataBase.errorUser());
        enterUserName(UserDataBase.errorUser());
        enterPass(UserDataBase.errorUser());
        enterConfirmPass(UserDataBase.errorUser());
        errors();
    }

    public void badEmailOrPass(){
        enterEmail(UserDataBase.invalidUser());
        enterUserName(UserDataBase.invalidUser());
        enterPass(UserDataBase.invalidUser());
        enterConfirmPass(UserDataBase.invalidUser());
        submitClick();
    }

    public void signUp(){
        enterEmail(UserDataBase.validUserSignUp());
        enterUserName(UserDataBase.validUserSignUp());
        enterPass(UserDataBase.validUserSignUp());
        enterConfirmPass(UserDataBase.validUserSignUp());
        submitClick();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
