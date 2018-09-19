import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;


public class TeamReader {

    private String fileName = "TeamsIn.txt";


    private  ArrayList<Team> teamList = new ArrayList<Team>();

    public ArrayList<Team> readInTeams() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String name;
            while ((name = br.readLine()) != null) {
                Team team = new Team(name);
                teamList.add(team);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return teamList;
    }

}