package com.web.springboot.demo.entites;

import java.util.Date;

public class Spid extends Base{

    public String description;
    private User user ;
    Status status = Status.PENDING;

    public Spid(){

    }

    public Spid (long id , Date createdAt , Date modifiedAt , String description , User user , Status status){
        super(id , createdAt , modifiedAt);
        this.description = description;
        this.user = user;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public Status getStuatus() {
        return status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setStuatus(Status stuatus) {
        this.status = stuatus;
    }
}
