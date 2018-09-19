import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class ButtonFrame extends JFrame
            implements ActionListener
    {
        // We need to refer to these objects in
        // actionPerformed
        private JButton button1, button2, button3, button4,
                button5, button6, button7, button8;
        private ArrayList<Match> matchList;

        // The constructor sets up the initial window
        // and then waits for events.
        public ButtonFrame(ArrayList<Match> matchList)
        {
            this.matchList = matchList;
            // set the basic window properties
            setTitle("Button Frame");
            setSize(1080, 720);
            setLocation(0, 0);

            // replace default BorderLayout
// with a 2x2 grid
            GridLayout grid2 = new GridLayout(2,2);
            setLayout(grid2);

            // create the two buttons
            button1 = new JButton("Press Me");
            button2 = new JButton("Sort results");

            // position the buttons on the window.
            add(button1, "Center");
            add(button2, "South");

            // we are going to listen to them.
            button1.addActionListener(this);
            button2.addActionListener(this);

            // illustrating JOptionPane

            String s = JOptionPane.showInputDialog(null,
                    "Type Something");
            System.err.println(s);

            // buttons for the sub-window
            button3 = new JButton("Three");
            button4 = new JButton("Four");
            button5 = new JButton("Five");
            button6 = new JButton("Six");
            button7 = new JButton("Seven");
            button8 = new JButton("Eight");

            // listen to them as well
            button3.addActionListener(this);
            button4.addActionListener(this);
            button5.addActionListener(this);
            button6.addActionListener(this);
            button7.addActionListener(this);
            button8.addActionListener(this);

            // create a sub-window (pan) with
// a GridLayout with 2 rows and 3 columns
            GridLayout grid = new GridLayout(2, 3);
            JPanel pan = new JPanel(grid);
            pan.add(button3);
            pan.add(button4);
            pan.add(button5);
            pan.add(button6);
            pan.add(button7);
            pan.add(button8);

            // add the sub-window to the main window
            add(pan, "West");

            // become visible and wait.
            setVisible(true);
        }

        public void actionPerformed(ActionEvent e)
        {
            // check to see which button the event came from.
            if (e.getSource() == button1)
            {
                System.err.println("Ouch");
                // disable button1, enable button2
                button1.setEnabled(false);
                button2.setEnabled(true);

            }
            else if (e.getSource() == button2)
            {
                System.err.println("Stop It");
                //JavaBallApp.sortMatchList(matchList);
                // disable button2, enable button1
                button1.setEnabled(true);
                button2.setEnabled(false);
            }
            else if (e.getSource() == button3)
                System.err.println("Three");
            else if (e.getSource() == button4)
                System.err.println("Four");
            else if (e.getSource() == button5)
                System.err.println("Five");
            else if (e.getSource() == button6)
                System.err.println("Six");
            else if (e.getSource() == button7)
                System.err.println("Seven");
            else // must be button8
                System.err.println("Eight");
        }

}
