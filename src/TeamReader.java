import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TeamReader {

    private String fileName = "TeamsIn.txt";
    ArrayList<Team> teamList = new ArrayList<Team>();
    public ArrayList<Team> readInTeams() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String name;
            while ((name = br.readLine()) != null) {
                Team team = new Team(name);
                teamList.add(team);
                //System.out.println("added: " + team.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return teamList;
    }

}