package Project.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "UNIVER")
public class Univer implements Serializable { 
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "UNIVER_ID", unique = true, nullable = false)
    private int id;
    
    @Column(name = "DAY", nullable = false, length = 50)
    @Size(max = 50, min = 3, message = "{univer.day.empty}")
    private String day;  
    
    @Column(name = "FREEROOMS", nullable = false, length = 50)
    @Size(max = 50, min = 3, message = "{univer.freerooms.empty}")
    private String freeRooms;

    public Univer() {
    }
    
    public Univer(String day, String freeRooms) {
        this.day = day;        
        this.freeRooms = freeRooms;
    }
   
    public int getId() {
        return id;
    }
        
    public void setId(int id) {
        this.id = id;
    }
    
    public String getDay() {
        return day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }      
       
    public String getFreeRooms() {
        return freeRooms;
    }

    public void setFreeRooms(String freeRooms) {
        this.freeRooms = freeRooms;
    }    
    
   @Override
    public String toString() {
        return "id=" + id + "; Day=" + day + "; FreeRooms=" + freeRooms;
    }    
    
}
