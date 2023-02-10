package Day4;

abstract public class Match {

    private int currentScore;
    private int target;
    private float currentOver;
    private int over;

    public Match(int currentScore, int target, float currentOver, int over) {
        this.currentScore = currentScore;
        this.target = target;
        this.currentOver = currentOver;
        this.over = over;
    }

    public int getOver() {
        return this.over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getCurrentScore() {
        return this.currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public int getTarget() {
        return this.target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public float getCurrentOver() {
        return this.currentOver;
    }

    public void setCurrentOver(float currentOver) {
        this.currentOver = currentOver;
    }

    public int calculateBalls() {
        int balls = 0;
        int bowledOvers = (int) this.currentOver;
        balls += bowledOvers * 6;
        balls += (this.currentOver - bowledOvers) * 10;
        return balls;
    }

    public float calculateRunRate() {
        return this.currentScore / this.calculateBalls();
    }

    public float requiredRunRate() {
        int remainingBalls = (this.over * 6) - this.calculateBalls();
        int remainingRuns = this.target - this.currentScore;

        return ((float) remainingRuns / remainingBalls) * 6;
    }

    public void display() {
        System.out.println(
                "Need " + (this.target - this.currentScore) + " runs in "
                        + ((this.over * 6) - this.calculateBalls() + " balls\nRequired Run Rate : "
                                + this.requiredRunRate()));
    }
}
