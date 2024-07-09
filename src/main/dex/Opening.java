import javax.swing.*;
import java.awt.event.*;

public class Opening {
    private JFrame frame = new JFrame("Welcome");
    private JButton search = new JButton("Search");

    public Opening(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
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
