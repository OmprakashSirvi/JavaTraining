package Day4;

public class FourWheeler extends Vehicle {
    private String audioSystem;
    private int numberOfDoors;

    public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
            int numberOfDoors) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.audioSystem = audioSystem;
        this.numberOfDoors = numberOfDoors;
    }

    public String displayDetailInfo() {
        return "Audio System : " + this.audioSystem + "\nNumber of Doors : " + this.numberOfDoors;
    }

    public String getAudioSystem() {
        return this.audioSystem;
    }

    public void setAudioSystem(String audioSystem) {
        this.audioSystem = audioSystem;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "**" + this.getMake() + "**\n---Basic information---\n" + "Fuel capacity : " + this.getFuelCapacity()
                + "\nFuel Type : " + this.getFuelType() + "\nCC : " + this.getCc() + "\n---Detail Information---\n"
                + displayDetailInfo();
    }
}
