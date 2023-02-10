package Day4;

public class DeuluxACRoom extends DeuluxRoom {

    public DeuluxACRoom(String hotelName, int numberOfSquareFeet, boolean hasTV, boolean hasWifi) {
        super(hotelName, numberOfSquareFeet, hasTV, hasWifi);
        super.setRatePerSquareFeet(12);
        if (super.getHasWifi())
            super.setRatePerSquareFeet(getRatePerSquareFeet() + 2);
    }

}
