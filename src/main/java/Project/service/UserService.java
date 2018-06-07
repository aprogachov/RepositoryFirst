package Project.service;

import Project.DAO.UserDao;
import Project.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    
    @Autowired
    private UserDao userDao; 
    
    @Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
    public List<User> allUsers() {
        return userDao.allUsers();
    }   
    
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }       
    
}
