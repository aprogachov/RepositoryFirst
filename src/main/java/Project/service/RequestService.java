package Project.service;

import Project.DAO.RequestDao;
import Project.model.Request;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RequestService {
    
    @Autowired
    private RequestDao requestDao;   

    @Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
    public List<Request> allRequests() {              
        return requestDao.allRequests();                
    }
    
    @Transactional
    public void saveRequest(Request request) {
	requestDao.saveRequest(request);
    }      
    
}
