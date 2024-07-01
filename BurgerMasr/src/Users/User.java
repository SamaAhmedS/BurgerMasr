package Users;
import javax.management.relation.Role;

public class User {
    private String username;
    private String password;
    private Role role;
    
    public User(String username,String password, Role role){
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Object getUsername() {
        return username;
    }
 
    public String getPassword() {
        return password;
    }
}
