package Service;

import Entities.Spid;
import Entities.User;
import Entities.Status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main_Class {

    public static void main (String [] args){


        List <Spid> SpidList = new ArrayList<>();


        //Creating a new user and Spid
        User user = new User (1 , new Date() , new Date() , "Jim" , "Han" , "Jim Han");
        System.out.println("New user was created with username :" + user.getUsername());
        Spid spid = new Spid (1 , new Date() , new Date() ,"Spid 1" ,user , Status.PENDING);
        SpidList.add(spid);

        User user1 = new User (2 , new Date() , new Date() , "Ken", "Jus" ,"Ken Jus");
        System.out.println("New user was created with username :" + user1.getUsername());
        Spid spid1 = new Spid ( 2 , new Date() , new Date() , "Spid 2" , user1 ,Status.PENDING );
        SpidList.add(spid1);




        try {
            SpidList.forEach(spid2 -> {
                System.out.println(spid2.getDescription());
            });
        }
        catch(Exception e) {
            System.out.println("Exception Caught");
        }


        if(spid.getUser() != null){
            System.out.println("User " + spid.getUser().getUsername()  + " is connected to  SPID " + spid.getId());
            spid.setStuatus(Status.APPROVED);
        }else {
            System.out.println("This user doest have any SPID");
            System.out.println(spid.getStuatus());
        }

        if(spid1.getUser() != null){
            System.out.println("User " + spid1.getUser().getUsername() + " is connected to  SPID " + spid1.getId());
            spid1.setStuatus(Status.APPROVED);
        }else {
            System.out.println("This user doest have any SPID");
            System.out.println(spid1.getStuatus());
        }


    }

}
