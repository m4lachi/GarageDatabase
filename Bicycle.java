public class Bicycle extends Vehicle{
    private int numGear;

    public int getNumGear() {
        return numGear;
    }

    public void setNumGear(int numgeer) {
        this.numGear = numgeer;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "numgeer=" + numGear + ", direction='" + direction + '\'' + '}';
    }
}
