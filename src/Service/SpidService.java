package Service;

import Entities.Spid;
import Entities.Status;
import Entities.User;

import java.util.Date;

public class SpidService extends Spid{

    public Spid createSPID(long id , Date createdAt , Date modifiedAt , String description , User user , Status status) {
        Spid newSpid = new Spid(id ,createdAt , modifiedAt , description , user , status );
        return newSpid;
    }


}