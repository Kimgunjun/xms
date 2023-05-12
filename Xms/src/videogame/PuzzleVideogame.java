package videogame;

import java.util.Scanner;

public class PuzzleVideogame extends Videogame implements VideogameInput {
	
	public PuzzleVideogame(GameKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
    	System.out.print("videogame NAME:");
	    String name = input.next();
	    this.setName(name);
	    
		System.out.println("videogameGenre");
		String genre = input.next();
		this.setGenre(genre);
		
	    System.out.println("userscore");
	    int userscore = input.nextInt();
		this.setUserscore(userscore);
		
		System.out.println("videogameMetasore");
		int metascore = input.nextInt();
		this.setMetascore(metascore);
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
		System.out.println("kind:" + skind + "name :" + name + " genre "+ genre +" userscore :" + userscore + " metascore: " + metascore + " parent's userscore :" + userscore + " parent's metascore: " + metascore);
	
}
}
