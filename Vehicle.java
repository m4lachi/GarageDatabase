public class Vehicle {
    protected String plate;

    protected String direction;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "License Plate =" + plate + ", direction='" + direction + '\'' + '}';
    }
}

