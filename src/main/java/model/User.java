package model;
 
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

 
@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
 
    // Persistent Fields:
    @Id
    @GeneratedValue
    Long id;
    
    private String userName;
    private String password;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinTable(name = "user_auth",
    	joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
    	inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
    )
    private Role role;
    
    // Constructors:
    public User() {
    }
 
    public User(String userName) {
        this.userName = userName;
    }
 
    // String Representation:
    @Override
    public String toString() {
        return userName;
    }
}