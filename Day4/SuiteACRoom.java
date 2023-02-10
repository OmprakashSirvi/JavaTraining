package Day4;

public class SuiteACRoom extends HotelRoom {

    public SuiteACRoom(String hotelName, int numberOfSquareFeet, boolean hasTV, boolean hasWifi) {
        super(hotelName, numberOfSquareFeet, hasTV, hasWifi);
        super.setRatePerSquareFeet(15);
        if (super.getHasWifi())
            super.setRatePerSquareFeet(getRatePerSquareFeet() + 2);
    }

}
