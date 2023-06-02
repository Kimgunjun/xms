package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VideogameViewer extends JFrame {

	public VideogameViewer() {
	    DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("Name");
	    model.addColumn("Genre");
	    model.addColumn("UserScore");
	    model.addColumn("MetaScore");
	    model.addColumn("Contact Info.");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setVisible(true);
		
	}

}
