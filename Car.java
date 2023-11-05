public class Car extends Vehicle{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car Model: " + model + '\n' + "License Plate: " + plate + '\n';
    }
}
