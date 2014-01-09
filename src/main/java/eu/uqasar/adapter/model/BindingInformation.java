package eu.uqasar.adapter.model;
    /*
     *  The class contains the binding information of a system
     */

public class BindingInformation {

    private String URI;

    public BindingInformation(String uri) {
        URI = uri;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }


}//EoClass BindingInformation

