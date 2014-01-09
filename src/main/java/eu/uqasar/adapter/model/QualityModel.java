package eu.uqasar.adapter.model;

/*
* Quality Model is a Singleton Class that populates the
* uQasar quality Model. It will substitute the uQsarMetric enumeration
*/
public class QualityModel {

    private static QualityModel instance = null;

    protected QualityModel() {
    }

    public static QualityModel getInstance() {
        if(instance == null) {
            instance = new QualityModel();
        }
        return instance;
    }

    private void populateModel() throws Exception{
        throw new Exception("Not Implemented yet");
    }

    public static void main(String[] args) {
        QualityModel qm = getInstance();





    }


}//EoC QualityModel
