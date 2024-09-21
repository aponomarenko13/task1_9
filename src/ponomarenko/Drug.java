package ponomarenko;

class Drug {
    private String name;
    private String dosage;

    public Drug(String name, String dosage) {
        this.name = name;
        this.dosage = dosage;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    @Override
    public String toString() {
        return "Drug{name='" + name + "', dosage='" + dosage + "'}";
    }
}
