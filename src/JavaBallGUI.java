import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaBallGUI  extends JFrame implements ActionListener {
    private TournamentGenerator tg = new TournamentGenerator();
    private JButton bquit, baddResults, bprocessResults;
    private JTextArea resultsText;

    public JavaBallGUI(ArrayList<Team> teamList, int size){


        setTitle("JavaBall Result");
        setSize(1080,720);
        setLocation(0,0);

        GridLayout glo = new GridLayout(5,2);
        setLayout(glo);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        //Buttons
        bquit = new JButton("QUIT");
        baddResults = new JButton("ADD RESULTS");
        bprocessResults = new JButton("PROCESS RESULTS");
        add(bquit); add(baddResults); add(bprocessResults);
        bquit.addActionListener(this);
        baddResults.addActionListener(this);
        bprocessResults.addActionListener(this);

        // Labels
        resultsText = new JTextArea(size, 5);
        add(resultsText);


        ArrayList<Match> matches = tg.generateTouranment(teamList);
        sortMatchList(matches);
        for(Match m: matches){
            resultsText.append(m.toString());
        }


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bquit) {
            System.exit(0);
        }
        else if (e.getSource() == baddResults) {
            resultsText.setText("");
            ResultsReader reader = new ResultsReader();
            ArrayList<MatchResult> results = reader.readInMatchResults();
            sortResultList(results);

            for(MatchResult matchResult: results){
                resultsText.append(matchResult.toString());
            }
        }
    }
    public void sortMatchList(ArrayList<Match> matchList) {
        Collections.sort(matchList, new Comparator<Match>() {
            @Override
            public int compare(Match o1, Match o2) {
                String o1Team = o1.team1.name;
                String o2Team = o2.team1.name;
                return o1Team.compareToIgnoreCase(o2Team);
            }
        });
        for (Match m :matchList) {
            System.out.println(m.team1.toString() + "  " + m.team2.toString());
        }
    }
    public void sortResultList(ArrayList<MatchResult> resultList) {
        Collections.sort(resultList, new Comparator<MatchResult>() {
            @Override
            public int compare(MatchResult o1, MatchResult o2) {
                String o1Team = o1.team1;
                String o2Team = o2.team1;
                return o1Team.compareToIgnoreCase(o2Team);
            }
        });
        for (MatchResult m :resultList) {
            System.out.println(m.team1.toString() + "  " + m.team2.toString());
        }
    }
}
