package ponomarenko;

// Класс для пациента, наследующийся от класса Person
class Patient extends Person {

    public Patient(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', age=" + age + "}";
    }
}
