package Day4;

public class ODIMatch extends Match {

    public ODIMatch(int currentScore, int target, float currentOver, int over) {
        super(currentScore, target, currentOver, over);
        super.setOver(50);
    }

}