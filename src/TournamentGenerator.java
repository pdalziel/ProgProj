import java.util.ArrayList;

public class TournamentGenerator {

    public ArrayList<Match> generateTouranment(ArrayList<Team> teamsList){
        ArrayList<Match> matchList = new ArrayList<Match>();
        for (int i = 0; i <teamsList.size() ; i++) {

            for (int j = i+1; j < teamsList.size(); j++) {
                //System.out.println(teamsList.get(i).name + "\t" + teamsList.get(j).name);
                Match match = new Match(teamsList.get(i), teamsList.get(j));
                if (match.team1.name.compareToIgnoreCase(match.team2.name)>0){

                    Team temp = match.team1;
                    match.team1 = match.team2;
                    match.team2 = temp;
        ;
                }
                matchList.add(match);
            }
        }
        return matchList;
    }




}

