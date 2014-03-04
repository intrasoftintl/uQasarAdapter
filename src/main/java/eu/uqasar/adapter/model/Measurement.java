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
  
    public String toString() {
        return String.format("(%s, %s)", metric, measurement);
    }

    public boolean equals(Object other){
        if (other == this) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        Measurement mOther = (Measurement)other;
        return (metric == mOther.getMetric() && measurement.equals(mOther.getMeasurement()));
    }
}
