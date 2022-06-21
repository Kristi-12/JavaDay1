package com.web.springboot.demo.entites;

import java.util.Date;
public class User extends Base {
    private String name;
    private String surname;
    private String username;


    public User(){

    }
    
    public User (long id , Date createdAt , Date modifiedAt , String name , String surname , String username ){
        super(id , createdAt , modifiedAt);
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
