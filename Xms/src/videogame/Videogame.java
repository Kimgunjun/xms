package videogame;

import java.util.Scanner;

public class Videogame {
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
	protected GameKind kind = GameKind.Fps;
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
	
	public void printInfo() {
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
		System.out.println("kind:" + skind + "name :" + name + " genre "+ genre +" userscore :" + userscore + " metascore: " + metascore);
	}
    public void getUserInput(Scanner input) {
    	System.out.print("videogame NAME:");
	    String name = input.next();
	    this.setName(name);
	    
		System.out.println("videogameGenre");
		String genre = input.next();
		this.setGenre(genre);
		
		System.out.println("videogameUserscore");
		int userscore = input.nextInt();
		this.setUserscore(userscore);
		
		System.out.println("videogameMetasore");
		int metascore = input.nextInt();
		this.setMetascore(metascore);
    }
}
    
