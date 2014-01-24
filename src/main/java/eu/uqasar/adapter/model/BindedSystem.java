package eu.uqasar.adapter.model;


import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: eleni
 * Date: 1/13/14
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class BindedSystem implements Serializable {

    private int id;
    private String uri;
    private int id_type;

    private User user;

    public BindedSystem() {
    }

    public BindedSystem(int id, String uri, int id_type) {
        this.id = id;
        this.uri = uri;
        this.id_type = id_type;
    }

    public BindedSystem(String uri, int id_type) {
        this.uri = uri;
        this.id_type = id_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }




}
