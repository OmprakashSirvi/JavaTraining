package Day4;

public class TwoWheeler extends Vehicle {
    private boolean hasKick;

    public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean hasKick) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.hasKick = hasKick;
    }

    public boolean getHasKick() {
        return this.hasKick;
    }

    public void setHasKick(boolean hasKick) {
        this.hasKick = hasKick;
    }

    public String displayDetailInfo() {
        if (this.hasKick)
            return "Side kick available : YES";
        else
            return "Sidekick available : No";
    }

    @Override
    public String toString() {
        return "**" + this.getMake() + "**\n---Basic information---\n" + "Fuel capacity : " + this.getFuelCapacity()
                + "\nFuel Type : " + this.getFuelType() + "\nCC : " + this.getCc() + "\n---Detail Information---\n"
                + displayDetailInfo();
    }

}
