package Day4;

public class DeuluxRoom extends HotelRoom {

    public DeuluxRoom(String hotelName, int numberOfSquareFeet, boolean hasTV, boolean hasWifi) {
        super(hotelName, numberOfSquareFeet, hasTV, hasWifi);
        super.setRatePerSquareFeet(10);
        if (super.getHasWifi())
            super.setRatePerSquareFeet(getRatePerSquareFeet() + 2);
    }

}
