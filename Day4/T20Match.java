package Day4;

public class T20Match extends Match {
    public T20Match(int currentScore, int target, float currentOver, int over) {
        super(currentScore, target, currentOver, over);
        super.setOver(20);
    }
}
