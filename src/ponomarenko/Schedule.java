package ponomarenko;

import java.util.ArrayList;
import java.util.List;

class Schedule {
    private Patient patient;
    private List<Drug> drugs;
    private String deliveryTime;

    public Schedule(Patient patient, String deliveryTime) {
        this.patient = patient;
        this.drugs = new ArrayList<>();
        this.deliveryTime = deliveryTime;
    }

    public void addDrug(Drug drug) {
        drugs.add(drug);
    }

    public Patient getPatient() {
        return patient;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "patient=" + patient +
                ", drugs=" + drugs +
                ", deliveryTime='" + deliveryTime + '\'' +
                '}';
    }
}

