import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.*;

public class Opening {
    private JFrame frame = new JFrame("Welcome");
    private JButton search = new JButton("Search");
    private JButton team = new JButton("Party");

    public Opening(){
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(search);
        frame.add(team);
        search.setPreferredSize(new Dimension(500, 240));;
        team.setPreferredSize(new Dimension(500, 240));
        frame.setVisible(true);
        frame.getContentPane().add(search);

        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new SecondFrame();
			}
        });
    }

    public static void main(String[] args){
        new Opening();
    }
}
