package videogame;

import java.util.Scanner;

public abstract class Videogame { 
	public GameKind getKind() {
		return kind;
	}

	public void setKind(GameKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getUserscore() {
		return userscore;
	}

	public void setUserscore(int userscore) {
		this.userscore = userscore;
	}

	public int getMetascore() {
		return metascore;
	}

	public void setMetascore(int metascore) {
		this.metascore = metascore;
	}
	protected GameKind kind = GameKind.Puzzle;
	protected String name;
	protected String genre;
	protected int userscore;
	protected int metascore;
	
	public Videogame() {
	}
	public Videogame(GameKind kind) {
		this.kind = kind;
	}

	public Videogame(GameKind kind, String name, String genre, int userscore, int metascore) {
		this.kind = kind;
		this.name = name;
		this.genre = genre;
		this.userscore = userscore;
		this.metascore = metascore;
	}
	
	public abstract void printInfo();
 
}
    
