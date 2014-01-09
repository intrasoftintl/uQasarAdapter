package eu.uqasar.adapter.model;

public class BindedSystem {

    private String id;
    private BindingInformation bindingInformation;
    private Credentials credentials;

    public BindedSystem() {
    }

    public BindedSystem(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public BindingInformation getBindingInformation() {
        return bindingInformation;
    }

    public void setBindingInformation(BindingInformation bindingInformation) {
        this.bindingInformation = bindingInformation;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }


}//EoC BindedSystem
