package dex;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.*;

public class SearchFrame {
	private JFrame frame = new JFrame("Search");
	private JTextField input = new JTextField();
	
	public SearchFrame() {
		frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        input.setPreferredSize(new Dimension(400, 50));
		input.setHorizontalAlignment(JTextField.CENTER);
        frame.setVisible(true);
        frame.getContentPane().add(input);
	}
}