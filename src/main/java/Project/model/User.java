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
@Table(name = "USERS")
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "USER_ID", unique = true, nullable = false)
    private int id;
    
    @Column(name = "PROFESSOR", nullable = false, length = 50)
    @Size(max = 50, min = 3, message = "{user.professor.empty}")
    private String professor;
    
    @Column(name = "LOGIN", nullable = false, length = 50)
    @Size(max = 50, min = 3, message = "{user.login.empty}")
    private String login;
    
    @Column(name = "PASSWORD", nullable = false, length = 50)
    @Size(max = 50, min = 3, message = "{user.password.empty}")
    private String password;

    public User() {
    }
    
    public User(String professor, String login, String password) {
        this.professor = professor;
        this.login = login;
        this.password = password;
    }
   
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getProfessor() {
        return professor;
    }   
    
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "id=" + id + "; Professor=" + professor + "; login=" + login + "; password=" + password;
    }
    
}
