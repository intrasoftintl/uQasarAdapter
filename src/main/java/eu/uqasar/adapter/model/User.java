package eu.uqasar.adapter.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: eleni
 * Date: 1/13/14
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */

public class User implements Serializable {

    private int id;

    private BindedSystem bindedSystem;

    private String username;

    private String password;

    public BindedSystem getBindedSystem() {
        return this.bindedSystem;
    }

    public void setBindedSystem(BindedSystem bindedSystem) {
        this.bindedSystem = bindedSystem;
    }

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