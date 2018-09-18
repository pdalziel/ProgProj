public class Match {
    Team team1;
    Team team2;


    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;

        if (team1.name.compareToIgnoreCase(team2.name)>0){
            System.out.println(team1.name.compareToIgnoreCase(team2.name)>0);
            System.out.println(team1.name + " before");
            Team temp = team1;
            team1 = team2;
            team2 = temp;
            System.out.println(team1.name + " after");
        }
    }
}
