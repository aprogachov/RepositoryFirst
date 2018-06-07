package Project.DAO;

import Project.model.User;
import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void saveUser(User user);   
    
}
