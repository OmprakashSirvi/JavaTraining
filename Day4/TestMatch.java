package Day4;

public class TestMatch extends Match {
    public TestMatch(int currentScore, int target, float currentOver, int over) {
        super(currentScore, target, currentOver, over);
        super.setOver(90);
    }
}
