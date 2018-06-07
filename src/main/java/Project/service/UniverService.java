package Project.service;

import Project.DAO.UniverDao;
import Project.model.Univer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UniverService {
    
    @Autowired
    private UniverDao univerDao;
    
    @Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
    public List<Univer> loadWeek() {              
        return univerDao.loadWeek();                
    }
     
    @Transactional
    public void saveFreeRooms(Univer univer) {
	univerDao.saveFreeRooms(univer);
    }     
    
}
