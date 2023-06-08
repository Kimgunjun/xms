package gui;

import java.awt.Component;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import videogame.VideogameInput;
import manager.VideogameManager;

public class VideogameViewer extends JPanel {
	
	WindowFrame frame;
	
	VideogameManager videogameManager;

	public VideogameViewer(WindowFrame frame, VideogameManager videogameManager) {
		this.frame = frame;
		this.videogameManager = videogameManager;
		
		System.out.println("***" + videogameManager.size() + "***");
		
	    DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("Name");
	    model.addColumn("Genre");
	    model.addColumn("UserScore");
	    model.addColumn("MetaScore");
	    
	    for (int i=0; i< videogameManager.size(); i++) {
	    	Vector row = new Vector();
	    	VideogameInput vi = videogameManager.get(i);
	    	row.add(vi.getName());
	    	row.add(vi.getGenre());
	    	row.add(vi.getUserscore());
	    	row.add(vi.getMetascore());
	    	model.addRow(row);
	    }
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
