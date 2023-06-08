package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class VideogameAdder extends JPanel {
	
	WindowFrame frame;
	
	public VideogameAdder(WindowFrame frame) {
		this.frame = frame;
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("NAME: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelGenre = new JLabel("Genre: ", JLabel.TRAILING);
		JTextField fieldGenre = new JTextField(10);
		labelGenre.setLabelFor(fieldGenre);
		panel.add(labelGenre);
		panel.add(fieldGenre);
		
		JLabel labelUserscore = new JLabel("Userscore: ", JLabel.TRAILING);
		JTextField fieldUserscore = new JTextField(10);
		labelUserscore.setLabelFor(fieldUserscore);
		panel.add(labelUserscore);
		panel.add(fieldUserscore);
		
		JLabel labelMetascore = new JLabel("Metascore: ", JLabel.TRAILING);
		JTextField fieldMetascore = new JTextField(10);
		labelMetascore.setLabelFor(fieldMetascore);
		panel.add(labelMetascore);
		panel.add(fieldMetascore);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		

		
		this.add(panel);
		this.setVisible(true);
	}

}
