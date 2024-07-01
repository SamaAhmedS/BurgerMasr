package Users;
import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

public class UsersDataBase {
    private List<User> users;
    public UsersDataBase(){
        users = new ArrayList<>();
        // add dumy users
        //User s1 = new User("samaAhmed", " 945645@go67", Role.Customer);
    }
    public User searchUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }


    public void addUser(User user) {
        users.add(user);
        //System.out.println("added successfully");
    }
    
}
