package eu.uqasar.adapter.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: eleni
 * Date: 1/13/14
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "User", catalog = "uQasarAdapter")
public class User implements Serializable {

    //user id
    private int id;

    private BindedSystem bindedSystem;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public BindedSystem getBindedSystem() {
        return this.bindedSystem;
    }

    public void setBindedSystem(BindedSystem bindedSystem) {
        this.bindedSystem = bindedSystem;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign",
            parameters = @Parameter(name = "property", value = "bindedSystem"))
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public User(String username, String password, int id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}