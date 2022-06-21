package Service;

import Entities.User;


import java.util.Date;


public class UserService {

    public User createUser(long id , Date createdAt , Date modifiedAt , String name , String surname , String username){
        User user = new User(id , createdAt , modifiedAt , name ,surname ,username);
        return user;
    }
}
