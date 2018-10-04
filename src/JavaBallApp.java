import java.util.ArrayList;
import java.lang.String;
import java.util.Collections;
import java.util.Comparator;

public class JavaBallApp {

    public static void main(String[] args){
        TeamReader tr = new TeamReader();
        System.out.println("A change");
        ArrayList<Team> teamList = tr.readInTeams();

        JavaBallGUI gui = new JavaBallGUI(teamList, teamList.size());
        //ResultsReader resultsReader = new ResultsReader();
        //ArrayList results = resultsReader.readInMatchResults();

        //



        TournamentGenerator tg = new TournamentGenerator();
        ArrayList<Match> matchList = tg.generateTouranment(teamList);
        //System.out.println(matchList.size());
    }




}
