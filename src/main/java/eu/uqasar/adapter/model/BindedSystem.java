package eu.uqasar.adapter.model;

import javax.persistence.*;
import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created with IntelliJ IDEA.
 * User: eleni
 * Date: 1/13/14
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "BindedSystem", catalog = "uQasarAdapter", uniqueConstraints = {
        @UniqueConstraint(columnNames = "uri"),
        @UniqueConstraint(columnNames = "id_type") })
public class BindedSystem implements Serializable {
    //@Transient
    //private User user = null;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name="uri")
    private String uri;

    @Column(name="id_type")
    private int id_type;


    @Transient
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

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "BindedSystem", cascade = CascadeType.ALL)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }




}
