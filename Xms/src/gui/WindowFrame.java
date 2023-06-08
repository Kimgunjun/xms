package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.VideogameManager;

public class WindowFrame extends JFrame{

	MenuSelection menuselection;
	VideogameAdder videogameadder;
	VideogameViewer videogameviewer;
	VideogameManager videogameManager;	

	public WindowFrame(VideogameManager videogameManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
        this.videogameManager = videogameManager;
		menuselection = new MenuSelection(this);
		videogameadder = new VideogameAdder(this);
		videogameviewer = new VideogameViewer(this, this.videogameManager);

		
		this.add(menuselection);
		
		this.setVisible(true);
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public VideogameAdder getVideogameadder() {
		return videogameadder;
	}

	public void setVideogameadder(VideogameAdder videogameadder) {
		this.videogameadder = videogameadder;
	}

	public VideogameViewer getVideogameviewer() {
		return videogameviewer;
	}

	public void setVideogameviewer(VideogameViewer videogameviewer) {
		this.videogameviewer = videogameviewer;
	}

}
