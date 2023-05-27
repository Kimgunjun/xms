package videogame;

import java.io.Serializable;
import java.util.Scanner;

import exception.UserscoreFormatException;

public abstract class Videogame implements VideogameInput, Serializable { 

	protected GameKind kind = GameKind.Puzzle;
	protected String name;
	protected String genre;
	protected String userscore;
	protected int metascore;

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

	public String getUserscore() {
		return userscore;
	}

	public void setUserscore(String userscore) throws UserscoreFormatException {
		if(!userscore.contains("%") && !userscore.equals("")) {
			throw new UserscoreFormatException();
		}
		
		this.userscore = userscore;
	}

	public int getMetascore() {
		return metascore;
	}

	public void setMetascore(int metascore) {
		this.metascore = metascore;
	}
	
	public Videogame() {
	}
	public Videogame(GameKind kind) {
		this.kind = kind;
	}

	public Videogame(GameKind kind, String name, String genre, String userscore, int metascore) {
		this.kind = kind;
		this.name = name;
		this.genre = genre;
		this.userscore = userscore;
		this.metascore = metascore;
	}
	
	public abstract void printInfo();
	
	public void setVideogameName(Scanner input) {
		System.out.print("Videogame Name:");
		String name = input.next();
		this.setName(name);	
	}
	public void setVideogameGenre(Scanner input) {
		System.out.print("Videogame Genre:");
		String genre = input.next();
		this.setGenre(genre);
	}
	public void setVideogameUserScore(Scanner input) {
		String userscore = "";
		while (!userscore.contains("%")) {
		System.out.print("Videogame UserScore:");
		userscore = input.next();
		try {
			this.setUserscore(userscore);
		} catch (UserscoreFormatException e) {
			System.out.println("Incorrect Userscore Format. put the userscore that contain %");
		}
	   }
      }
	public void setVideogameMetaScore(Scanner input) {
		System.out.print("Videogame MetaScore:");
		int metascore = input.nextInt();
		this.setMetascore(metascore);
	}
	  public String getkindString() {
		  String skind = "none";
			switch(this.kind) {
			case Fps:
				skind = "F";
				break;
			case Puzzle:
				skind = "P";
				break;
			case Rpg:
				skind = "R";
				break;
				default:
			}
		  return skind;
	  }
 
}
    
