package com.softserve.greenCityTest;


public class UserDataBase {
    public static User errorUser(){
        User u=new User();
        u.setEmail("123");
        u.setLoginName("12");
        u.setName("123");
        u.setPassword("123");
        return u;
    }
    public static User invalidUser(){
        User u =new User();
        u.setEmail("testaccontgs@gmail.com");
        u.setPassword("123456789");
        u.setName("testAccGC");
        u.setLoginName("testAccGC");
        return u;
    }

    public static User validUser(){
        User u =new User();
        u.setEmail("testaccontgs@gmail.com");
        u.setPassword("TestPass22~");
        u.setName("testAccGC");
        u.setLoginName("testAccGC");
        return u;
    }
}
