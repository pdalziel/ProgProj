import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ResultsReader {

    private String fileName = "ResultsIn.txt";

    ArrayList<MatchResult> resultList = new ArrayList<MatchResult>();

    public ArrayList<MatchResult> readInMatchResults() {
        String team1;
        String team2;
        int team1Goals;
        int team2Goals;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String result;
            while ((result = br.readLine()) != null) {
                String[] arr = result.split(" ");
                team1 = arr[0];
                team1Goals= new Integer(arr[1]);
                team2 = arr[2];
                team2Goals = new Integer(arr[3]);
                MatchResult matchResult = new MatchResult(team1,team2,team1Goals,team2Goals);
                resultList.add(matchResult);
                //System.out.println("added: " + matchResult.toString() );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultList;
    }
}
