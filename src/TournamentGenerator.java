import java.util.ArrayList;

public class TournamentGenerator {

    public ArrayList<Match> generateTouranment(ArrayList<Team> teamsList){
        ArrayList<Match> matchList = new ArrayList<Match>();
        for (int i = 0; i <teamsList.size() ; i++) {

            for (int j = i+1; j < teamsList.size()-1; j++) {
                //System.out.println(teamsList.get(i).name + "\t" + teamsList.get(j).name);
                Match match = new Match(teamsList.get(i), teamsList.get(j));
                matchList.add(match);
            }
        }
        return matchList;
    }




}

