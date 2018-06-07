package Project.DAO;

import Project.model.User;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOuserImpl implements UserDao {
        
        private SessionFactory sessionFactory;
        
        @Autowired
        public DAOuserImpl (SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }
        
        private Session currentSession() {
            return sessionFactory.openSession();
        }

        
        @Override
        public List<User> allUsers() {
            Session session = currentSession();
	    List<User> users = (List<User>) session.createQuery("FROM User").list(); 
	    return users;
        }  
      
        @Override
        public void saveUser(User user) {
            Session session = currentSession();
	    session.save(user);
	}    
    
}
