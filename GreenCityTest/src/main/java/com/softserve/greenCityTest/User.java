package com.softserve.greenCityTest;


public class User {
    private String name;
    private String loginName;
    private String email;
    private String password;
    private String confirmPass;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setLoginName(String loginName){
        this.loginName=loginName;
    }
    public String getLoginName(){
        return loginName;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setconfirmPass(String confirmPass){
        this.confirmPass=confirmPass;
    }
    public String getconfirmPass(){
        return confirmPass;
    }

}
