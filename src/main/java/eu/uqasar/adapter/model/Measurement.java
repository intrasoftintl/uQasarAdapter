package eu.uqasar.adapter.model;

/*
 * The Measurement represents a key-value pair that consists of
 * an 'interpreted' u-Qasar Metric and its Quantification
 */

public class Measurement {

    private uQasarMetric metric;
    private String measurement;


    public Measurement(uQasarMetric metric, String measurement) {
        this.metric = metric;
        this.measurement = measurement;
    }

    public uQasarMetric getMetric() {
        return metric;
    }

    public String getMeasurement() {
        return measurement;
    }

}
