package Project.DAO;

import Project.model.Univer;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOuniverImpl implements UniverDao {
        
        private SessionFactory sessionFactory;
        
        @Autowired
        public DAOuniverImpl (SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }
        
        private Session currentSession() {
            return sessionFactory.openSession();
        } 
    
        
        @Override
        public List<Univer> loadWeek() {     
            Session session = currentSession();
            Query query = session.createQuery("FROM Univer");
            List<Univer> univers = query.list();   
	    return univers;
        }
     
        @Override
        public void saveFreeRooms(Univer univer) {
            Session session = currentSession();
            session.save(univer);
	}      
        
}
