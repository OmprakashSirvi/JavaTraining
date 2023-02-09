package Day3;

public class Innings {
    private String teamName;
    private String inningsName;
    private int runs;

    public Innings(String teamName, String inningsName, int runs) {
        this.teamName = teamName;
        this.inningsName = inningsName;
        this.runs = runs;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getInningsName() {
        return this.inningsName;
    }

    public void setInningsName(String inningsName) {
        this.inningsName = inningsName;
    }

    public int getRuns() {
        return this.runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void displayInningsDetail() {
        System.out.println("Name : " + this.teamName);
        System.out.println("Scored : " + this.runs);
        System.out.println(this.inningsName);
        System.out.println(this.inningsName.equals("first") ? "Need " + this.runs + 1 + " to win" : "Match Ended");
    }
}
