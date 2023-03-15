package org.example;
import java.util.List;
public class UserManager {
    List<User> users;
    void create(User user){
      users.add(user);
    }
    void update(User user){
        for (User u:users
             ) {
            if(u.getId()==user.getId()){
                u.setUserName(user.getUserName());
                u.setPassword(user.getPassword());
            }
        }


    }
    void delete(int id){
        for (User user:users
             ) {
            if(user.getId()==id){
                user.setDeleted(true);
            }
        }

    }
}
