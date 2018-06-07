package Project.DAO;

import Project.model.Univer;
import java.util.List;

public interface UniverDao {   
    List<Univer> loadWeek();
    void saveFreeRooms(Univer univer); 
    
}
