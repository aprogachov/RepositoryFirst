package Project.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Table(name = "REQUESTS")
public class Request implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "REQUEST_ID", unique = true, nullable = false)
    private int id;
    
    @Column(name = "DISCIPLINE", nullable = false, length = 50)
    @Size(max = 50, min = 3, message = "{request.discipline.empty}")
    private String discipline;   
    
    @Column(name = "GRUPP", nullable = false)
    @Max(value=59, message = "{request.group must less or equal 59}")
    private Integer group;
    
    @Column(name = "PairsInWeek", nullable = false)
    @Max(value=5, message = "{request.pairsInWeek must less or equal 5}")
    private Integer pairsInWeek;
    
    @Column(name = "USERID", nullable = false)
    @Max(value=100, message = "{request.userId must less or equal 100}")
    private Integer userId;

    public Request() {
    }
    
    public Request(String discipline, int group, int pairsInWeek, int userId) {
        this.discipline = discipline;        
        this.group = group;
        this.pairsInWeek = pairsInWeek;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }
        
    public void setId(int id) {
        this.id = id;
    }
    
    public String getDiscipline() {
        return discipline;
    }
    
    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }        
    
    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }  
    
    public Integer getPairsInWeek() {
        return pairsInWeek;
    }
    
    public void setPairsInWeek(Integer pairsInWeek) {
        this.pairsInWeek = pairsInWeek;
    }      
    
    public Integer getUserId() {
        return userId;
    }
        
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
   @Override
    public String toString() {
        return "id=" + id + "; Discipline=" + discipline + "; Group=" + group +
                 "; PairsInWeek=" + pairsInWeek + "; userId=" + userId;
    }
    
}
