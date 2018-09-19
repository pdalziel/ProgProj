public class Match {
    Team team1;
    Team team2;
    String score;


    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score = "*** no results yet ***";
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return  '\t'+ team1.name + "\t V " + '\t' + team2.name + " \t" + score + '\n';
    }
}
