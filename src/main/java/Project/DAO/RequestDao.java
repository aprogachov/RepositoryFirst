package Project.DAO;

import Project.model.Request;
import java.util.List;

public interface RequestDao {   
    List<Request> allRequests();
    void saveRequest(Request request); 
    
}
