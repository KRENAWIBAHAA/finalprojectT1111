package com.example.myproject;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties

public class User {
    public String name;
    public String email;
    public String age;

    public User(){
    }

    public User(String name,String email,String age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }
}
