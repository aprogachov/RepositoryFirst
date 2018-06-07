package Project.DAO;

import Project.model.Request;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOrequestImpl implements RequestDao {
        
        private SessionFactory sessionFactory;
        
        @Autowired
        public DAOrequestImpl (SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }
        
        private Session currentSession() {
            return sessionFactory.openSession();
        }    
        
        
        @Override
        public List<Request> allRequests() {   
            Session session = currentSession();
            Query query = session.createQuery("FROM Request");
            List<Request> requests = query.list();             
	    return requests;
        }

        @Override
        public void saveRequest(Request request) {
            Session session = currentSession();
	    session.save(request);
	}    
              
}
