package com.web.springboot.demo.services;

import com.web.springboot.demo.entites.Spid;
import com.web.springboot.demo.entites.Status;
import com.web.springboot.demo.entites.User;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SpidService extends Spid{
    public Spid createSPID(long id , Date createdAt , Date modifiedAt , String description , User user , Status status) {
        Spid newSpid = new Spid(id ,createdAt , modifiedAt , description , user , status );
        return newSpid;
    }

}
