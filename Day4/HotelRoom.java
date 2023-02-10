package Day4;

public class HotelRoom {
    private String hotelName;
    private int numberOfSquareFeet;
    private boolean hasTV;
    private boolean hasWifi;
    private int ratePerSquareFeet;

    public int getRatePerSquareFeet() {
        return this.ratePerSquareFeet;
    }

    public void setRatePerSquareFeet(int ratePerSquareFeet) {
        this.ratePerSquareFeet = ratePerSquareFeet;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getNumberOfSquareFeet() {
        return this.numberOfSquareFeet;
    }

    public void setNumberOfSquareFeet(int numberOfSquareFeet) {
        this.numberOfSquareFeet = numberOfSquareFeet;
    }

    public boolean isHasTV() {
        return this.hasTV;
    }

    public boolean getHasTV() {
        return this.hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public boolean isHasWifi() {
        return this.hasWifi;
    }

    public boolean getHasWifi() {
        return this.hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public int calculateTarrif() {
        return this.numberOfSquareFeet * this.ratePerSquareFeet;
    }

    public HotelRoom(String hotelName, int numberOfSquareFeet, boolean hasTV, boolean hasWifi) {
        this.hotelName = hotelName;
        this.numberOfSquareFeet = numberOfSquareFeet;
        this.hasTV = hasTV;
        this.hasWifi = hasWifi;
    }

}
