import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaBallGUI  extends JFrame implements ActionListener {

    private JButton bquit, baddResults, bprocessResults;

    public JavaBallGUI(){

        setTitle("JavaBall Result");
        setSize(500,450);
        setLocation(200,200);

        GridLayout glo = new GridLayout(5,2);
        setLayout(glo);

        bquit = new JButton("QUIT");
        baddResults = new JButton("ADD RESULTS");
        bprocessResults = new JButton("PROCESS RESULTS");
        add(bquit); add(baddResults); add(bprocessResults);
        bquit.addActionListener(this);
        baddResults.addActionListener(this);
        bprocessResults.addActionListener(this);

        setVisible(true);

    }







    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bquit)
            System.exit(0);

    }
}
