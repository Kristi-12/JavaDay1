package Entities;

import java.util.Date;

public class Base {
    public long id ;
    public Date createdAt;
    public Date modifiedAt;


    public Base(){

    }

    public Base(long id , Date createdAt , Date modifiedAt){
        this.id = id;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;

    }

    public long getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
