import java.util.ArrayList;
import java.lang.String;
public class JavaBall {

    public static void main(String[] args){
        TeamReader tr = new TeamReader();
        ArrayList<Team> teamList = tr.readInTeams();

        ResultsReader resultsReader = new ResultsReader();
        ArrayList results = resultsReader.readInMatchResults();

        ResultsWriter writer = new ResultsWriter();
        writer.writeResults(results);

        //Team team1 = teamList.get(0);
        //Team team2 = teamList.get(1);

        //System.out.println(team1.name + "  " + team2.name + "  "  + team1.name.compareToIgnoreCase(team2.name));
        //System.out.println(team2.name + "  " + team1.name + "  "  + team2.name.compareToIgnoreCase(team1.name));
        TournamentGenerator tg = new TournamentGenerator();
        ArrayList<Match> matchList = tg.generateTouranment(teamList);
        for (Match m :matchList) {
            System.out.println(m.team1.toString() + "  " + m.team2.toString());
        }
    }

}
